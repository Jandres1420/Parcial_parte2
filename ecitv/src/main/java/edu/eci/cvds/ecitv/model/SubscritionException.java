package edu.eci.cvds.ecitv.model;

public class SubscritionException extends Exception {
	public static final String INVALID = "Las edades no pueden ser negativas";
	public static final String INVALID_SUBS = "No existe esa suscripcion";
	public SubscritionException(String o) {
		super(o);
	}
}
