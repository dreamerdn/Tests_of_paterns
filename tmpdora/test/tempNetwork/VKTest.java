package tempNetwork;

import org.junit.Test;

import static org.junit.Assert.*;

public class VKTest {


    @Test
    public void testVK() {
        VK network = new VK("userName", "password");
        String message = "tmp";
        assertEquals("userName", network.getUserName());
        assertEquals("password", network.getPassword());
        assertTrue(network.logIn(network.userName, network.password));
        assertTrue(network.sendData(message.getBytes()));
        System.out.println("Test passed");
    }

}