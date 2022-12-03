package fasade;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class AppActivateTest {
    //отлавливаем значения в потоке вывода
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }


    @Test
    public void testAppOn(){
        AppActivate appActivate = new AppActivate();
        //вызываем функцию
        appActivate.act_appOn();
        //сравниваем ожидаемое и полученное значение
        assertEquals("Start the app", outContent.toString());
    }
    @Test
    public void testAppOff(){
        AppActivate appActivate = new AppActivate();
        appActivate.act_appOff();
        assertEquals("Turn the app off", outContent.toString());
    }
}