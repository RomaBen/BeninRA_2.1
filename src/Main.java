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
        BonusMilesService service = new BonusMilesService();

        int milesGot, ticketPrice;

        System.out.print("Input the price of your ticket: ");
        ticketPrice = console.nextInt();
        if (ticketPrice < 0) {
            while (ticketPrice < 0) {
                System.out.print("The price of the ticket can not be lower than 0, try again: ");
                ticketPrice = console.nextInt();
            }
        }

        milesGot = service.calculate(ticketPrice);

        System.out.print(milesGot);
        System.out.print(" miles have been added to your account for the last flight.");
    }
}
