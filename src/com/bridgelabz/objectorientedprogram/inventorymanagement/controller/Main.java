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
package com.bridgelabz.objectorientedprogram.inventorymanagement.controller;

/*
 * IMPORT STATEMENTS
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.parser.ParseException;

import com.bridgelabz.objectorientedprogram.inventorymanagement.model.Inventory;
import com.bridgelabz.objectorientedprogram.inventorymanagement.repository.InventoryJson;
import com.bridgelabz.objectorientedprogram.inventorymanagement.service.serviceImplementation.InventoryImplementation;
import com.bridgelabz.objectorientedprogram.inventorymanagement.utility.Utility;

import utility.DataStructureUtility;

public class Main {
	/*
	 * CREATE INVENTORY LIST AS STATIC
	 */
	static List<Inventory> inventoryList = new ArrayList<Inventory>();

	public static void main(String[] args) throws IOException, ParseException {

		InventoryImplementation inventoryImp = new InventoryImplementation();

		Inventory inventory = new Inventory();

		inventoryList = inventoryImp.read(inventoryList);
		System.out.println("Inventory present\n");
		InventoryJson.json();// to run json file calling method

		long resultWeight = 0;
		long resultPrice = 0;

		int temp = 0;
		while (temp == 0) {
			System.out.println("\nTo perform operation ");
			System.out.println("Enter the Choice...\n");
			System.out.println("1.Add Inventory");
			System.out.println("2.Calculate Total Weight");
			System.out.println("3.Calculate Total Price");
			System.out.println("4.Remove Inventory");
			System.out.println("5.Save Inventory");
			System.out.println("6.Display Inventory");
			System.out.println("7.Exit");

			int choice = Utility.inputInteger();
			boolean result = Utility.checkChoice(choice);
			if (result == false) {
				System.out.println("Invalied choice");
				break;
			}

			switch (choice) {
			case 1:
				inventory = inventoryImp.addInventory();
				inventoryList.add(inventory);
//				InventoryImplementation.save(inventoryList);
				break;

			case 2:
				resultWeight = inventoryImp.totalWeight(inventoryList);
				System.out.println("Total weight of an inventory is : " + resultWeight);
				break;

			case 3:
				resultPrice = inventoryImp.totalPrice(inventoryList);
				System.out.println("Total Price of an inventory is : " + resultPrice);
				break;

			case 4:
				inventoryImp.removeInventory(inventoryList);
				break;

			case 5:

				InventoryImplementation.save(inventoryList, "Inventory");
				break;

			case 6:
				InventoryImplementation.Display(inventoryList);
				break;
			case 7:
				System.out.println("\nInventory Close...!!! Thank You ");
				temp = 1;
				break;

			default:
				System.err.println("\nInvalied choice");
				break;
			}
		}
	}
}
