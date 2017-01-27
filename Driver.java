/***************************************
*	file:Driver
*	class:CS 141 - Programming and Problem Solving
*
*	assignment: program 2
*	date last modified: 1/24/2017
*
*	purpose: This program prompts the user to chioce a shape and find the area of a Circle, Rectangle or Triangle
*			 while displaying an error if the input is negative or out-of-range.
****************************************/
import java.util.*;

//public class Driver
public class Driver
{	//public method: main, this method loops the area calculation methods until the user quits.
	public static void main(String []args)
	{	//loop while condition is true
		while (1>0)
		{	
			System.out.println("\nGeometry Calculator");
			System.out.println("1. Calculate the Area of a Circle");
			System.out.println("2. Calculate the Area of a Rectangle");
			System.out.println("3. Calculate the Area of a Triangle");
			System.out.println("4. Quit");
			System.out.print("\nEnter your choice (1-4): ");

			Scanner input = new Scanner (System.in);
			double choice = input.nextDouble();
			//if-else decision
			if (choice==1) //output for area of a Circle
			{	
				System.out.print("\nEnter the radius of the Circle: ");
				double radius = input.nextDouble();

				if (radius < 0.00) //catches negative input
				{
					System.out.println("You have entered an invalid number.");
					System.out.println("Please choose the option again and enter only positive numbers.");
				}

				else
				{
					System.out.printf("The area of the Circle is: %.2f\n", Geometry.circleArea(radius));
				}
			}
			//if-else decision
			else if (choice==2) //output for area of the Rectangle
			{
				System.out.print("\nEnter the length of the Rectangle: ");
				double length = input.nextDouble();

				System.out.print("Enter the width of the Rectangle: ");
				double width = input.nextDouble();

				if (length < 0.00 || width < 0.00) //catches negative input, if-else decision
				{
					System.out.println("You have entered an invalid number.");
					System.out.println("Please choose the option again and enter only positive numbers.");
				}

				else
				{
					System.out.printf("\nThe area of the Rectangle is: %.2f\n", Geometry.rectangleArea(length, width));
				}
			}
			//else-if decision
			else if (choice==3) //output for area of Triangle
			{
				System.out.print("\nEnter the base of the Triangle: ");
				double base = input.nextDouble();
				System.out.print("Enter the height of the Triangle: ");
				double height = input.nextDouble();

				if((base < 0.00) || (height < 0.00)) //catches negative input, if-else decision
				{
					System.out.println("You have entered an invalid number.");
					System.out.println("Please choose the option again and enter only positive numbers.");	
				}

				else
				{
					System.out.printf("\nThe area of the Triangle is: %.2f\n", Geometry.triangleArea(base, height));
				}
			}
			//else-if decision
			else if (choice > 4.0 || choice <= 0.0) //catches inputs when out of range
			{
				System.out.println("You have entered an invalid choice. Please try again.");
			}

			else
			{
				System.exit(0);
			}

		}
	}
}