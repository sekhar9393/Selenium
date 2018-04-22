package hwweek1day1;

import java.util.Scanner;

public class Mar15StringPallindrome {

	public static void main(String[] args) {
	//1.Declare the Input String and get the value of the temporary string as empty string that is ""
	String input,reverse;
	reverse="";
	//2. Get the the input from Scanner class and store it in the declared input string variable
	System.out.print("Get the Input  ");
	Scanner scan = new Scanner(System.in);
	input = scan.nextLine();
	//3.Get the size of the string
	int length =input.length();
	//4.Build Logic using for loop
	for(int i=length-1;i>=0;i--)
	{
		reverse=reverse+input.charAt(i);
	}
	//5.Compare the input and reversed input using if condition
	if (input==reverse)
	{
		System.out.println("Given string is a pallindrome");
	}
	else
		System.out.println("Given string is not a pallindrome");
	}
	

}
