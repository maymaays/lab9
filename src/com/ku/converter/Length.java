package com.ku.converter;

/***
 * Respresents the measurement or extent of something (distance) from end to end
 * in standard unit
 * 
 * @author Methawee Apinainarong 5810546714
 */

public enum Length implements Unit {

	METER("Meter", 1.00), CENTIMETER("Centimeter", 0.01), KILOMETER("Kilometer", 1000.0), MILE("Mile",
			1609.344), FOOT("Foot", 0.30480), WA("Wa", 2.0);

	private final String name;
	private final double value;

	/***
	 * Perform the unit with value of the unit that you need
	 * 
	 * @param name
	 *            of unit
	 * @param value
	 *            of unit
	 */
	private Length(String name, double value) {
		this.name = name;
		this.value = value;
	}

	/***
	 * Perform getting the value of unit
	 * 
	 * @return value of unit
	 */
	public double getValue() {
		return this.value;
	}

	/***
	 * Perform getting the name of unit for example, meter, centimeter etc.
	 */
	public String toString() {
		return this.name();
	}

	
}
