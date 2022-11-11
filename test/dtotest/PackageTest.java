/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtotest;

import datatransferobject.MessageEnum;
import datatransferobject.Package;
import datatransferobject.User;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Julen and Sendoa
 */
public class PackageTest {

    /**
     * Test for creating empty packages
     */
    @Test
    public void CreatePackageTest(){
        Package p = new Package();
        assertTrue(p instanceof Package);
        
    }
    
    /**
     * Test for creating packages with parameters
     */
    @Test
    public void CreatePackageWithParamsTest(){
        User user = new User();
        Package p = new Package(user, MessageEnum.AN_OK);
        assertTrue(p instanceof Package);
        
    }
    
}
