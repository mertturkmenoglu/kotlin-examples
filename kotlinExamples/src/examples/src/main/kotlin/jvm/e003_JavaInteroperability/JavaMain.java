package jvm.e003_JavaInteroperability;

import java.util.ArrayList;

public class JavaMain {
    public static void main(String[] args) {
        // Call String extension function like a static function
        KotlinString.stringUpperPrint("java_main");

        ArrayList<String> al = new ArrayList<>();
        al.add("one");
        al.add("two");
        KotlinString.printStrings(al);

        // Create an object of a Kotlin class
        KotlinClass kc = new KotlinClass("Kotlin Class Object", 5);
        kc.printInfo();

        // Properties are defined as val. So only getter methods are defined.
        System.out.println(kc.getName());
        System.out.println(kc.getLevel());
    }
}
