package visitor;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ProjectTest {
    Project project = new Project();

    Developer jun = new JuniorDev();
    Developer sen = new SeniorDev();

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
    public void testJunior(){
        //вызывается функция
        project.beWritten(jun);
        //сравниваются значения
        assertEquals("Writing bad class Writing strange DB Writing wrong test ", outContent.toString());
    }

    @Test
    public void testSenior(){
        project.beWritten(sen);
        assertEquals("INCREDIBLE CLASS Fix DB Wonderful test ",outContent.toString());
    }

}