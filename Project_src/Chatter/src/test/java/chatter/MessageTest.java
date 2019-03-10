package chatter;

import edu.northeastern.ccs.im.Message;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author oz
 */
public class MessageTest {

    @Test
    public void test() {
        Message m = Message.makeAcknowledgeMessage("HI");
        assertTrue(true);
    }
}
