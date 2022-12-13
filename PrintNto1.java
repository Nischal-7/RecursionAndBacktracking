package RecursionAndBacktracking;
import java.util.Scanner;
public class PrintNto1 {
    public static void printNum(int n){
        if(n == 0)
            return;
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scan.nextInt();
        printNum(n);
        scan.close();
    }
}
