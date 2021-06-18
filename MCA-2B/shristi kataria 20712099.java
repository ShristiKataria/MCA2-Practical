package fibonacci;
import java.util.*;
public class factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
	for(int i=n;i>=1;i--) {
		f*=i;
	}
	System.out.println("The factorial of a number is:"+f);

	}

}
