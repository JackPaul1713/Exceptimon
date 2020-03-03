package exceptimon;

import java.util.Scanner;

public class ExcMain
{
	public static void main(String[] args)
	{
		//var
		Scanner delay = new Scanner(System.in);
		//intro
		System.out.println("EXCEPTIMON");
		System.out.println("");
		System.out.println("Welcome to exceptimon! A game where you gotta catch all the exceptions!");
		System.out.println("Catch all the execptions to win!");
		delay.nextLine();
		//classExc
		try
		{
			Object cow = 1;
			System.out.println((String)cow);
		}
		catch(Exception ClassCastException)
		{
			System.out.print("Wow! A classCastExeption was caught! Gotta catch them all!");
		}
		//nullExc
		delay.nextLine();
		try
		{
			String empty = null;
			String emptyish = empty.substring(1);
		}
		catch(Exception NullPointerException)
		{
			System.out.print("Wow! A nullPointerException was caught! Gotta catch them all!");
		}
		//formatExc
		delay.nextLine();
		try
		{
			String totalyNumb = "abc";
			int numb = Integer.parseInt(totalyNumb);
		}
		catch(Exception NumberFormatException)
		{
			System.out.print("Wow! A numberFormatException was caught! Gotta catch them all!");
		}
		
		//end
		delay.nextLine();
		System.out.println("");
		System.out.println("Congrats, you win!");
		System.out.println("You caught them all!");
	}
}
