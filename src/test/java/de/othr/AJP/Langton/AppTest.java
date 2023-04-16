package de.othr.AJP.Langton;

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

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        moveTest();
        turnRightTest();
        turnLeftTest();

        assertTrue( true );
    }

    public void turnRightTest()
    {
        Ant ant = new Ant(200,200,0);
        App.turnRight(ant);
        assertEquals(ant.getDir(), 1);

        App.turnRight(ant);
        assertEquals(ant.getDir(), 2);

        App.turnRight(ant);
        assertEquals(ant.getDir(), 3);

        App.turnRight(ant);
        assertEquals(ant.getDir(), 0);
    }

    public void turnLeftTest()
    {
        Ant ant = new Ant(200,200,0);
        App.turnLeft(ant);
        assertEquals(ant.getDir(), 3);

        App.turnLeft(ant);
        assertEquals(ant.getDir(), 2);

        App.turnLeft(ant);
        assertEquals(ant.getDir(), 1);

        App.turnLeft(ant);
        assertEquals(ant.getDir(), 0);
    }

    public void moveTest()
    {
        Ant ant = new Ant(200,200,0);
        App.move(ant);
        assertEquals(ant.getY(), 201);
    }
}
