import javax.swing.JOptionPane;

public class NumberGuesser {

    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 100) + 1;
        int userGuess = 0;
        int numberOfGuesses = 0;

        while (userGuess != randomNumber) {
            String guessString = JOptionPane.showInputDialog(null, "Guess a number between 1 and 100:");

            if (guessString == null) {
                System.exit(0);
            }

            try {
                userGuess = Integer.parseInt(guessString);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number between 1 and 100.");
                continue;
            }

            numberOfGuesses++;

            if (userGuess < randomNumber) {
                JOptionPane.showMessageDialog(null, "Too low. Guess again.");
            } else if (userGuess > randomNumber) {
                JOptionPane.showMessageDialog(null, "Too high. Guess again.");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Congratulations! You guessed the number in " + numberOfGuesses + " guesses."
                                + " Your score was -> " + (100 - numberOfGuesses));
            }
        }
    }

}
