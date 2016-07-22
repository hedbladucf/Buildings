public class Room {
	
	private int length;
	private int width;
	private int closets;
	private FloorCover floorCover;
	
	public Room(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public Room(int length, int width, int closets, FloorCover floorCover) {
		this.length = length;
		this.width = width;
		this.closets = closets;
		this.floorCover = floorCover;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getClosets() {
		return closets;
	}
	public void setClosets(int closets) {
		this.closets = closets;
	}
	public FloorCover getFloorCover() {
		return floorCover;
	}
	public void setFloorCover(FloorCover floorCover) {
		this.floorCover = floorCover;
	}
	
	public double getArea() {
		return length*width;
	}
	
	public String toString() {
		String str;
		str = "The length is: " + length + " meters."
				+ "\nThe room's width is: " + width + " meters."
				+ "\nThe room's area is: " + length*width + " meters squared."
				+ "\nThe number of closets in the room is: " + closets
				+ "\nThe room's floor covering is: " + floorCover + "\n";
		return str;
	}

}

