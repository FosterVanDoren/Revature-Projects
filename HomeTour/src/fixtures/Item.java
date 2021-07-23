package fixtures;

//This class implements the interactable interface to allow the player to interact with objects

public class Item extends Fixture implements Interactable {

	public Item(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);

	}

	public void interact() {

	}

}
