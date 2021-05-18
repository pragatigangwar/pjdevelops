
import java.util.Scanner;

class events {
    public int water = 400;
    public int milk = 540;
    public int coffee = 120;
    public int cups = 9;
    public int money = 550;
    public String type;
    Scanner sc = new Scanner(System.in);

    public void remaining() {
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water  \n", water);
        System.out.printf("%d ml of milk  \n", milk);
        System.out.printf("%d g of coffee beans  \n", coffee);
        System.out.printf("%d disposable cups  \n", cups);
        System.out.printf("$%d of money \n", money);
    }

    public void buy(String type) {
        this.type = type;

        if (type.equals("1")) {
            if (water >= 250 && coffee >= 16) {
                System.out.println("I have enough resources, making you a coffee!");
                water = water - 250;
                coffee = coffee - 16;
                money = money + 4;
                cups = cups - 1;
            } else {
                System.out.println("Sorry!not enough resources");
            }
        }
        if (type.equals("2")) {
            if (water >= 350 && coffee >= 20 && milk >= 75) {
                System.out.println("I have enough resources, making you a coffee!");
                water = water - 350;
                coffee = coffee - 20;
                milk = milk - 75;
                money = money + 7;
                cups = cups - 1;
            } else {
                System.out.println("Sorry!not enough resources");
            }
        }
        if (type.equals("3")) {
            if (water >= 200 && coffee >= 20 && milk >= 100) {
                System.out.println("I have enough resources, making you a coffee!");
                water = water - 200;
                coffee = coffee - 12;
                milk = milk - 100;
                money = money + 6;
                cups = cups - 1;
            } else {
                System.out.println("Sorry!not enough resources");
            }
        }
    }

    public void fill() {
        System.out.println("Write how many ml of water you want to add: ");
        int wadd = sc.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        int madd = sc.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        int cbadd = sc.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        int cadd = sc.nextInt();

        water += wadd;
        milk += madd;
        coffee += cbadd;
        cups += cadd;
    }

    public void take() {
        System.out.printf("I gave you $%d \n", money);
        money = 0;
    }
}

public class CoffeeMachine {

    public static void main(String[] args) {
        events obj = new events();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        String s = scanner.next();
        boolean b = true;
        while (b) {

            if (s.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                String type = scanner.next();
                if (type.equals("back")) {
                    System.out.println("Write action (buy, fill, take, remaining, exit): ");

                    s = scanner.next();
                    continue;
                } else {
                    obj.buy(type);
                }
            }

            if (s.equals("fill")) {
                obj.fill();
            }
            if (s.equals("take")) {
                obj.take();
            }
            if (s.equals("remaining")) {
                obj.remaining();
            }
            if (s.equals("exit")) {
                break;
            }
            System.out.println("Write action (buy, fill, take, remaining, exit): ");

            s = scanner.next();
        }

    }
}
