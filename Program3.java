package Programs;
import java.util.Scanner;
public class Program3 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a: ");
	        int a = sc.nextInt();
	        if (a % 2 == 0) {
	            a = a - 1;
	        }
	        for (int i = 0; i < a; i++) {
	            int value = 2 * i + 1;
	            System.out.print(value);
	            if (i != a - 1) System.out.print(", ");
	        }
	    }
	

	    }
	



