/******************************************************************************
 *  Purpose: Create a JSON file having Inventory Details for Rice, Pulses and Wheats with properties name, weight, price per kg. 
			 Extend the above program to Create InventoryManager to manage the Inventory. The Inventory Manager will use InventoryFactory to create Inventory Object from JSON. The InventoryManager will call each Inventory Object in its list to calculate the Inventory Price and then call the Inventory Object to return the JSON String. The main program will be with InventoryManager
 *  
 *  @author  Shivani Kumari
 *  @version 1.0
 *  @since   18-11-2019
 *
 ******************************************************************************/

/*
 * PACKAGE NAME
 */
package com.bridgelabz.objectorientedprogram.inventorymanagement.service;

/*
 * IMPORT STATEMENTS
 */
import java.util.List;

import com.bridgelabz.datastructure.LinkedList;
import com.bridgelabz.objectorientedprogram.inventorymanagement.model.Inventory;

public interface InventoryInf {

	/*
	 * CREATING ALL METHOD
	 */
	Inventory addInventory();

	int totalWeight(LinkedList<Inventory> inventoryList);

	long totalPrice(LinkedList<Inventory> inventoryList);

	public void displayInventory(LinkedList<Inventory> inventoryList);

	LinkedList<Inventory> removeInventory(LinkedList<Inventory> inventoryList);

	List<Inventory> removeInventory(List<Inventory> inventoryList);

}
