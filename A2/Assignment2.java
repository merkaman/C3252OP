/*
Dominique Smith
1/30/2016 
Assignment2.java

//You are the new knight to the round table. Before you may claim your chair
//you must register your information with the heads of Camelot. 
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Assignment2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		
		String name;
		String location;
		int health; //health value
		int battles = 0; //battles done
		int age; //age of user
		double dgold = 0; //decimal precision gold value
		int gold = 0; //integer gold value
		double davggold = 0; //decimal precision gold avg/battle
		int avggold = 0; //integer gold avg/battle
		
		/* Starting Sequence */
		System.out.printf("Welcome to the great land of Camelot!\n");
		System.out.printf("I must update thy information before you can bear your seat at the round table.\n"); 
		System.out.printf("for record, what is thy name?\n");
			name = input.nextLine(); //input name
			System.out.printf("\n");
			System.out.printf("Where dost thou originally hail from?\n");
			location = input.nextLine(); //input location
			System.out.printf("\n");
		System.out.printf("Sir " + name + " of " + location + "!\n");
		System.out.printf("And thy age?\n");
		age = input.nextInt(); //input age
		System.out.printf("\n");
		if (age > 20) //snarky comment if statement
		{
			System.out.printf("Ah " +age+ ", aged like a great ale!\n");
		}
		else
		{			
			System.out.printf("Thou ist " +age+ "? Adventurous youth!\n");
		}
		System.out.printf("How many battles has thou fought?\n");
		battles = input.nextInt(); //input battles
		System.out.printf("\n");
		if (battles > 10) //snarky comment if statement 2
		{
			System.out.printf( battles + " battles! Your steel is well tested sir.\n");
		}
		else
		{
			System.out.printf( battles + " battles? You will meet many more in your stay at Camelot!\n");
		}	
		System.out.printf("How many gold pieces dost though have to thy name?\n");
			dgold = input.nextInt(); //input total gold
			gold = (int) dgold; //cast double gold value to integer
			System.out.printf("\n");
		System.out.printf(gold+ " gold pieces!\n");
		if (battles > gold) //if statement to grab decimal if output avg < 0
		{
			davggold = dgold / battles; //finds avg (double)
			System.out.printf("Poor villages do not make for good pillagings!\n");
			System.out.printf("Thou must have pillaged around " +df.format(davggold)+ " gold pieces per battle!\n");
		}
		else
		{
			avggold = gold / battles; //finds avg (integer)
			System.out.printf("Thou must have pillaged around " +avggold+ " gold pieces per battle!\n");
		}
		System.out.printf(" So preferably on a scale of 1-100, how healthy dost thou feel?\n");
			health = input.nextInt(); //input health points
System.out.printf("\n");			
		if (health >= 80) //snarky comment if statement 3
			{
				System.out.printf("Really, " +health+ "? Healthy as a horse I see!\n"); 
			}
			else
			{
				System.out.printf( health+ "! Be sure to rest at the inn before stepping out!\n");
			}
			/* Print out summary of total given information */
			System.out.printf("\n");
			System.out.printf("I have no further inquiry sir " +name+ ". Thy cooperation is greatly appreciated.\n");
			System.out.printf("So let's see.\n");
			System.out.printf("You are sir " +name+ " from the land " +location+ "!\n");
			System.out.printf("You have stained your steel in " +battles+ " battles and pillaged a grand sum of " +gold+ " gold pieces by the age of " +age+ ".\n");
			System.out.printf("You also have a health level of " +health+ ".\n");
			System.out.printf("Thy title shall now be renewed as great knight " +name+ " of Camelot!\n");
			System.out.printf("Now seize thy quarters at the round table, great knight!\n");
	}
}