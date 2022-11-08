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
 * @author User
 */
public class MaxConnectionExceededExceptionTest {
    
    public MaxConnectionExceededExceptionTest() {
    }
   
    @Test
    public void testNotNullMessage() {
        MaxConnectionExceededException error = new MaxConnectionExceededException("Error");
        assertNotNull(error.getMessage());
    }
    
    @Test
    public void testMessage(){
        MaxConnectionExceededException error = new MaxConnectionExceededException("Error");
        assertEquals("Error", error.getMessage());
    }
    
}
