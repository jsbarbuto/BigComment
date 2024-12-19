package tests;
import org.junit.Test;
import static org.junit.Assert.*;
import static strings.Main.likeIfYoureWatchingIn;

import strings.Main;

public class testComments {

    @Test

    public void testNoYears() {
        String actual = likeIfYoureWatchingIn(0,2000);
        String expected = "Like if you're watching in: 2000";
        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidYears() {
        String actual = likeIfYoureWatchingIn(-1,2000);
        String expected = "Like if you're watching in: ";
        assertEquals(expected, actual);
    }
}
