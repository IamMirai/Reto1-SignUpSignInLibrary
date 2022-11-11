/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Julen and Sendoa
 */
public class MaxConnectionExceededExceptionTest {
   
    /**
     * Test to see if the message is not null
     */
    @Test
    public void testNotNullMessage() {
        MaxConnectionExceededException error = new MaxConnectionExceededException("Error");
        assertNotNull(error.getMessage());
    }
    
    /**
     * Test the creation of the message
     */
    @Test
    public void testMessage(){
        MaxConnectionExceededException error = new MaxConnectionExceededException("Error");
        assertEquals("Error", error.getMessage());
    }
    
}
