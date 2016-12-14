import org.junit.After;
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

    @After
    public void tearDown() throws Exception {
        System.out.println("Tearing down...");
        card = null;
    }

    @Test
    public void cardConstuctor(){
        assertEquals("s2", card.cardCode);
        System.out.println("cardConstuctor test passed...");
    }

    @Test (expected = IllegalArgumentException.class)
    public void cardConstructorWithWrongLetter_Should_Throw_IllegalArgumentException(){
        System.out.println("cardConstructorWithWrongLetter_Should_Throw_IllegalArgumentException test passed...");
        card = new Card("p8");
        assertEquals("p25", card.cardCode);
    }

    @Test (expected = IllegalArgumentException.class)
    public void cardConstructorWithWrongNumber_Should_Throw_IllegalArgumentException(){
        System.out.println("cardConstructorWithWrongNumber_Should_Throw_IllegalArgumentException test passed...");
        card = new Card("h25");
        assertEquals("h25", card.cardCode);
    }

    @Test
    public void getValue() throws Exception {

    }

}