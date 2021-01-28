import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class DeckTest {

    private Deck deck;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void shouldStartEmpty() {
        Assert.assertEquals(0, deck.countCards());
    }

    @Test
    public void shouldPopulate52() {
        deck.populateDeck();
        Assert.assertEquals(52, deck.countCards());
    }


//    @Test
//    public void shouldShuffleDeck() {
//        deck.populateDeck();
//        System.out.println(deck.getCards().get(13).getRank());
//        deck.shuffleDeck();
//        System.out.println(deck.getCards().get(13).getRank());
//    }

    @Test
    public void canDealCard() {
        deck.populateDeck();
        deck.shuffleDeck();
        Card dealtCard = deck.dealCard();
        Assert.assertEquals(51, deck.countCards());
    }
}
