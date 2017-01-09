import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by mbeothy on 2016. 12. 08..
 */
public class PokerClient {

    public List<Card> card = new ArrayList<>();
    public List<Integer> value = new ArrayList<>();

    public PokerClient(String card1, String card2, String card3, String card4, String card5) {
        String[] cardCodes = {card1, card2, card3, card4, card5};

        for (String cardCode : cardCodes) {
            Card card = new Card(cardCode);
            this.card.add(card);
            this.value.add(card.getValue());
        }

    }

    public boolean highestCardIsMine(String card1, String card2, String card3, String card4, String card5) {

        PokerClient competitor = new PokerClient(card1, card2, card3, card4, card5);

        return Collections.max(value) >= Collections.max(competitor.value);
    }

}