public class TestClass {
	
	public static void main(String[] args) {
		/*
		 * Declare some rooms.
		 *parameters:
		 * Room(length,  width,  #closets, type of floor cover) 
		 */
		Room room1 = new Room(1, 2, 1, FloorCover.TILE);
		Room room2 = new Room(2, 3, 2, FloorCover.MARBLE);	
		Room room3 = new Room(4, 2, 3, FloorCover.WOOD);
		
		/*
		 * Declare array of rooms
		 */
		Room[] rooms = new Room[3];
		rooms[0] = room1;
		rooms[1] = room2;
		rooms[2] = room3;
		
		/*
		 * Declare a house.
		 *parameters:
		 * House(#windows, #floors, #bathrooms, array of rooms) 
		 */
		House house1 = new House(10, 2, 5, rooms);	
		
		/*
		 * Declare a garage.
		 *parameters:
		 * Garage(#cars, length, width, type of floor cover) 
		 */
		Garage garage1 = new Garage(2, 3, 4, FloorCover.STONE);
		
		/*
		 * print each declared instance of a class 
		 */
		System.out.println("------House---------");
		System.out.println(house1);
		System.out.println("\n--------Rooms---------");
		System.out.println(room1);
		System.out.println(room2);
		System.out.println(room3);
		System.out.println("\n--------Garage---------");
		System.out.println(garage1);
		
		
	}
}
