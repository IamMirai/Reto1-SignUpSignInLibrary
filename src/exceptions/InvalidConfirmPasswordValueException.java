/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author User
 */
public class InvalidConfirmPasswordValueException extends Exception {
    public InvalidConfirmPasswordValueException() {
        super();
    }
    
    public InvalidConfirmPasswordValueException(String msg) {
        super(msg);
    }
}
