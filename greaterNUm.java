import java.util.Scanner;

public class greaterNUm {
    
//program to find greater number between three digits
    public static void main(String[] args) {

        //take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a:");
        int a = sc.nextInt();

        System.out.print("Enter value of b:");
        int b = sc.nextInt();

        System.out.print("Enter value of c:");
        int c = sc.nextInt();

        //to check value of a

        if((a>b) && (a>c)){
            System.out.println("a is the greater number");
        }
        //to check value of b
        else if(b>c){
            System.out.println("b is the greater number");
        }
        else
        System.out.println("c is the greater number");
    }
}
