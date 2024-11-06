import java.util.Scanner;

public class oddNum {

    public static void main(String[] args) {
        

        //to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
       
        //check the number is odd or not

        if (n%2!=0) {
            System.out.println("Number is ODD");
        }
        else
        System.out.println("Number is not ODD");
    }
}
