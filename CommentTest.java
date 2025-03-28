

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CommentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CommentTest
{
    /**
     * Default constructor for test class CommentTest
     */
    public CommentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void authorStored()
    {
        Comment comment2 = new Comment("Lebron", "the goat and king", 5);
        //assertEquals("Legoat", comment2.getAuthor());
        assertEquals("Lebron", comment2.getAuthor());
        assertEquals(5, comment2.getRating());
    }
    
    
    
    ///18
    

    @Test
    public void upVoteTest()
    {
        Comment comment2 = new Comment("Lebron", "the goat and king", 5);
        comment2.upvote();
        comment2.upvote();
        comment2.upvote();
        comment2.upvote();
        comment2.upvote();
        assertEquals(5, comment2.getVoteCount());
        //assertEquals(1, comment2.getVoteCount());
        comment2.downvote();
        comment2.downvote();
        comment2.downvote();
        comment2.downvote();
        comment2.downvote();
        comment2.downvote();
        comment2.downvote();
        comment2.downvote();
        //assertEquals(5, comment2.getVoteCount());
        assertEquals(-3, comment2.getVoteCount());
    }
}


