package tempNetwork;

import org.junit.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class InstagramTest {

    @Test
    public void testInstagram(){
        Instagram network = new Instagram("userName", "password");
        String message = "tmp";//принимается строка для sendData
        //сравниваем свойства ожидаемые и полученные
        assertEquals("userName", network.userName);
        assertEquals("password", network.password);
        assertTrue(network.logIn(network.userName, network.password));
        assertTrue(network.sendData(message.getBytes()));
        System.out.println("Test passed");
    }
}