package GuessingGame;

public class GuessGame {
	// create instance variables for three players
	Player p1;
	Player p2;
	Player p3;

	// create method first so that the object can be initialized in it
	public void startGame() {

		// create player objects and assign them to the variables
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		// create variables to hold the guesses of the players
		int guessP1 = 0;
		int guessP2 = 0;
		int guessP3 = 0;

		// boolean variable to hold true false
		boolean p1IsRight = false;
		boolean p2IsRight = false;
		boolean p3IsRight = false;

		// make a target number that a player needs to guess
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I am thinking of a number between 0 and 9");

		// while loop starts
		while (true) {
			System.out.println("Number to guess is " + targetNumber);

			// call the guess method to access the numbers
			p1.guess();
			p2.guess();
			p3.guess();

			// what did the players guess
			guessP1 = p1.number;
			System.out.println("Player 1 guessed " + guessP1);
			guessP2 = p2.number;
			System.out.println("Player 2 guessed " + guessP2);
			guessP3 = p3.number;
			System.out.println("Player 3 guessed " + guessP3);

			if (guessP1 == targetNumber) {
				p1IsRight = true;
			}
			if (guessP2 == targetNumber) {
				p2IsRight = true;
			}
			if (guessP3 == targetNumber) {
				p3IsRight = true;
			}
			if (p1IsRight || p2IsRight || p3IsRight) {
				System.out.println("We have a winner !");
				System.out.println("Player 1 got it right? " + p1IsRight);
				System.out.println("Player 2 got it right? " + p2IsRight);
				System.out.println("Player 3 got it right? " + p3IsRight);
				System.out.println("Game Over");
				break;//game over so break out of the loop

			} else {
				System.out.println("Players will have to try again");

			}
		}

	}
}