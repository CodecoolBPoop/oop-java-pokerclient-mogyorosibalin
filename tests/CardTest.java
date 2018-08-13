import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @DisplayName("Card - Good - S4")
    @Test
    void testCard_goodNumericColor_s4() {
        Card c = new Card("s4");
        assertNotNull(c);
    }

    @DisplayName("Card - Good - C7")
    @Test
    void testCard_goodNumericColor_c7() {
        Card c = new Card("c7");
        assertNotNull(c);
    }

    @DisplayName("Card - Good - D10")
    @Test
    void testCard_goodNumericColor_d10() {
        Card c = new Card("d10");
        assertNotNull(c);
    }

    @DisplayName("Card - Good - H2")
    @Test
    void testCard_goodNumericColor_h2() {
        Card c = new Card("h2");
        assertNotNull(c);
    }

    @DisplayName("Card - Bad#Too Low - s1")
    @Test
    void testCard_badNumericColor_s1() {
        assertThrows(IllegalArgumentException.class, () -> new Card("s1"));
    }

    @DisplayName("Card - Bad#Too High - h11")
    @Test
    void testCard_badNumericColor_h11() {
        assertThrows(IllegalArgumentException.class, () -> new Card("h11"));
    }

    @DisplayName("Card - Bad#Not Valid Color - a4")
    @Test
    void testCard_badNumericColor_a4() {
        assertThrows(IllegalArgumentException.class, () -> new Card("a4"));
    }

    @DisplayName("Card#getValue - s4")
    @Test
    void testCard_getValue_s4() {
        Card c = new Card("s4");
        assertEquals(4, c.getValue());
    }

    @DisplayName("Card#getValue - hj")
    @Test
    void testCard_getValue_hj() {
        Card c = new Card("hj");
        assertEquals(11, c.getValue());
    }

    @DisplayName("Card#getValue - dq")
    @Test
    void testCard_getValue_dq() {
        Card c = new Card("dq");
        assertEquals(12, c.getValue());
    }

    @DisplayName("Card#getValue - ck")
    @Test
    void testCard_getValue_ck() {
        Card c = new Card("ck");
        assertEquals(13, c.getValue());
    }

    @DisplayName("Card#getValue - sa")
    @Test
    void testCard_getValue_sa() {
        Card c = new Card("sa");
        assertEquals(14, c.getValue());
    }

}