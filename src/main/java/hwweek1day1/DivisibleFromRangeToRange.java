package hwweek1day1;

import java.util.Scanner;

public class DivisibleFromRangeToRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Get the Input variables
		int input1,input2;
		System.out.print("get the input1 :");
		//Get the variables dynamically using scanner class
		Scanner scan = new Scanner(System.in);
		input1=	scan.nextInt();
		System.out.println("get the input2 :");
		input2= scan.nextInt();
		//using for loop iterate and by using theIf conditions implement the logic
		for (int i = input1;i<input2;i++)
		{
			if(i%3==0) {
				System.out.print(" FIZZ ");
			}else if(i%5==0) {
				System.out.print(" BUZZ ");
			}if(i%3==0 && i%5==0) {
				System.out.print(" FIZZBUZZ ");}
				else
					System.out.print(i+"  ");
		}

	}

}
