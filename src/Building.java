
public abstract class Building {
	
	private int windows;
	private int floors;
	
	public Building(int windows, int floors) {
		super();
		this.windows = windows;
		this.floors = floors;
	}
	
	public int getWindows() {
		return windows;
	}
	public void setWindows(int windows) {
		this.windows = windows;
	}
	
	public int getFloors() {
		return floors;
	}
	public void setFloors(int floors) {
		this.floors = floors;
	}
	
	public String toString() {
		String str;
		str = "Number of windows in the building: " + windows
				+ "\nNumber of floors in the building: " + floors + "\n";
		return str;
	}
	
	public abstract double getFloorSpace();
	
}
