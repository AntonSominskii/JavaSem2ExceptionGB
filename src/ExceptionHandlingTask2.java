public class ExceptionHandlingTask2 {
    public static void runProgram() {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching ArithmeticException: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching ArrayIndexOutOfBoundsException: " + e);
        } catch (Exception e) {
            System.out.println("Catching Exception: " + e);
        }
        System.out.println("Программа по задаче 2 завершена.");
    }
}
