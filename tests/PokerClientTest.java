import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokerClientTest {

    @DisplayName("PokerClient#highestCardIsMine - True - Higher")
    @Test
    void testPokerClient_highestCardIsMine_true_higher() {
        PokerClient pokerClient = new PokerClient("h3", "d2", "s3", "s4", "cq");
        assertTrue(pokerClient.highestCardIsMine("s3", "h4", "s5", "d6", "sj"));
    }

    @DisplayName("PokerClient#highestCardIsMine - False - Equals")
    @Test
    void testPokerClient_highestCardIsMine_false_equals() {
        PokerClient pokerClient = new PokerClient("h3", "d2", "s3", "s4", "cq");
        assertFalse(pokerClient.highestCardIsMine("s3", "h4", "s5", "d6", "sq"));
    }

    @DisplayName("PokerClient#highestCardIsMine - False - Lower")
    @Test
    void testPokerClient_highestCardIsMine_false_lower() {
        PokerClient pokerClient = new PokerClient("h3", "d2", "s3", "s4", "cq");
        assertFalse(pokerClient.highestCardIsMine("s3", "h4", "s5", "d6", "sk"));
    }

}