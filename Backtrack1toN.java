package RecursionAndBacktracking;
import java.util.Scanner;
public class Backtrack1toN {
    public static void printNum(int n){
        if(n == 0)
            return;
        printNum(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scan.nextInt();
        printNum(n);
        scan.close();
    }
}
