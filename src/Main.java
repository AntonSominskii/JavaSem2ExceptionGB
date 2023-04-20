import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных. */

/** Метод "getFractionalNumber" я реализовал в отдельном классе "FractionalNumberInput" */

        float number = FractionalNumberInput.getFractionalNumber();
        System.out.println("Вы ввели: " + number);
        System.out.println("Программа завершена.");

        /* Если необходимо, исправьте данный код:
        Задание 2
    try {
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
    }   */

/** Реализовал код в отдельном классе "ExceptionHandlingTask2" - там я добавил еще два блока catch для
 обработки еще двух возможных исключений: "ArrayIndexOutOfBoundsException" и "Exception".

 Исключение "ArrayIndexOutOfBoundsException" возникает, при попытке получить доступ к
 элементу массива, который находится за его пределами.

 Блок перехвата исключений "Exception" - это универсальный блок перехвата, который будет
 перехватывать любые другие исключения, которые не были перехвачены предыдущими блоками перехвата.
 Это полезно для обработки непредвиденных исключений, которые могут возникнуть, вообщем блок делает
 так, чтобы программа не завершалась сбоем.

 В конце я вывел сообщение: "Программа по задаче 2 завершена", чтобы указать, что программа завершила запуск.
 */

        ExceptionHandlingTask2.runProgram();

     /* Дан следующий код, исправьте его там, где требуется:
     Задание 3

    public static void main(String[] args) throws Exception {
       try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
       } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
       } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
       } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
       System.out.println(a + b);
    }   */


/** Реализовал код в отдельном классе "ExceptionHandlingTask3" - там я внес следующие изменения:

 - Удалил исключение "throws" из сигнатуры метода, поскольку не генерируются проверенные исключения.
 - Заменил блок "Throwable catch" на более нужный блок "ArithmeticException catch" для обработки ошибки деления на ноль.
 - Заменил блок перехвата "IndexOutOfBoundsException" на блок перехвата "ArrayIndexOutOfBoundsException",
 для обработки ошибки выхода индекса массива за его пределы.
 - Добавил общий блок перехвата исключений в конце, чтобы перехватывать любые другие исключения, которые могут возникнуть.
 - В методе "printSum" удалил исключение "throws FileNotFoundException" из сигнатуры метода, поскольку это исключение
 не генерируется.

 С учетом этих изменений код теперь должен работать должным образом и обрабатывать любые исключения,
 которые могут возникнуть во время выполнения.

 В конце я вывел сообщение: "Программа по задаче 3 завершена", чтобы указать, что программа завершила запуск.*/

        ExceptionHandlingTask3.runProgram();

    /* Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */

/** Основную часть кода я реализовал в отдельном классе "StringValidator" */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        StringValidator.processInput(input);

        System.out.println("Программа завершена.");
    }

}