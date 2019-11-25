/******************************************************************************

 *  Purpose: Create a JSON file having Inventory Details for Rice, Pulses and Wheats with properties name, weight, price per kg. 

 *  @author  Shivani Kumari
 *  @version 1.0
 *  @since   18-11-2019
 *
 ******************************************************************************/

/*
 * PACKAGE NAME
 */
package com.bridgelabz.objectorientedprogram.inventorymanagement.repository;

/*
 * IMPORT STATEMENTS
 */
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class InventoryJson {
	public static void json() throws IOException {
		JSONObject obj = new JSONObject();// CREATING JSON OBJECT
		JSONArray objArray = new JSONArray();// CREATING JSON ARRAY

		obj.put("name", "Wheat");// PUTTING VALUES IN THE JSON FILE
		obj.put("weight", new Integer(50));
		obj.put("pricePerKg", new Double(50));

		/*
		 * CREATING SECOND JSON OBJECT
		 */
		JSONObject objectOne = new JSONObject();
		objectOne.put("name", "Rice");
		objectOne.put("weight", new Integer(60));
		objectOne.put("pricePerKg", new Double(60));

		/*
		 * CREATING THIRD JSON OBJECT
		 */
		JSONObject objectTwo = new JSONObject();
		objectTwo.put("name", "Pulses");
		objectTwo.put("weight", new Integer(70));
		objectTwo.put("pricePerKg", new Double(70));

		objArray.add(obj);// ADDING JSON OBJECT TO JSON ARRAY
		objArray.add(objectOne);
		objArray.add(objectTwo);

		System.out.println(objArray);
		FileWriter file = new FileWriter("/home/admin1/InventoryManagement1.json");// FILE PATH IN WHICH JSON VALUES IS
																					// THERE
		file.write(objArray.toJSONString());
		file.close();
	}
}
