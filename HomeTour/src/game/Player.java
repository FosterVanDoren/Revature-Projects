package game;

import fixtures.Room;

public class Player {

	private Room currentRoom;

	public Room getCurrentRoom() {
		return currentRoom;
	}

	// sets the players current room
	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}

}
