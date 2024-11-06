import java.util.Scanner;

public class simpleCalc {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //menu to perform operations

        System.out.println("Simple calculator to perform such operations");
        System.out.println(" 1. Add\n 2. Subtract\n 3. Multiplication\n 4. Division\n 5. Exit");

        System.out.print("Select the operator which you wanna perform:");
        int operator = sc.nextInt();
        
        System.out.print("Enter first value:");
        int a = sc.nextInt();

        System.out.print("Enter second value:");
        int b = sc.nextInt();

         int  c=0;

        switch (operator) {
            case 1:
                System.out.println("Addition of " +a +" and " +b +" is="+(c=a+b));
                break;
            case 2:
                System.out.println("Subtraction of " +a +" and " +b +" is="+(c=a-b));
                break;
            case 3:
                System.out.println("Multiplication of " +a +" and " +b +" is="+(c=a*b));
                break;
            case 4:
                System.out.println("Division of " +a +" and " +b +" is="+(c=a/b));
                break;
            case 5:
                System.out.println("Exited...");
                break;
            default:
            System.out.println("Oops! wrong choice.\n Please enter digit from 1-5.");
                break;
        }
    }
}
