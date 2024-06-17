import java.util.*;

;public class Calculation {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 for Additon");
		System.out.println("enter 2 for Subtraction");
		System.out.println("enter 3 for multiplication");
		System.out.println("enter 4 for division");
		System.out.println("enter 5 for modulo");
		int a = sc.nextInt();
		System.out.println("enter two numbers");
		int d = sc.nextInt();
		int b = sc.nextInt();
		double c=0;
		if(a==1) {
		c=d+b;
		    System.out.println(d+b);}
		if(a==2) {
			c=d-b;
			System.out.println(d-b);}
		if(a==3) {
			c=d*b;
			System.out.println(d*b);}
		if(a==4) {
			if(b==0) {
			System.out.println("Undefined");
			}else {
			System.out.println(d/b);}
		}
		if(a==5) {
		 c=d%b;
		   System.out.println(d%b);
		}
						
		}
	}
