import java.text.DecimalFormat;
public class House extends Building {
	
	private int bathrooms;
	private Room[] rooms;
	DecimalFormat format = new DecimalFormat("####0.00");
	public House(int windows, int floors, int bathrooms, Room[] rooms) {
		super(windows, floors);
		this.bathrooms = bathrooms;
		this.rooms = rooms;
	}

	public int getBathrooms() {
		return bathrooms;
	}
	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}	
	public Room[] getRooms() {
		return rooms;
	}
	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}
	
	public  double averageRoomSize() {
		 return this.getFloorSpace() / rooms.length;
	}
	
	public double getFloorSpace() {
		double floorSpace = 0;
		for(int i = 0; i < rooms.length; i++) {
			floorSpace += rooms[i].getArea();
		}
		return floorSpace;
	}
	
	public String toString() {
		String str;
		str = super.toString() 
				+ "\nThe number of rooms in the house is: " + rooms.length
				+ "\nThe number of bathrooms in the house is: " + bathrooms
				+ "\nThe average room size for the house is: " + format.format(this.averageRoomSize())
				+ "\nThe house's total floor space is: " + this.getFloorSpace() + "\n";
		return str;
				
	}

}

