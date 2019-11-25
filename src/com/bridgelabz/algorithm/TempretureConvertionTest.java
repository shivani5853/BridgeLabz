/******************************************************************************

 *  Purpose: Test case of Tempreture Convertion.
 *
 *  @author  Shivani Kumari
 *  @version 1.0
 *  @since   26-10-2019
 *
 ******************************************************************************/

/*
 * PACKAGE NAME
 */

package com.bridgelabz.algorithm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TempretureConvertionTest {

	@Test
	void test() {
		TempretureConvertion test = new TempretureConvertion();
		int result = test.tempretureConversion(45);
		assertEquals(113, result);
	}

}
