import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GameTest {

    private Player player1;
    private Player player2;
    private Game game;
    private Deck deck;

    @Before
    public void before() {
        deck = new Deck();
        deck.populateDeck();


    }

    @Test
    public void player1ShouldWin() {
        player2 = new Player(deck.dealCard());
        player1 = new Player(deck.dealCard());

        game = new Game(player1, player2);
        Assert.assertEquals(GameResults.PLAYER_1, game.play());
    }


    @Test
    public void player2ShouldWin() {
        player1 = new Player(deck.dealCard());
        player2 = new Player(deck.dealCard());

        game = new Game(player1, player2);
        Assert.assertEquals(GameResults.PLAYER_2, game.play());
    }


    @Test
    public void shouldGetTie() {
        player1 = new Player(deck.dealCard());
        deck.emptyDeck();
        deck.populateDeck();
        player2 = new Player(deck.dealCard());

        game = new Game(player1, player2);
        Assert.assertEquals(GameResults.TIE, game.play());
    }


}
