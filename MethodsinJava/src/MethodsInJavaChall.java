public class MethodsInJavaChall {

    public static void main(String[] args) {

        int highScore = 0;
        int numPosition = 0;
        highScore = calculateScore(true, 50, 1, 0);
        System.out.println("Your final score was " + highScore);
        numPosition = calculateHighScorePosition(highScore);
        displayHighScorePosition("Ricardo", numPosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            // finalScore += 200;
            return finalScore;
        }
        return -1;
    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500) {
            return 2;
        } else if (playerScore > 100) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void displayHighScorePosition(String namePlayer, int numPosition) {
        System.out.println(namePlayer + " managed to get into position " + numPosition + " on the high score table");
    }
}