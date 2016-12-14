import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mbeothy on 2016. 12. 08..
 */
public class PokerClient {

    public Card card1;
    public Card card2;
    public Card card3;
    public Card card4;
    public Card card5;

    public PokerClient(String p1, String p2, String p3, String p4, String p5) {
        this.card1 = new Card(p1.toUpperCase());
        this.card2 = new Card(p2.toUpperCase());
        this.card3 = new Card(p3.toUpperCase());
        this.card4 = new Card(p4.toUpperCase());
        this.card5 = new Card(p5.toUpperCase());
    }

    public boolean highestCardIsMine(String p1, String p2, String p3, String p4, String p5) {
        Card hc = new Card("s2");
        List<Card> o = new ArrayList(Arrays.asList(new Card(p1.toUpperCase()), new Card(p2.toUpperCase()),new Card(p3.toUpperCase()),new Card(p4.toUpperCase()),new Card(p5.toUpperCase())));
        List<Card> m = new ArrayList(Arrays.asList(card1,card2,card3,card4,card5));

        for (int i = 0; i < o.size(); i++) {
            Card mc = m.get(i);
            for (int j = 0; j < o.size(); j++) {
                Card oc = o.get(j);
                if (oc.getValue() > mc.getValue()) {
                    if (oc.getValue() > hc.getValue()) {
                        hc = oc;
                    }
                } else {
                    if (mc.getValue() > hc.getValue()) {
                        hc = mc;
                    }
                }
            }
        }

        return m.contains(hc);
    }

}