/***************************************
*	file:Geometry
*	class:CS 141 - Programming and Problem Solving
*
*	assignment: program 2
*	date last modified: 1/24/2017
*
*	purpose: This program prompts the user to chioce a shape and find the area of a Circle, Rectangle or Triangle
*			 while displaying an error if the input is negative or out-of-range.
****************************************/
//public class Geometry
public class Geometry
{
	public static double circleArea(double radius) //Method: circleArea, calculates the area of the Circle
	{
		return Math.PI*radius*radius;
	}

	public static double rectangleArea(double length, double width) //Method: rectangleArea, Calculates the area of the Rectangle
	{
		return length*width;
	}

	public static double triangleArea(double base, double height) //Method: triangleArea, Calculates the area of the Triangle
	{
		return base*height*.5;
	}
}