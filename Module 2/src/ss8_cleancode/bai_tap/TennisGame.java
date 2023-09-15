package ss8_cleancode.bai_tap;

public class TennisGame {
    public static final String SCORE0 = "Love";
    public static final String SCORE1 = "Fifteen";
    public static final String SCORE2 = "Thirty";
    public static final String SCORE3 = "Forty";
    public static final String ALL = "-All";
    public static final String DEUCE = "Deuce";

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        boolean isDraw = player1Score == player2Score;
        boolean isWin = player1Score >= 4 || player2Score >= 4;
        if (isDraw) return getScoreOfDrawGame(player1Score);
        if (isWin) return getScoreOfGameWin(player1Score, player2Score);
        return "Player " + player1Name + "score is: " + getScoreOfPlayer(player1Score) + "&" + "Player " + player2Name + "score is: " + getScoreOfPlayer(player2Score);
    }

    public static String getScoreOfDrawGame(int drawScore) {
        String score = "";
        switch (drawScore) {
            case 0:
                score = SCORE0 + ALL;
                break;
            case 1:
                score = SCORE1 + ALL;
                break;
            case 2:
                score = SCORE2 + ALL;
                break;
            case 3:
                score = SCORE3 + ALL;
                break;
            case 4:
                score = DEUCE;
                break;
        }
        return score;
    }

    public static String getScoreOfGameWin(int winScore1, int winScore2) {
        int minusResult = winScore1 - winScore2;
        if (minusResult == 1) return "Advantage for player 1";
        if (minusResult == -1) return "Advantage for player 2";
        if (minusResult >= 2) return "Win for player 1";
        return "Win for player 2";
    }

    public static String getScoreOfPlayer(int playerScore) {
        String score = "";
        switch (playerScore) {
            case 0:
                score = SCORE0;
                break;
            case 1:
                score = SCORE1;
                break;
            case 2:
                score = SCORE2;
                break;
            case 3:
                score = SCORE3;
                break;
        }
        return score;
    }
}
