package builder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
//все остальные классы вызываются в Director
//отлавливаем строки в потоке вывода ("из консоли")
public class DirectorTest {
    Director director = new Director();
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
    public void testDirectorVisit(){
        director.setBuilder(new VisitCardBuilder());//создаем объек
        Website website = director.buildWeb();//строим вебсайт
        System.out.print(website);//выводим то, что получили
        //сравниваем полученные значения с ожидаемыми
        assertEquals("Website{name='VisitCard', cms='wordpress1', price=500}", outContent.toString());

    }
    @Test
    public void testDirectorEnterprise(){
        director.setBuilder(new EnterpriseBuilder());
        Website website = director.buildWeb();
        System.out.print(website);
        assertEquals("Website{name='Enterprise', cms='wordpress2', price=10000}", outContent.toString());

    }



}