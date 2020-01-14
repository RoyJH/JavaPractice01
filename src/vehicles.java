
public class vehicles {
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
	public void setColor(String c){
		color = c; 
	}
	vehicles (int y, int m, String mk, String md, String c)
	{
		year = y;
		mileage = m;
		make = mk;
		model = md;
		color = c;
	}
	public void print(){
		System.out.println("The make of this vehicles is " + make + ". ");
		System.out.println("Model: " + model);
		System.out.println("Made in the year " + year + ". ");
		System.out.println("With " + mileage + " miles.");
		System.out.println("and it's color is " + color + ". ");
	}
}
