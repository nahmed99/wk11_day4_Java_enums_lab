public class Game {
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public GameResults play() {
        GameResults result;
        if (player1.getCard().getRankValue() > player2.getCard().getRankValue()) {
            result = GameResults.PLAYER_1;
        } else if (player1.getCard().getRankValue() == player2.getCard().getRankValue()) {
            result = GameResults.TIE;
        } else {
            result = GameResults.PLAYER_2;
        }
        return result;
    }
}
