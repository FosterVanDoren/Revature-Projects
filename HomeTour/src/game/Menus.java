package game;

import fixtures.Creatures;
import fixtures.Item;

public class Menus {
	/*
	 * the following print methods are used to display information to the player
	 * while the game is running.
	 */
	public static void printCurrentRoom(Player player) {
		System.out.println(player.getCurrentRoom().getName());
	}

	public static void printShortDesc(Player player) {
		System.out.println(player.getCurrentRoom().getShortDescription());
	}

	public static void printLongDesc(Player player) {
		System.out.println(player.getCurrentRoom().getLongDescription());
	}

	public static void printItem(Player player) {
		System.out.println("Room Items: ");
		int size = player.getCurrentRoom().getItems().size();
		for (int i = 0; i < size; i++) {
			Item item = player.getCurrentRoom().getItems().get(i);
			System.out.println(item.getName());
		}
	}

	public static void printCreatures(Player player) {
		System.out.println("Room Creatures: ");
		int size = player.getCurrentRoom().getCreatures().size();
		for (int i = 0; i < size; i++) {
			Creatures creature = player.getCurrentRoom().getCreatures().get(i);
			System.out.println(creature.getName());
		}
	}

	/*
	 * these two methods are used to update the item and creature array lists after
	 * an object or creature is interacted with by the player.
	 */
	public static void removeItem(Player player, Item item) {
		player.getCurrentRoom().removeItems(item);
	}

	public static void removeCreature(Player player, Creatures creature) {
		player.getCurrentRoom().removeCreatures(creature);
	}
}
