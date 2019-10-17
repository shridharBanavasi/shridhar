import java.util.Scanner;


class Sum{
	public static void main(String[] args){
		int a,b;
		System.out.println("Enter the value of a:");
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		System.out.println("Enter the value of b:");
		b=input.nextInt();
		System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
		
	}//end of main
}