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
public class InvalidConfirmPasswordValueExceptionTest {
    
    public InvalidConfirmPasswordValueExceptionTest() {
    }
    
    @Test
    public void testNotNullMessage() {
        InvalidConfirmPasswordValueException error = new InvalidConfirmPasswordValueException("Error");
        assertNotNull(error.getMessage());
    }
    
    @Test
    public void testMessage(){
        InvalidConfirmPasswordValueException error = new InvalidConfirmPasswordValueException("Error");
        assertEquals("Error", error.getMessage());
    }
    
}
