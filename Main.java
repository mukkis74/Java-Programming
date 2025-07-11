import java.util.Scanner;

// Beginning of the main class. The name of the main class and the file should be same.
public class Main {

    // Beginning of main method - a program starts from this method and ends here
    public static void main(String []args) {

        /** TODO 2: Create a Scanner variable named "keyboard" **/
        Scanner keyboard = new Scanner(System.in);

        // 1- is Monday, 2- is Tuesday and so on
        int dayOfTheWeek = 1;

        System.out.println("********** MENU *****************");
        System.out.println("These are the choices for week of the day. \n Please enter only values from 1-7:");
        System.out.println("1. MONDAY");
        System.out.println("2. TUESDAY");
        System.out.println("3. WEDNESDAY");
        System.out.println("4. THURSDAY");
        System.out.println("5. FRIDAY");
        System.out.println("6. SATURDAY");
        System.out.println("7. SUNDAY");
        System.out.println("***********************************");

        System.out.println();
        dayOfTheWeek = keyboard.nextInt();

        switch (dayOfTheWeek) {
            case 1:
                // Submenu for Monday
                System.out.println("*********** SUB MENU FOR MONDAY ******");
                System.out.println("* 1. Yes, I had my breakfast");
                System.out.println("2. No, I would like one");
                System.out.println("**************************************");

                System.out.println();
                int subChoice = keyboard.nextInt();

                switch (subChoice) {
                    case 1:
                        System.out.println("Good. Now you have a catchup meeting at 9AM Prepare your notes");
                        return;
                    case 2:
                        System.out.println("Lets us divert on Highway 54 and have a Burger on the drive in");
                        return;
                    default:
                        System.out.println("NO such choice available");
                        return;
                }

            case 2:
                System.out.println("Tuesday: It is back to work.....");
                break;

            case 3:
                System.out.println("Wednesday: It is back to work.....");
                break;

            case 4:
                System.out.println("Thursday: It is back to work.....");
                break;

            case 5:
                System.out.println("Friday: It is back to work.....");
                break;

            case 6:
                System.out.println("Saturday: It is back to work.....");
                break;

            case 7:
                System.out.println("Sunday: It is back to work.....");
                break;

            default:
                System.out.println("Invalid input - please only use number between 1 - 7");
        }

        /** TODO 11: Display appropriate response to Toni, based on value in **/
        /**          variable subChoice using if, if-else, else **/
        } //end of main method
} // end of the main class