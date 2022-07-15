import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*       Объявляете переменные для входных данных и
         параметров программы: одну для хранения
         стоимости билета, другую для хранения количества
         рублей для одной бонусной милли

         Рассчитываете количество бонусных милль, используя
         значения заведённых переменных. Ответ сохраняете в
         новую переменную и выводите на экран                */

        Scanner console = new Scanner(System.in);

        int mileCounter = 20, milesGot, ticketPrice;

        System.out.print("Input the price of your ticket: ");
        ticketPrice = console.nextInt();
        milesGot = ticketPrice / mileCounter;
        System.out.print(milesGot);
        System.out.print(" miles have been added to your account for the last flight.");
    }
}
