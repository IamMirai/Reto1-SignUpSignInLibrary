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
public class InvalidPasswordValueExceptionTest {
    
    public InvalidPasswordValueExceptionTest() {
    }
    
    @Test
    public void testNotNullMessage() {
        InvalidPasswordValueException error = new InvalidPasswordValueException("Error");
        assertNotNull(error.getMessage());
    }
    
    @Test
    public void testMessage(){
        InvalidPasswordValueException error = new InvalidPasswordValueException("Error");
        assertEquals("Error", error.getMessage());
    }
    
}
