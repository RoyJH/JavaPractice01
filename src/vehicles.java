import java.util.Scanner;
public class vehicles {
	Scanner input = new Scanner(System.in);
	private int year;
	private int mileage;
	private String make;
	private String model;
	private String color;
	
	public int getYear(){
		return year;
	}
	public void setYear(int y){
		year = y;
	}
	public int getMileage(){
		return mileage;
	}
	public void setMileage(int m){
		mileage = m;
	}
	public String getMake(){
		return make;
	}
	public void setMake(String mk){
		make = mk;
	}
	public String getModel(){
		return model;
	}
	public void setModel(String md){
		model = md;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String cl){
		color = cl; 

		}

	vehicles (){
		System.out.println("What's the make of the vehicles?");
		String mk = input.nextLine();
		System.out.println("What model?");
		String md = input.nextLine();
		System.out.println("What color?");
		String cl = input.nextLine();
		System.out.println("Which year was it manufactured?");
		int y = input.nextInt();
		System.out.println("Current mileage?");
		int m = input.nextInt();
		System.out.println ("");
		year = y;
		mileage = m;
		make = mk;
		model = md;
		color = cl;
	}
	vehicles (int y, int m, String mk, String md, String cl)
	{
		year = y;
		mileage = m;
		make = mk;
		model = md;
		color = cl;
		}
	public void print(){
		System.out.println("The make of this vehicles is " + make + ". ");
		System.out.println("Model: " + model);
		System.out.println("Made in the year " + year + ". ");
		System.out.println("With " + mileage + " miles.");
		System.out.println("and it's color is " + color + ". ");
		System.out.println("");
		}
	public void vmenu(){
		int optiona = 0;
	}
}
