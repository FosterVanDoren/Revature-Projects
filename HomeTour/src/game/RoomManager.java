package game;

import fixtures.Creatures;
import fixtures.Item;
import fixtures.Room;
import java.util.ArrayList;

import fixtures.Room;

public class RoomManager {

	ArrayList<Room> rooms = new ArrayList<Room>();
	private Room startingRoom;

	public Room getStartingRoom() {
		return startingRoom;
	}

	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}

	public void init() {
	
		Room entrance = new Room("Cave Entrance:", "Exits: North",
				"The enterance to a cave located close to the nearby village. There have been rumors that monsters have made\n"
						+ "it their residence recently and that there is a reward for exterminating them."
						+ " You arrive with your trusty broadsword in order to deal with them.");
		rooms.add(entrance);

		Room firstRoom = new Room("Main Room 1:", "Exits: North, West", "Long Description");
		rooms.add(entrance);

		Room goblinRoom = new Room("Goblin Room:", "Exits:East",
				"There is a dead end room in front of you " + "that contains a goblin.");
		rooms.add(goblinRoom);

		Room secondRoom = new Room("Main Room 2:", "Exits: North, West, East", "Long Description");
		rooms.add(secondRoom);

		Room deadendRoom = new Room("Dead-end Room:", "Exits: West",
				"The room in front of you contains nothing but a dead-end.");
		rooms.add(deadendRoom);

		Room chestRoom = new Room("Chest Room:", "Exits: East", "A dead-end room that contains a chest.");
		rooms.add(chestRoom);

		Room hallwayRoom = new Room("Hallway Room:", "Exits: North", "Long Description");
		rooms.add(hallwayRoom);

		Room bossRoom = new Room("Boss Room:", "Exits: South", "A large chamber at the end of the cave. "
				+ "It contains a menancing looking orc and a large, decorative chest.");
		rooms.add(bossRoom);
		
		Item chest = new Item("A chest", "A small wooden chest", "A chest made of wooden planks and metal braces");
		
		Item bigChest = new Item("A large chest", "A large, decorative chest", "A large chest decorated withgold and jewels."
				+ "\nIt appears to house something very expensive.");
		Creatures goblin = new Creatures("A goblin", "A small monster known as a goblin", "Considered to be a"
				+ "minor nuisance when compared to other monsters, but should not be underestimated in groups.");
		Creatures orc = new Creatures("An orc", "A large, brutish monster known as an orc", "These"
				+ "large, aggressive humanoid monsters rely heavily on their brute strength."
				+ " They are very dangerous when approached.");
		
		/*
		 * This builds the layout of the cave, sets all of the exits
		 * and populates the cave with objects and creatures.
		 */
		entrance.setExits("north", firstRoom);
		firstRoom.setExits("south", entrance);
		firstRoom.setExits("west", goblinRoom);
		firstRoom.setExits("north", secondRoom);
		goblinRoom.setExits("east", firstRoom);
		goblinRoom.setCreatures(goblin);
		secondRoom.setExits("south", firstRoom);
		secondRoom.setExits("west", chestRoom);
		secondRoom.setExits("east", deadendRoom);
		secondRoom.setExits("north", hallwayRoom);
		chestRoom.setExits("east", secondRoom);
		chestRoom.setItems(chest);
		deadendRoom.setExits("west", secondRoom);
		hallwayRoom.setExits("south", secondRoom);
		hallwayRoom.setExits("north", bossRoom);
		bossRoom.setExits("south", hallwayRoom);
		bossRoom.setItems(bigChest);
		bossRoom.setCreatures(orc);

		// The player starts here
		setStartingRoom(entrance);
	}
}
