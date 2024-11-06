import java.util.Scanner;

public class siCalc {

    //programe to get Simple Intrest
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of p: ");
        int p = sc.nextInt();

        System.out.print("Enter value of r: ");
        int r = sc.nextInt();

        System.out.print("Enter value of t: ");
        int t = sc.nextInt();

        //formula to get SI
        int SI = (p*r*t)/100;
        System.out.println("Simple intrest = "+SI);
    }
}
