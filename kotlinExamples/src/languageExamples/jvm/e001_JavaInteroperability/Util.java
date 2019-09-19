package languageExamples.jvm.e001_JavaInteroperability;

@SuppressWarnings("unused")
public class Util {
    public static void printString(String message) {
        System.out.println("printString method called: ");
        System.out.println(message);
    }

    public static int getSquare(int num) {
        return num * num;
    }
}
