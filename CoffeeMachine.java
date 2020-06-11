package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        int x = scanner.nextInt();
        System.out.println(x);
        System.out.println("For " + x + " cups of coffee you will need:");
        System.out.println(200 * x + " ml of water");
        System.out.println(50 * x + " ml of milk");
        System.out.println(15 * x + " g of coffee beans");



    }
}
