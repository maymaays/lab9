package com.ku.converter;

public class UnitConverter {

	private Length length;

	/***
	 * perform conversions between Distance and Length units (converter
	 * function)
	 * 
	 * @param amount
	 *            - the value of current unit
	 * @param fromUnit
	 *            - the current unit
	 * @param toUnit
	 *            - the unit that user want to change
	 * @return the value that has converted already
	 */
	public double convert(double amount, Length fromUnit, Length toUnit) {
		return (amount * fromUnit.getValue()) / toUnit.getValue();
	}

	/***
	 * Perform getting the unit
	 * 
	 * @return the unit
	 */
	public Length[] getUnits() {
		return Length.values();
	}
}
