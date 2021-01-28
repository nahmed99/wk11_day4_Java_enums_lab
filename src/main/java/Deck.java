import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int countCards() {
        return this.cards.size();
    }


    public void populateDeck() {
        for (SuitType suit : SuitType.values()) {
           for (RankType rank : RankType.values()) {
               cards.add(new Card(suit, rank));
           }
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(this.cards);
    }

    public Card dealCard() {
        return this.cards.remove(0);
    }

    public void emptyDeck() {
        this.cards.clear();
    }

}
