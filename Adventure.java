package com.ssa.adventure;

import java.util.Scanner;

public class Adventure {

	private static Scanner sc = new Scanner(System.in);

	private static boolean stillPlaying = true;

	public static void main(String[] args) {

		while (stillPlaying) {

			startAdventure();
		}
	}

	public static boolean startAdventure() {

		System.out.println("Welcome to Decisons and Consequences! \n");

		makeFirstChoice();

		return stillPlaying;
	}

	private static boolean makeFirstChoice() {
		System.out.println("It's 5:00 am when you are jolted awake by the wailing of your alarm clock.  You slam your hand down on it to shut it off and stare at the\n"
				+ "ceiling while you begin to plan out your day.\n\n" 
				+ "You decide to start by: \n\n"
				+ "\tA: Getting up and going for a run\n"
				+ "\tB: Turning over and going back to sleep\n"
				+ "\tC: Getting up and getting dressed to head into work early\n");

		String firstChoice = sc.nextLine();

		whatIsFirstChoice(firstChoice);

		return stillPlaying;
	}

	public static boolean whatIsFirstChoice(String firstChoice) {

		switch (firstChoice.toUpperCase()) {

		case "A":
			choiceA();
			break;

		case "B":
			choiceB();
			break;

		case "C":
			choiceC();
			break;

		default:
			System.out.println("I'm sorry, you've made an error. Please restart the game.");
			System.exit(0);
		}

		return stillPlaying;
	}

	private static boolean choiceA() {

		System.out.println("You've decide to be healthy and go for a quick run before heading to the office. \n");

		System.out.println(
				"While you are out getting your run on, you stumble accross a black fanny-pack laying on the ground. You open it up and find that it is filled\n"
						+ "with hundred dollar bills. You look around to see if anyone is around and see no one.\n\n"
						+ "What do you do?\n\n"
						+ "\tA: Turn the fanny-pack into the police, so that it's owner can be located\n"
						+ "\tB: Finders Keepers! Take the cash and throw the fanny-pack into the nearby trashcan\n");

		String nextChoice = sc.nextLine();

		secondChoiceA(nextChoice);

		return stillPlaying;
	}

	public static boolean secondChoiceA(String secondSelectionA) {

		String playAgain = null;

		switch (secondSelectionA.toUpperCase()) {

		case "A":
			System.out.println(
					"Way to be a good Citizen!  After a 2 week posting, no one comes forawrd to claim the fanny-pack  and it is returned to you.\n"
							+ "You just became $100,000 richer!\n");

			System.out.println("Would you like to play again? Y or N");

			playAgain = sc.nextLine();
			restart(playAgain);
			break;

		case "B":
			System.out.println(
					"After stuffing the money in your pants, you cross the street to throw the empty fanny-pack into the trashcan and are hit by a garbage truck.\n"
							+ "You don't survive. :(\n");

			System.out.println("Would you like to play again? Y or N");

			playAgain = sc.nextLine();
			restart(playAgain);
			break;

		default:
			System.out.println("I'm sorry, you've made an error. Please restart the game.");
			System.exit(0);
		}
		return stillPlaying;
	}

	private static boolean choiceB() {

		System.out.println("You decided to turn over and go back to sleep. \n");

		System.out.println("When you finally wake up, you look at the clock and see that it's 7:30 am. You are due in the office by 8:00 am, but are still kind of tired."
				+ "You consider calling out of work.  After all, what's one day?\n\n" 
				+ "What do you do?\n\n"
				+ "\tA: Call your boss and leave a message in your best \"I'm dying\" voice and explain that you will not be in today becasue\n"
				+ "\t   you have the plague\n"
				+ "\tB: Drag yourself out of bed, take a quick shower, get dressed, and call your boss while your driving letting him know you're running late\n");

		String nextChoice = sc.nextLine();

		secondChoiceB(nextChoice);

		return stillPlaying;
	}

	public static boolean secondChoiceB(String secondSelectionB) {

		String playAgain = null;

		switch (secondSelectionB.toUpperCase()) {

		case "A":
			System.out.println("You decided to lie about being sick today.  While you were playing hookie, you decided to go swimming in the nearby lake and\n"
					+ "a brain eating amoeba latached itself to your brain\n" + "You will die in a week :(\n");

			System.out.println("Would you like to play again? Y or N");

			playAgain = sc.nextLine();
			restart(playAgain);
			break;

		case "B":
			System.out.println("You made it to work just in time for a big surprise meeting where everyone who was present was given a lottery scratch off ticket.\n"
					+ "You scratch away and end up winning $750,000!\n");

			System.out.println("Would you like to play again? Y or N");

			playAgain = sc.nextLine();
			restart(playAgain);
			break;

		default:
			System.out.println("I'm sorry, you've made an error. Please restart the game.");
			System.exit(0);
		}

		return stillPlaying;
	}

	private static boolean choiceC() {
		System.out.println("You decided to get up and get ready to head into work early.\n");

		System.out.println("Even though you're tired, you get out of bed and head to work early. As you are walking into the building, you notice the CEO walking\n"
				+ "in as well.\n\n" 
				+ "What do you do?\n\n"
				+ "\tA: Say good morning in the cheeriest voice you have, introduce yourself, and talk about how beneficial the recent merger the company\n"
				+ "went through will be for the company as a whole\n"
				+ "\tB: Keep walking towards your office with your face planted in your cell phone liking all the recent facebook posts people you\n"
				+ "never talk to have made in the last 24 hours\n");

		String nextChoice = sc.nextLine();

		secondChoiceC(nextChoice);

		return stillPlaying;
	}

	public static boolean secondChoiceC(String secondSelectionC) {

		String playAgain = null;

		switch (secondSelectionC.toUpperCase()) {

		case "A":
			System.out.println("The CEO is thoroughly impressed by your enthusiasim and likes the future you envinsion for the company. He invites you to lunch\n"
					+ "and makes you an offer to be part of the executive team\n" 
					+ "You get promoted and get a fat salary increase!");

			System.out.println("Would you like to play again? Y or N");

			playAgain = sc.nextLine();
			restart(playAgain);
			break;

		case "B":
			System.out.println("You miss a major opportunity to advance in the company and find out later that the lady who picked choice A got promoted\n"
					+ "It sucks to be you!");

			System.out.println("Would you like to play again? Y or N");

			playAgain = sc.nextLine();
			restart(playAgain);
			break;

		default:
			System.out.println("I'm sorry, you've made an error. Please restart the game.");
			System.exit(0);
		}

		return stillPlaying;
	}

	private static boolean restart(String playAgain) {

		switch (playAgain.toUpperCase()) {

		case "Y":
			break;

		case "N":
			stillPlaying = false;
			break;
		}

		return stillPlaying;
	}
}
