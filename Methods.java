import java.awt.*;
import java.io.PrintStream;

public class Methods {

    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Percy", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("JJ", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Lucas", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Trevor", highScorePosition);
    }
    private static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " + highScorePosition );
    }
    private static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000) {
            return 1;
        }else
        if (playerScore >= 500) {
            return 2;
        }
        if (playerScore >= 100) {
            return 3;
        }
        return 4;
    }
}
