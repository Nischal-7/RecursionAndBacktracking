package RecursionAndBacktracking;
import java.util.Scanner;
public class Print1toN {
    public static void printNum(int n, int count){
        if(count == n+1)
            return;
        
        System.out.println(count);
        printNum(n, count+1);
        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scan.nextInt();
        printNum(n, 1);
        scan.close();
    }
}
