package com.ku.converter.controller;

import com.ku.converter.UnitConverter;
import com.ku.converter.ui.ConverterUI;
/**
 * Respresent the controller of the distance converter
 * @author Methawee Apinainarong 5810546714
 *
 */
public class ConverterController {
	
	public static void main (String[] args) {
		
		UnitConverter unit = new UnitConverter();
		ConverterUI convert = new ConverterUI(unit);
		convert.run();
	}

}
 