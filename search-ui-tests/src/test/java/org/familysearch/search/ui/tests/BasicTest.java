package org.familysearch.search.ui.tests;

import org.testng.annotations.Test;
import org.testng.Assert;

// git repo gitoligt
// who is setting up doug?
/**
 *
 * @author BenjaminLimb
 */
public class BasicTest {
    
    @Test(groups={"basic"})
    public void testA() throws InterruptedException{
       
        System.out.println("Test Basic A!");
        Thread.sleep(5000);   
        
    }
    
    @Test(groups={"basic"})
    public void testAB() throws InterruptedException{
      
        System.out.println("Test Basic AB!");
        Thread.sleep(5000);   
        
    }
    
    @Test(groups={"advanced"})
    public void testB() throws InterruptedException{
        
        System.out.println("Test Advanced B!");        
        Thread.sleep(10);
        
    }
    
    @Test(dependsOnGroups = {"basic"})
    public void testC() throws InterruptedException{
        System.out.println("Test C depends on Basic!");        
        Thread.sleep(1000);
    }
}
