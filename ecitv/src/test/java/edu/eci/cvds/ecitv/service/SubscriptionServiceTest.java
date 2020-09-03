package edu.eci.cvds.ecitv.service;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import edu.eci.cvds.ecitv.model.SubscriptionCategory;
import edu.eci.cvds.ecitv.model.SubscritionException;

/**
 * Test class for {@link SubscriptionService}
 */
public class SubscriptionServiceTest {

	/**
	 * The class under test.
	 */
	private SubscriptionService service = new SubscriptionService();

	@Test
	public void test() throws SubscritionException {

		Assert.assertEquals(BigDecimal.ZERO,  service.calculateCost(null, null));
	}
	
	@Test
	public void mayora18menor26() {
		BigDecimal costo,expected;
		expected = new BigDecimal(25500);
		try {
			costo = service.calculateCost(19,SubscriptionCategory.DIAMOND);
			Assert.assertEquals(expected, costo.setScale(0,BigDecimal.ROUND_HALF_UP));
		} catch (SubscritionException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void edadNegativa() {
		BigDecimal costo,expected;
		expected = new BigDecimal(25500);
		try {
			costo = service.calculateCost(-19,SubscriptionCategory.SILVER);
		} catch (SubscritionException e) {
			Assert.assertTrue(true);
		}
		
	}
	
	@Test
	public void mayora30menor61() {
		BigDecimal costo,expected;
		expected = new BigDecimal(13500);
		try {
			costo = service.calculateCost(33,SubscriptionCategory.SILVER);
			Assert.assertEquals(expected, costo.setScale(0,BigDecimal.ROUND_HALF_UP));
		} catch (SubscritionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	@Test
	public void mayora60() {
		BigDecimal costo,expected;
		expected = new BigDecimal(12000);
		try {
			costo = service.calculateCost(77,SubscriptionCategory.SILVER);
			Assert.assertEquals(expected, costo.setScale(0,BigDecimal.ROUND_HALF_UP));
		} catch (SubscritionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void menora18() {
		BigDecimal costo,expected;
		expected = new BigDecimal(15000);
		try {
			costo = service.calculateCost(17,SubscriptionCategory.SILVER);
			Assert.assertEquals(expected, costo.setScale(0,BigDecimal.ROUND_HALF_UP));
		} catch (SubscritionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	
}
