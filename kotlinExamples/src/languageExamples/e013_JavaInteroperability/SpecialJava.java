package languageExamples.e013_JavaInteroperability;

public class SpecialJava {
    public static void main(String[] args) {
        double area = KotlinUtilKt.trianglePerimeter(3, 4, 5);
        Integer[] arr = new Integer[3];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i * i;
        }
        KotlinUtilKt.printArray(arr);
    }
}
