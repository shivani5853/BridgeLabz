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
package com.bridgelabz.objectorientedprogram.inventorymanagement.service.serviceImplementation;

/*
 * IMPORT STATEMENTS
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.objectorientedprogram.inventorymanagement.model.Inventory;
import com.bridgelabz.objectorientedprogram.inventorymanagement.service.InventoryInf;
import com.bridgelabz.objectorientedprogram.inventorymanagement.utility.Utility;

public class InventoryImplementation implements InventoryInf {
	Utility utility = new Utility();// creating utility object
	static LinkedList<Inventory> inventoryOne = new LinkedList<Inventory>();

	/*
	 * Adding the inventory data into the Inventory List and returns the inventory
	 * type Object
	 */
	@Override
	public Inventory addInventory() {
		Inventory inventory = new Inventory();

		System.out.println("Enter the name of the product");
		inventory.setName(Utility.inputString());// setting the name of the inventory
		inventory.getName();// after setting name getting the value of the inventory

		System.out.println("Enter the weight");
		inventory.setWeight(Utility.inputInteger());
		inventory.getWeight();

		System.out.println("Enter the Price");
		inventory.setPrice(Utility.inputDouble());
		inventory.getPrice();

		return inventory;// returns the inventory object
	}

	/*
	 * calculating total weight of the inventory and retuns the total weight
	 */
	public int totalWeight(List<Inventory> inventoryList) {
		int total = 0;// taken a temporary variable
		for (Inventory inventory : inventoryList) {
			total = total + inventory.getWeight();// calculating total weight
		}
		return total;
	}

	/*
	 * Calculating total Price of the specific inventory by getting the weight
	 */
	public long totalPrice(List<Inventory> inventoryList) {
		long total = 0;// taken a temporary variable
		for (Inventory inventory : inventoryList) {
			total = (long) (total + inventory.getPrice() * inventory.getWeight());// calculating total price
		}
		return total;
	}

	/*
	 * Display Inventory product
	 */
	public void displayInventory(LinkedList<Inventory> inventoryList) {
		for (Inventory inventory : inventoryList) {
			System.out.println(inventory);
		}
	}

	/*
	 * Remove Inventory
	 */
	@Override
	public List<Inventory> removeInventory(List<Inventory> inventoryList) {
		System.out.println("Enter the name to be remove");
		String userInputName = utility.inputString();
		int count = 0;
		LinkedList<Inventory> list = new LinkedList<Inventory>();
		for (Inventory inventary : inventoryList) {
			if (userInputName.equals(inventary.getName())) {
				list.add(inventary);
				count++;
				System.out.println("\nRmoved");
			}
		}
		inventoryList.removeAll(list);
		if (count == 0) {
			System.err.println("No such data found\n");
		}
		return inventoryList;
	}

	/*
	 * Read the Inventory
	 */
	public List<Inventory> read(List<Inventory> inventoryList) throws IOException {
//		ObjectMapper objectMapper=new ObjectMapper();
		File file = new File("/home/admin1/InventoryManagement1.json");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str;
		if ((str = br.readLine()) != null) {
//			TypeReference<LinkedList<Inventory>> typeReference=new TypeReference<LinkedList<Inventory>>() {
//			};
//			inventoryList=objectMapper.readValue(str, typeReference);
			br.close();
			return inventoryList;
		}
		return inventoryList;

	}

	/*
	 * Save the Inventory
	 */
	public static void save(List<Inventory> inventoryList, String file)
			throws JsonGenerationException, IOException, ParseException {
//		ObjectMapper objectMapper=new ObjectMapper();
//		objectMapper.writeValue(new File(file), inventoryList);
//		
//		File file=new File("/home/admin1/InventoryManagement1.json");
//		BufferedReader br=new BufferedReader(new FileReader(file));
//		JSONArray objArray=new JSONArray();
//		
//		BufferedWriter br=new BufferedWriter(new FileWriter("/home/admin1/InventoryManagement1.json"));
////
//		File file = new File("/home/admin1/InventoryManagement.json");
//		FileReader br = new FileReader(file);
//		JSONParser objectParser = new JSONParser();
//
//		JSONObject jsonObject = (JSONObject) objectParser.parse(br);
//		System.out.println("Data :" + jsonObject.toJSONString());
////			FileWriter fileOne=new FileWriter("/home/admin1/InventoryManagement1.json");
////			JSONArray objArray=new JSONArray();
////			objArray.add(inventoryList);   
////			fileOne.write(objArray.toJSONString());
//////			fileOne.write();
//			System.out.println("Saved sucessfully....");
////			fileOne.close();

//		{
//			ObjectMapper mapper = new ObjectMapper();
//			try {
//				mapper.writeValue(new File("/home/admin1/InventoryManagement1.json" + file + "/home/admin1/InventoryManagement1.json"), mapper);
//				System.out.println("\nSaved");
//			} catch (JsonGenerationException e) {
//				e.printStackTrace();
//			} catch (JsonMappingException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//
//	}

		{
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.writeValue(new File(file), inventoryList);
			System.out.println("Saved sucessfully....");
		}
	}

	/*
	 * Display Inventory
	 */
	public static void Display(List<Inventory> inventoryList) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new FileReader("/home/admin1/InventoryManagement1.json"));
		JSONParser objParser = new JSONParser();
		JSONArray array = (JSONArray) objParser.parse(br);
		System.out.println(array.toJSONString());
		for (Inventory inventoryDisplay : inventoryList) {
			System.out.println(inventoryDisplay);
		}
	}

	@Override
	public int totalWeight(com.bridgelabz.datastructure.LinkedList<Inventory> inventoryList) {
		return 0;
	}

	@Override
	public long totalPrice(com.bridgelabz.datastructure.LinkedList<Inventory> inventoryList) {
		return 0;
	}

	@Override
	public void displayInventory(com.bridgelabz.datastructure.LinkedList<Inventory> inventoryList) {

	}

	@Override
	public com.bridgelabz.datastructure.LinkedList<Inventory> removeInventory(
			com.bridgelabz.datastructure.LinkedList<Inventory> inventoryList) {
		return null;
	}

}
