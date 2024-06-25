package com.company;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testBoard() {
        Board board = null; // = new MyBoard();

        assertNotNull(board);

        for (int i = 0; i < 10; i++) {
            assertEquals('-', board.getValueAt(i + 1));
        }

        board.setValueAt(4, 'x');
        board.setValueAt(7, 'o');

        assertEquals('x', board.getValueAt(4));
        assertEquals('o', board.getValueAt(7));

        board.setValueAt(-2, '-');
        board.setValueAt(12, '-');

        board.setValueAt(4, 'a');
        board.setValueAt(7, 'b');

        assertEquals('x', board.getValueAt(4));
        assertEquals('o', board.getValueAt(7));
        assertEquals('-', board.getValueAt(-2));
        assertEquals('-', board.getValueAt(12));

        board.clear();

        for (int i = 0; i < 9; i++) {
            assertEquals('-', board.getValueAt(i + 1));
        }
    }
}
