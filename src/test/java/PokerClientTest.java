import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lombocska on 2016.12.14..
 */
public class PokerClientTest {
    PokerClient pokerClient;

    @Before
    public void setUp() throws Exception {
        pokerClient = new PokerClient("h3", "d2", "s3", "s4", "cq");
    }

    @Test
    public void highestCardIsMine_Should_Return_True() throws Exception {
        System.out.println("highestCardIsMine_Should_Return_True test passed...");
        assertEquals(true, pokerClient.highestCardIsMine("s3", "h4", "s5", "d6", "sj"));
    }

    @Test
    public void highestCardIsMine_Should_Return_True_WithSameCard() throws Exception {
        System.out.println("highestCardIsMine_Should_Return_True_WithSameCard test passed...");
        assertEquals(true, pokerClient.highestCardIsMine("h3", "d2", "s3", "s4", "cq"));
    }

    @Test
    public void highestCardIsMine_Should_Return_False() throws Exception {
        System.out.println("highestCardIsMine_Should_Return_False test passed...");
        assertEquals(false, pokerClient.highestCardIsMine("s3", "h4", "s5", "d6", "sk"));
    }

}