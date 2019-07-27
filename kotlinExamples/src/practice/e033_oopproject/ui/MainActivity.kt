package practice.e033_oopproject.ui

import practice.e033_oopproject.util.AutoPark
import practice.e033_oopproject.util.Date
import practice.e033_oopproject.util.Subscription
import practice.e033_oopproject.util.Time
import practice.e033_oopproject.vehicle.SubscribedVehicle
import java.awt.EventQueue
import java.awt.Toolkit
import javax.swing.*

fun main() {
    EventQueue.invokeLater {
        run {
            try {
                val frame = MainActivity()
                frame.isVisible = true
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}


@SuppressWarnings("serial")
class MainActivity : JFrame() {
    private var contentPane: JPanel
    private lateinit var autoPark: AutoPark

    init {
        defaultCloseOperation = EXIT_ON_CLOSE
        contentPane = JPanel()
        setContentPane(contentPane)

        val kit = Toolkit.getDefaultToolkit()

        val screenSize = kit.screenSize
        val screenHeight = screenSize.height
        val screenWidth = screenSize.width

        setSize(screenWidth / 2, screenHeight / 2)
        setLocation(screenWidth / 4, screenHeight / 4)
        title = "JAVA SEMESTER PROJECT MERT TURKMENOGLU - CAGDAS AYYILDIZ"

        var hourlyFee: String
        var capacity: String

        do {
            hourlyFee = JOptionPane.showInputDialog("Autopark hourly fee: ")
        } while (!Validate.hourlyFee(hourlyFee))

        do {
            capacity = JOptionPane.showInputDialog("Autopark capacity: ")
        } while (!Validate.capacity(capacity))


        try {
            autoPark = AutoPark(hourlyFee.toDouble(), capacity.toInt())
        } catch (e: Exception) {
            e.printStackTrace()
            JOptionPane.showMessageDialog(null, "INVALID VALUES")
        }

        val buttonEnterVehicle = JButton("Enter Vehicle")
        val buttonExitVehicle  = JButton("Exit Vehicle")
        val buttonAddVehicle   = JButton("Add Subscribed Vehicles")
        val buttonViewAutoPark = JButton("View AutoPark")
        val buttonIsSubscribed = JButton("Is Subscribed")
        val buttonIsParked     = JButton("Is Parked")

        contentPane.add(buttonEnterVehicle)
        contentPane.add(buttonExitVehicle)
        contentPane.add(buttonAddVehicle)
        contentPane.add(buttonViewAutoPark)
        contentPane.add(buttonIsSubscribed)
        contentPane.add(buttonIsParked)

        buttonEnterVehicle.addActionListener { vehicleEnters() }
        buttonExitVehicle.addActionListener { vehicleExits() }
        buttonAddVehicle.addActionListener { addVehicle() }
        buttonViewAutoPark.addActionListener { JOptionPane.showMessageDialog(null, autoPark.toString()) }
        buttonIsSubscribed.addActionListener { isSubscribed() }
        buttonIsParked.addActionListener { isParked() }
    }


    private fun vehicleEnters() {
        var plate: String
        var enterHour: String
        var enterMinute: String

        do {
            plate = JOptionPane.showInputDialog("Vehicle plate: ").toString()
        } while (!Validate.plate(plate))

        val possibilities = arrayOf("Yes", "No")
        val isOfficialString = JOptionPane.showInputDialog(null, "Is it Official?:\n", "Status", JOptionPane.PLAIN_MESSAGE, null, possibilities, "official").toString()

        val isOfficial = isOfficialString === "Yes"

        do {
            enterHour = JOptionPane.showInputDialog("Enter hour(Only hour data): ").toString()
        } while (!Validate.hour(enterHour))

        do {
            enterMinute = JOptionPane.showInputDialog("Enter minute(Only minute data): ").toString()
        } while (!Validate.minute(enterMinute))


        val added = autoPark.vehicleEnters(plate, Time(enterHour.toInt(), enterMinute.toInt()), isOfficial)

        JOptionPane.showMessageDialog(null, if (added) "Vehicle added" else "Could not add")
    }

    private fun vehicleExits() {
        var plate: String
        var exitHour: String
        var exitMinute: String

        do {
            plate = JOptionPane.showInputDialog("Vehicle plate: ").toString()
        } while (!Validate.plate(plate))

        do {
            exitHour = JOptionPane.showInputDialog("Exit hour(Only hour data): ").toString()
        } while (!Validate.hour(exitHour))

        do {
            exitMinute = JOptionPane.showInputDialog("Exit minute(Only minute data): ").toString()
        } while (!Validate.minute(exitMinute))

        val checkOut = autoPark.vehicleExits(plate, Time(exitHour.toInt(), exitMinute.toInt()))

        JOptionPane.showMessageDialog(null, if (checkOut) "Exit success" else "Unsuccessful")
    }


    private fun addVehicle() {
        var plate: String
        val dates: Pair<Date, Date> = getDate()
        val subscription: Subscription
        val vehicle: SubscribedVehicle

        do {
            plate = JOptionPane.showInputDialog("Vehicle plate: ").toString()
        } while (!Validate.plate(plate))

        subscription = Subscription(dates.first, dates.second, plate)
        vehicle = SubscribedVehicle(subscription, plate)

        val added = autoPark.addVehicle(vehicle)

        JOptionPane.showMessageDialog(null, if (added) "Vehicle added" else "Unsuccessful")
    }

    private fun isSubscribed() {
        var plate: String

        do {
            plate = JOptionPane.showInputDialog("Vehicle plate: ").toString()
        } while (!Validate.plate(plate))

        val vehicle = autoPark.searchVehicle(plate)

        JOptionPane.showMessageDialog(null, if (vehicle == null) "Not subscribed" else "Subscribed")
    }

    private fun isParked() {
        var plate: String

        do {
            plate = JOptionPane.showInputDialog("Vehicle plate: ").toString()
        } while (!Validate.plate(plate))

        val result = autoPark.isParked(plate)

        JOptionPane.showMessageDialog(null, "Vehicle is${if (result) " " else " not "}parked")
    }


    private fun getDate(): Pair<Date, Date> {
        var beginDay: String
        var beginMonth: String
        var beginYear: String
        var endDay: String
        var endMonth: String
        var endYear: String
        var beginDate: String
        var endDate: String

        do {
            beginDay = JOptionPane.showInputDialog("Beginning day: ").toString()
            beginMonth = JOptionPane.showInputDialog("Beginning month: ").toString()
            beginYear = JOptionPane.showInputDialog("Beginning year: ").toString()

            endDay = JOptionPane.showInputDialog("End day: ").toString()
            endMonth = JOptionPane.showInputDialog("End month: ").toString()
            endYear = JOptionPane.showInputDialog("End year: ").toString()

            beginDate = "$beginDay-$beginMonth-$beginYear"
            endDate = "$endDay-$endMonth-$endYear"
        } while (!Validate.date(beginDate) || !Validate.date(endDate))

        return Pair(Date(beginDay.toInt(), beginMonth.toInt(), beginYear.toInt()),
                Date(endDay.toInt(), endMonth.toInt(), endYear.toInt()))
    }
}
