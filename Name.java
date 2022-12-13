package RecursionAndBacktracking;

import java.util.Scanner;
public class Name {
    public static void printName(String name, int n){
        if(n == 0)
            return;
        System.out.println(name);
        printName(name, n-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your name: ");
        String name = scan.nextLine();
        System.out.println("How many times do you want your name to be printed?");
        int n = scan.nextInt();
        printName(name, n);
        scan.close();
    }
}
