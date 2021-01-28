import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
    
    private Player player1;
    private Deck deck;
    private Card dealtCard;

    @Before
    public void before() {
        deck = new Deck();
        deck.populateDeck();
        deck.shuffleDeck();
        dealtCard = deck.dealCard();
        player1 = new Player(dealtCard);
    }

    @Test
    public void hasOneCard() {
        Assert.assertEquals(dealtCard, player1.getCard() );
    }
}
