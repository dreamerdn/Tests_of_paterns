package tempNetwork;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class NetworkTest {

    Network network = new Instagram("user", "password");

    //параметризированные тесты
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                //создаем список ожидаеммых и полученных объектов
                { "Hello", true }, { "Goodbye", true }
        });
    }

    private final String message;
    private final Boolean expectedResult;

    public NetworkTest(String message, Boolean expectedResult) {
        this.message = message;
        this.expectedResult = expectedResult;
    }

    //проверятся первая соцсеть для двух объектов
    @Test
    public void testFirstNetwork() {
        boolean res = network.post(message);
        assertEquals(expectedResult, res);
    }
    Network network2 = new VK("user", "password");

    //проверятся вторая соцсеть для двух объектов
    @Test
    public void testSecondNetwork() {
        boolean res = network2.post(message);
        assertEquals(expectedResult, res);
    }
}