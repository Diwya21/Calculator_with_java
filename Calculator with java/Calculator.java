import java.util.Scanner;
import java.lang.Math;

public class Calculator{
	public static void main(String [] args) {
		int	operator,n1,n2,result=0;
		System.out.println("1-Add \n2-Substract \n3-Multiply \n4-Divide \n5-Mod \n6-Power");
		System.out.print("Choose Operator: ");
		Scanner sc=new Scanner(System.in);
		operator= sc.nextInt();
		System.out.print("Enter first number : ");
		n1 = sc.nextInt();
		System.out.print("Enter second number : ");
		n2 = sc.nextInt();
		
		switch(operator) {
		case 1: 
			result = n1 + n2;
			break;
		
		case 2:
			result = n1 - n2;
			break;
			
		case 3:
			result = n1 * n2;
			break;
			
		case 4:
			result = n1 / n2;
			break;
			
		case 5:
			result = n1 % n2;
			break;
			
		case 6:
			result = (int) Math.pow(n1 , n2);
			break; 
			
			default:
				System.out.println("Entered operator is not valid");
			}
		System.out.println("Result is : " +result);
	
	}
}