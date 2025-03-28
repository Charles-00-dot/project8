import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SalesItemTest.
 *
 * @author  mik
 * @version 0.1
 */
public class SalesItemTest
{
    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
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

    /**
     * Test that a comment can be added, and that the comment count is correct afterwards.
     */
    @Test
    public void testAddComment()
    {
        SalesItem salesIte1 = new SalesItem("Brain surgery for Dummies", 21998);
        assertEquals(true, salesIte1.addComment("James Duckling", "This book is great. I perform brain surgery every week now.", 4));
        assertEquals(1, salesIte1.getNumberOfComments());
    }
    
    
    //15
    @Test
    public void testAddCommentSameAuthor()
    {
        SalesItem salesIte1 = new SalesItem("Brain surgery for Dummies", 21998);
        assertEquals(true, salesIte1.addComment("James Duckling", "This book is great. I perform brain surgery every week now.", 4));
        assertEquals(false, salesIte1.addComment("James Duckling", "vksdnld.", 2));
        assertEquals(1, salesIte1.getNumberOfComments());
    }

    /**
     * Test that a comment using an illegal rating value is rejected.
     */
    @Test
    public void testIllegalRating()
    {
        SalesItem salesIte1 = new SalesItem("Java For Complete Idiots, Vol 2", 19900);
        assertEquals(false, salesIte1.addComment("Joshua Black", "Not worth the money. The font is too small.", -5));
    }

    /**
     * Test that a sales item is correctly initialised (name and price).
     */
    @Test
    public void testInit()
    {
        SalesItem salesIte1 = new SalesItem("test name", 1000);
        assertEquals("test name", salesIte1.getName());
        assertEquals(1000, salesIte1.getPrice());
    }

    @Test 
    public void addComment()
    {
        SalesItem salesIte1 = new SalesItem("Brain Surgery for Dummies.", 9899);
        assertEquals(true, salesIte1.addComment("Fred", "Great - I perform brain surgery every week now!", 4));
    }

    @Test
    public void negativeTest()
    {
        SalesItem salesIte1 = new SalesItem("Jordan 1", 1000);
        assertEquals(false, salesIte1.addComment("Micheal", "Jordan", 0));
        assertEquals(false, salesIte1.addComment("Socks", "sucks", -2));
        assertEquals(false, salesIte1.addComment("Bag", "Best", -5));
        SalesItem salesIte2 = new SalesItem("nissan r34", 1000000);
        assertEquals(false, salesIte2.addComment("Japan", "BEST CAR", 6));
    }

    @Test
    public void mostHelpfulComment()
    {
        SalesItem salesIte1 = new SalesItem("LeJordan", 1000);
        assertEquals(true, salesIte1.addComment("Lebron", "le choker", 5));
        assertEquals(1, salesIte1.getNumberOfComments());
        salesIte1.showInfo();
        assertEquals(true, salesIte1.addComment("Micheal", "LeJordan is a bad shoe", 1));
        salesIte1.showInfo();
        salesIte1.upvoteComment(0);
        salesIte1.showInfo();
        assertNotNull(salesIte1.findMostHelpfulComment());
        assertNotNull(salesIte1.findMostHelpfulComment());
    }

    @Test
    public void priceCheck()
    {
        SalesItem salesIte1 = new SalesItem("Car", 1000000);
        assertEquals(1000000, salesIte1.getPrice());
    }

    @Test
    public void amountOfComments()
    {
        SalesItem salesIte1 = new SalesItem("Car", 1000000);
        assertEquals(true, salesIte1.addComment("Yamamoto", "TOKYO DRIFT", 5));
        assertEquals(true, salesIte1.addComment("Yuri", "A nice car for night drive", 5));
        assertEquals(true, salesIte1.addComment("Akane", "Super kawaii", 5));
        assertEquals(3, salesIte1.getNumberOfComments());
    }

    @Test
    public void infoTest()
    {
        SalesItem salesIte1 = new SalesItem("Bag", 1000000000);
        assertEquals(true, salesIte1.addComment("Jeff Besos", "Buy the bag", 5));
        salesIte1.showInfo();
    }
}








