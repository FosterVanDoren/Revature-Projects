package fixtures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Room extends Fixture {
	private ArrayList<Item> items = new ArrayList<>();
	private ArrayList<Creatures> creatures = new ArrayList<>();

	private Map<String, Room> exits = new HashMap<>();

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}

	/*
	 * using a HashMap to assign a key value for rooms to the direction of their
	 * exits. this allows the layout of cave created and have the appropriate exits
	 * lead into the appropriate rooms.
	 */
	public Map<String, Room> getExits() {
		return this.exits;
	}

	public void setExits(String direction, Room room) {
		exits.put(direction, room);
	}

	public Room getExit(String direction) {
		for (String keyDirection : exits.keySet()) {
			if (keyDirection.startsWith(direction.toLowerCase().intern())) {
				return exits.get(keyDirection);
			}
		}
		return null;

	}

	public ArrayList<Item> getItems() {
		return items;
	}

	// adds an item to the items ArrayList
	public void setItems(Item item) {
		items.add(item);
	}

	// removes items from the items ArrayList
	public void removeItems(Item item) {
		items.remove(item);
	}

	public ArrayList<Creatures> getCreatures() {
		return creatures;
	}

	// adds a creature to the creatures ArrayList
	public void setCreatures(Creatures creature) {
		creatures.add(creature);
	}

	// remove creatures from the creatures ArrayList
	public void removeCreatures(Creatures creature) {
		creatures.remove(creature);
	}

}
