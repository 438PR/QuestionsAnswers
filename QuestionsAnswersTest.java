package edu.csumb.cst438fa16;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuestionsAnswersTest {

    /**
     * Testing theVault is null when class first created
     */
	@Test
    public void theVaultIsNullTest()
    {
        QuestionsAnswers testObj = new QuestionsAnswers();
        junit.framework.Assert.assertEquals(0, testObj.theVault.size());
    }

    /**
     * Testing the method put works
     */
	@Test
    public void putMethodTest()
    {
        QuestionsAnswers testObj = new QuestionsAnswers();
        testObj.put("??", "42");
        assertNotNull(testObj.theVault);
    }

}
