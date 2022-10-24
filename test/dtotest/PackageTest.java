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
 * @author 2dam
 */
public class PackageTest {
    
    public PackageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void CreatePackageTest(){
        Package p = new Package();
        assertTrue(p instanceof Package);
        
    }
    
    @Test
    public void CreatePackageWithParamsTest(){
        User user = new User();
        Package p = new Package(user, MessageEnum.AN_OK);
        assertTrue(p instanceof Package);
        
    }
    
}
