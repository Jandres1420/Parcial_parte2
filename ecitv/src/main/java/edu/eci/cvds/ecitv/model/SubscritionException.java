package edu.eci.cvds.ecitv.model;

public class SubscritionException extends Exception {
	public static final String INVALID = "Las edades no pueden ser negativas";
	public SubscritionException(String o) {
		super(o);
	}
}
