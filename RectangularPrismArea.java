import java.util.Scanner;

public class RectangularPrismArea
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = keyboard.nextLine();
		System.out.println("Hello " + name + ", welcome to rectangular prism calculator.");
		System.out.println("Area of rectangular prism");
		System.out.println("Please enter the measure of the length: ");
		String lengthStr = keyboard.nextLine();
		System.out.println("Please enter the measure of the width: ");
		String widthStr = keyboard.nextLine();
		System.out.println("Please enter the measure of the height: ");
		String heightStr = keyboard.nextLine();
		Double length = Double.parseDouble(lengthStr);
		Double width = Double.parseDouble(widthStr);
		Double height = Double.parseDouble(heightStr);
		System.out.println("Please enter the unit of measure: ");
		String unit = keyboard.nextLine();
		double area = 2*(width*length + height*length + height*width);
		System.out.println("The area of the rectangular prism is " + area + " " + unit + "2.");

	}

}
