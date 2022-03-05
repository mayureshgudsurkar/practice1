package starts;

import java.util.Scanner;

public class Demo1 {


		public static void main(String[] args) {
			//find Largest Number
			Scanner scan =new Scanner(System.in);
			System.out.println("Enter A variable value ");
			int a=scan.nextInt();
			
			System.out.println("Enter B variable value ");
			int b=scan.nextInt();
		
			System.out.println("Enter C variable value ");
			int c=scan.nextInt();
		
			System.out.println("Enter D variable value ");
			int d=scan.nextInt();
		
			if((a>b)&&(a>c)&&(a>d))
			{
				System.out.println("A is big number");
			}
			else if((b>c)&&(b>d))
			{
				System.out.println("B is Big number");
			}
			else if(c>d)
			{
				System.out.println("C is big number");
			}
			else {
				System.out.println("D is big number");
			}
			

		}

	}
	