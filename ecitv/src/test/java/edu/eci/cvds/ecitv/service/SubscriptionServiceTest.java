package edu.eci.cvds.ecitv.service;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link SubscriptionService}
 */
public class SubscriptionServiceTest {

	/**
	 * The class under test.
	 */
	private SubscriptionService service = new SubscriptionService();

	@Test
	public void test() {

		Assert.assertEquals(BigDecimal.ZERO,  service.calculateCost(null, null));
	}
}
