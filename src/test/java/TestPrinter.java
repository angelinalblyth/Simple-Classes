import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {

    @Test
    public void getSheets(){
       Printer printer = new Printer(500, 0, 0);
       assertEquals(500, printer.getSheets());
    }

    @Test
    public void printed(){
        Printer printer = new Printer ( 500, 2, 10);
        assertEquals(20, printer.printed());
    }

    @Test
    public void printNew(){
        Printer printer = new Printer ( 500, 2, 10);
        assertEquals(480, printer.printNew());
    }

    @Test
    public void notEnoughPaper(){
        Printer printer = new Printer ( 18, 2, 10);
        assertEquals(false, printer.enoughPaper());
    }

}
