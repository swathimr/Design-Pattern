

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GumballMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GumballMachineTest
{
    private GumballMachine M1;

    /**
     * Default constructor for test class GumballMachineTest
     */
    public GumballMachineTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        //GumballMachineTestDrive.main({ });
        M1 = new GumballMachine(5);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    //general scenario
    @Test
    public void testExample()
    {
        M1.insertQuarter();
        M1.insertDime();
        M1.insertNickel();
        M1.insertDime();
        M1.turnCrank();
        assertEquals(true, M1.isGumballInSlot());
        M1.takeGumballFromSlot();
    }
    
    //negative test for isGumball in Slot
    @Test
    public void testNeagtive()
    {
        M1.turnCrank();
        assertEquals(false, M1.isGumballInSlot());
    }
    
    //gumball with return money
    @Test
    public void testExample2()
    {
        M1.insertNickel();
        M1.insertQuarter();
        M1.insertDime();
        M1.insertDime();
        M1.insertDime();
        M1.insertNickel();
        M1.turnCrank();
        M1.takeGumballFromSlot();
    }
    
    //turn crank by adding money twice
    @Test
    public void tetsExample3()
    {
        M1.insertQuarter();
        M1.insertQuarter();
        M1.insertDime();
        M1.turnCrank();
        M1.insertQuarter();
        M1.insertDime();
        M1.insertQuarter();
        M1.insertNickel();
        M1.turnCrank();
        M1.takeGumballFromSlot();
    }
    
    //Turning crank twice by not adding enough money
    @Test
    public void testExample4()
    {
        M1.insertNickel();
        M1.insertQuarter();
        M1.turnCrank();
        M1.insertDime();
        M1.insertNickel();
        M1.turnCrank();
    }
    
   //not enough gumballs in inventory and add quarters
    @Test
    public void testExample5()
    {
        M1.insertQuarter();
        M1.insertQuarter();
        M1.turnCrank();
        M1.insertNickel();
        M1.insertDime();
        M1.insertDime();
        M1.insertQuarter();
        M1.turnCrank();
        M1.takeGumballFromSlot();
    }
}






