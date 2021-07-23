package game;

import java.util.Scanner;

public class Main {
	private static Scanner scan = new Scanner(System.in);

	private static boolean running = true;

	public static void main(String[] args) {
		System.out.println("Please enter all commands in lowercase");

		RoomManager roomManager = new RoomManager();

		roomManager.init();

		Player player = new Player();
		// set the players current room
		player.setCurrentRoom(roomManager.getStartingRoom());

		

		// main loop to run the game
		while (running) {
			Menus.printCurrentRoom(player);
			Menus.printShortDesc(player);
			Menus.printLongDesc(player);
			Menus.printItem(player);
			Menus.printCreatures(player);
			String[] input = collectInput();
			parse(input, player);

		}
	}

	// scanner to collect player input
	public static String[] collectInput() {
		String input = scan.nextLine();
		String[] inputCommands = input.toLowerCase().split(" ");
		return inputCommands;
	}

	public static void parse(String[] inputCommands, Player player) {
		
		/*
		 * first switch statement determines a command based on
		 * the first index of inputCommands.
		 * 
		 * the inner switch statement takes the second index of 
		 * inputCommands and then determines the direction or object 
		 * that is being interacted with
		 * 
		 */
		switch (inputCommands[0]) {
		case "go":
		case "move":
			if (player.getCurrentRoom().getExit(inputCommands[1]) == null) {
				System.out.println("I don't understand that command");
			}
			switch (inputCommands[1]) {
			case "north":
				System.out.println("Going North");
				player.setCurrentRoom(player.getCurrentRoom().getExit(inputCommands[1]));
				break;
			case "south":
				System.out.println("Going South");
				player.setCurrentRoom(player.getCurrentRoom().getExit(inputCommands[1]));
				break;
			case "east":
				System.out.println("Going East");
				player.setCurrentRoom(player.getCurrentRoom().getExit(inputCommands[1]));
				break;
			case "west":
				System.out.println("Going West");
				player.setCurrentRoom(player.getCurrentRoom().getExit(inputCommands[1]));
				break;
			default:
				System.out.println("I don't understand that direction.");
			}
			break;
		case "interact":
		case "inspect":
			switch (inputCommands[1]) {
			case "chest":
				System.out.println("You open the chest. While it would seem to house riches"
						+ " from the outside, it would appear to contain nothing. How disappointing.");
				Menus.removeItem(player, player.getCurrentRoom().getItems().get(0));
				break;

			}
			break;
		case "attack":
			switch (inputCommands[1]) {
			case "goblin":
				System.out.println("You strike the goblin down.");
				Menus.removeCreature(player, player.getCurrentRoom().getCreatures().get(0));
				break;
			case "orc":
				System.out.println("You engage the orc in combat. After trading blows for a few moments,"
						+ " the orc lies defeated on the ground");
				Menus.removeCreature(player, player.getCurrentRoom().getCreatures().get(0));
				break;
			default:
				System.out.println("There is nothing to fight here.");

			}
			break;
		case "quit":
		case "leave":
			endGame();
			break;
		default:
			System.out.println("I don't understand that command");
		}

	}
	//updates running to false to stop the game
	public static void endGame() {
		running = false;
		System.out.println("Thank you for playing.");
	}

}
