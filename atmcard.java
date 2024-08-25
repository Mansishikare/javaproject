package manu;
import java.util.Scanner;
public class atmcard {
	public static void main(String[] args) {
		int cardno;
		int correctpin=12345;
		int pin;
		int count=0;
	
Scanner sc=new Scanner(System.in);
System.out.println("enter your card number:");
int no=sc.nextInt();
		while(count<3) {
			count++;
			
		System.out.println("enter your pin:");
		pin=sc.nextInt();
if(correctpin==pin) {
			System.out.println("welcome..Login succesffuly...!!");
			break;
		}
		else {
			System.out.println("Invalid pin..!!");
			
		}

		}
		
	if(count>=3) {
		System.out.println("pin is inccorect.Your card is blocked...!!");
	}
}
}