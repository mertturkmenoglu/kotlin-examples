package e040_oopproject.util

import e040_oopproject.vehicle.OfficialVehicle
import e040_oopproject.vehicle.RegularVehicle
import e040_oopproject.vehicle.SubscribedVehicle

class AutoPark(var hourlyFee: Double, var capacity: Int) {
    val subscribedVehicles = ArrayList<SubscribedVehicle>(capacity)
    val parkRecords = ArrayList<ParkRecord>(capacity)
    var incomeDaily = 0.0

    fun searchVehicle(plate: String) = subscribedVehicles.find { it.getPlate() == plate }

    fun isParked(plate: String) = parkRecords.find { it.vehicle?.getPlate() == plate } != null

    fun enlargeVehicleArray() = subscribedVehicles.ensureCapacity(subscribedVehicles.size * 2)

    fun addVehicle(v: SubscribedVehicle): Boolean {
        if (searchVehicle(v.getPlate()) == null)
            return false

        if (!v.getSubscription().isValid())
            return false

        subscribedVehicles.add(v)
        return true
    }

    fun vehicleEnters(plate: String, enter: Time, isOfficial: Boolean): Boolean {
        if (isParked(plate))
            return false

        if (searchVehicle(plate) != null) {
            val vehicle = subscribedVehicles.find { it.getPlate() == plate }!!
            if (vehicle.getSubscription().isValid()) {
                parkRecords.add(ParkRecord(enter, null, vehicle))
                return true
            } else {
                return false
            }
        } else {
            parkRecords.add(ParkRecord(enter, null, if (isOfficial) {
                OfficialVehicle(plate)
            } else {
                RegularVehicle(plate)
            }))
            return true
        }
    }

    fun vehicleExits(plate: String, exit: Time): Boolean {
        val parkRecord = parkRecords.find { it.vehicle?.getPlate() == plate } ?: return false
        val v = parkRecord.vehicle

        if (exit.getDifference(parkRecord.enterTime ?: return false) == -1)
            return false

        if (v is OfficialVehicle) {
            parkRecords.remove(parkRecord)
            return true
        }

        if (v is SubscribedVehicle) {
            if (!v.getSubscription().isValid()) {
                parkRecord.exitTime = exit
                incomeDaily += calculateFee(parkRecord)
                parkRecords.remove(parkRecord)
                subscribedVehicles.remove(v)
            }
            return true
        }

        incomeDaily += calculateFee(parkRecord)
        parkRecords.remove(parkRecord)
        return true
    }

    fun calculateFee(p: ParkRecord) = (p.getParkingDuration() / 60) * hourlyFee

    override fun toString() = "Subscribed Vehicles: $subscribedVehicles\nPark Records: $parkRecords\nFee: $hourlyFee\nIncome: $incomeDaily\nCapacity: $capacity"
}