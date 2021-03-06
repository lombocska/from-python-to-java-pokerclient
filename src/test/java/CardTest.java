import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lombocska on 2016.12.14..
 */
public class CardTest {
    Card card;

    @Before
    public void setUp() throws Exception {
        System.out.println("Setting Up...");
        card = new Card("s2");
    }

    @Test
    public void cardConstuctor(){
        assertEquals("S2", card.cardCode);
        System.out.println("cardConstuctor test passed...");
    }

    @Test (expected = IllegalArgumentException.class)
    public void cardConstructorWithWrongLetter_Should_Throw_IllegalArgumentException(){
        System.out.println("cardConstructorWithWrongLetter_Should_Throw_IllegalArgumentException test passed...");
        card = new Card("p8");
        assertEquals("P25", card.cardCode);
    }

    @Test (expected = IllegalArgumentException.class)
    public void cardConstructorWithWrongBigNumber_Should_Throw_IllegalArgumentException(){
        System.out.println("cardConstructorWithWrongNumber_Should_Throw_IllegalArgumentException test passed...");
        card = new Card("h25");
        assertEquals("H25", card.cardCode);
    }

    @Test (expected = IllegalArgumentException.class)
    public void cardConstructorWithWrongTinyNumber_Should_Throw_IllegalArgumentException(){
        System.out.println("cardConstructorWithWrongNumber_Should_Throw_IllegalArgumentException test passed...");
        card = new Card("h1");
        assertEquals("H1", card.cardCode);
    }

    @Test
    public void getValue_Should_Return_CardValue_Below_11() throws Exception {
        System.out.println("getValue_Should_Return_CardValue_Below_11 test passed...");
        assertEquals(2, card.getValue());
    }

    @Test
    public void getValue_Should_Return_CardValue_Above_11(){
        System.out.println("getValue_Should_Return_CardValue_Above_11 test passed...");
        card = new Card("HQ");
        assertEquals(12, card.getValue());
    }

    @Test (expected = IllegalArgumentException.class)
    public void getValue_Should_Return_IllegalArgumentException(){
        System.out.println("getValue_Should_Return_IllegalArgumentException test passed...");
        card = new Card("LQ");
        assertEquals("wrongLetter", card.getValue());
    }

}