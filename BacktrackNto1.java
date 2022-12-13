package RecursionAndBacktracking;
import java.util.Scanner;

public class BacktrackNto1 {
    public static void printNum(int n, int count){
        if(count == n+1)
            return;
        printNum(n, count+1);
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scan.nextInt();
        printNum(n, 1);
        scan.close();
    }
}
