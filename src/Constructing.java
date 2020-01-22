public class Constructing {

	public static void main (String[] args){
	  vehicles car = new vehicles(2011, 130000, "Chevy", "HHR", "Red");
	  car.print();
	  vehicles truck = new vehicles();
	  truck.print();
	}
}
