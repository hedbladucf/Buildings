public class Garage extends Building {
	
	private int cars;
	private int width;
	private int length;
	private FloorCover floorCover;

	public Garage(int cars, int length, int width, FloorCover floorCover) {
		super(0, 1);
		this.cars = cars;
		this.width = width;
		this.length = length;
		this.floorCover = floorCover;
	}
	
	public int getCars() {
		return cars;
	}
	public void setCars(int cars) {
		this.cars = cars;
	}	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public FloorCover getFloorCover() {
		return floorCover;
	}
	public void setFloorCover(FloorCover floorCover) {
		this.floorCover = floorCover;
	}
	
	public double getFloorSpace() {
		double floorSpace;
		floorSpace = this.length * this.width;
		return floorSpace;
	}
	
	public String toString() {
		String str;
		str = super.toString()
				+ "\nThe number of cars in the garage is: " + cars
				+ "\nThe length of the garage is: " + this.length + " meters."
				+ "\nThe width of the garage is: " + this.width + " meters."
				+ "\nThe floor covering of the garage is: " + this.floorCover
				+ "\nThe garage's total floor space is: " + this.getFloorSpace() + " meters squared.\n";
		return str;				
	}
	
}

