import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the flavour you want: ");
        String iceCreamFlavour = keyboard.next();

        switch (iceCreamFlavour) {
            case "Strawberry":
                System.out.println("I will enjoy my strawberry ice cream.");
                break;
            case "Vanilla":
                System.out.println("I will enjoy my vanilla ice cream.");
                break;
            case "Chocolate":
                System.out.println("I will enjoy my chocolate ice cream.");
                break;
            case "Lemon":
                System.out.println("I will enjoy my lemon ice cream.");
                break;
            case "Banana":
                System.out.println("I will enjoy my banana ice cream.");

            default:
                System.out.println("I will have a cup of coffee!");
        }
    }
}
