/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 * @author Sendoa & Haizea
 * Exception that is thrown when the connections with the server side are exceeded
 */
public class MaxConnectionExceededException extends Exception {
    public MaxConnectionExceededException() {
        super();
    }
    
    public MaxConnectionExceededException(String msg) {
        super(msg);
    }
}
