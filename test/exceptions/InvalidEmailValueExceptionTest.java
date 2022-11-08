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
public class InvalidEmailValueExceptionTest {
    
    public InvalidEmailValueExceptionTest() {
    }

    @Test
    public void testNotNullMessage() {
        InvalidEmailValueException error = new InvalidEmailValueException("Error");
        assertNotNull(error.getMessage());
    }
    
    @Test
    public void testMessage(){
        InvalidEmailValueException error = new InvalidEmailValueException("Error");
        assertEquals("Error", error.getMessage());
    }
    
}
