package edu.eci.cvds.ecitv.service;

import java.math.BigDecimal;

import edu.eci.cvds.ecitv.model.SubscriptionCategory;
import edu.eci.cvds.ecitv.model.SubscritionException;

/**
 * Subscription Service class in charge of calculating the monthly subscription.
 */
public class SubscriptionService {

	/**
	 * Calculate the cost of sucribing for the tc service, depending on the subscription category and the age of the client.
	 *
	 * @param age            the age of the client
	 * @param subCategory    The subscription category
	 * @return The amount to be charged to the client
	 */
	public BigDecimal calculateCost(final Integer age, final SubscriptionCategory subCategory) throws SubscritionException {
		BigDecimal descuento,porcentaje,total;
		if (age<0) {
			throw new SubscritionException(SubscritionException.INVALID);
		}else if(subCategory != SubscriptionCategory.DIAMOND && subCategory != SubscriptionCategory.SILVER &&  subCategory != SubscriptionCategory.GOLD ) {
			throw new SubscritionException(SubscritionException.INVALID_SUBS);
		}if(age == null && subCategory == null) {
			return BigDecimal.ZERO;
		}
		if(age> 0 && age <18 ) {
			descuento = new BigDecimal(0);
		}else if(age>=18 && age <=25) {
			descuento = new BigDecimal(0.15);
		}else if (age>=26 && age<=30) {
			descuento = new BigDecimal(0.12);
		}else if(age>30 && age<61) {
			descuento = new BigDecimal(0.10);
		}else {
			descuento = new BigDecimal(0.20);
		}
		
		BigDecimal valorTiquete = null;
		switch(subCategory) {
			case SILVER:
				valorTiquete = new BigDecimal(15000);
				break;
			case GOLD:
				valorTiquete = new BigDecimal(20000);
				break;
			case DIAMOND:
				valorTiquete = new BigDecimal(30000);
				break;
			}
		
		porcentaje = descuento.multiply(valorTiquete);
		total = valorTiquete.subtract(porcentaje);
		return total;
	}
	

	/*
	 * Tip: Siempre que se desee realizar cálculos matemáticos de alta precisión (por ejemplo para temas de dinero)
	 * es mucho más confiable usar el tipo de dato BigDecimal, pues soporta un alto rango de número, decimales y
	 * tiene mayor precisión en los cálculos. <br />
	 * Ejemplos básicos de operaciones con BigDecimal, teniendo las variables `bd1` y `bd2`:
	 * <ul>
	 * <li>Creación: <code>BigDecimal nuevo = new BigDecimal(10);</code></li>
	 * <li>Sumas: <code>BigDecimal suma = bd1.add(bd2);</code></li>
	 * <li>Restas: <code>BigDecimal resta = bd1.subtract(bd2);</code></li>
	 * <li>Multiplicación: <code>BigDecimal multiplicacion = bd1.multiply(bd2);</code></li>
	 * <li>División: <code>BigDecimal division = bd1.divide(bd2);</code></li>
	 * </ul>
	 */

}
