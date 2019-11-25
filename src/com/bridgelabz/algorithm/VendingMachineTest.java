/******************************************************************************

 *  Purpose: Test Case of Vending Machine problem.
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

class VendingMachineTest {

	@Test
	void test() {
		VendingMachine test = new VendingMachine();
//		int output[]=new int[] {2500};
		assertEquals(1, test.countNote(100));
	}

}
