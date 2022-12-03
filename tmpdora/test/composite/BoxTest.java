package composite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BoxTest {
    //создаем объекты
    Box box = new Box();
    CPU cpu1 = new CPU(1);
    CPU cpu2 = new CPU(2);

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
    public void BoxTest(){
        //добавляем объект в компоновщик
        box.add(cpu1);
        box.add(cpu2);
        box.remove(cpu2);//проверяем правильность работы удаления
        box.print();
        //сравниваем ожидаемый результат с полученным
        assertEquals("CPU1", outContent.toString());
    }

}