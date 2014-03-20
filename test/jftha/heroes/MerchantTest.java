/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jftha.heroes;

import jftha.main.Buyable;
import jftha.spells.Fireball;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shane
 */
public class MerchantTest {
    
    Hero merchant;
    public MerchantTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        merchant = new Merchant();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of buy method, of class Merchant.
     */
    @Test
    public void testBuy() {
        assertEquals(0, merchant.getGold());
        assertFalse(merchant.buy(new Fireball()));
        merchant.addGold(50);
        assertTrue(merchant.buy(new Fireball()));
        // cost 10 discount 25%
        assertEquals(40, merchant.getGold());
    }

    /**
     * Test of attackEnemy method, of class Merchant.
     */
    @Test
    public void testAttackEnemy() {
        System.out.println("attackEnemy");
        Hero attacked = null;
        Merchant instance = new Merchant();
        instance.attackEnemy(attacked);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
