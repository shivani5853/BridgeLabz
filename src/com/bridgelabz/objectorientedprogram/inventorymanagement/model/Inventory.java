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
package com.bridgelabz.objectorientedprogram.inventorymanagement.model;

/*
 * IMPORT STATEMENTS
 */
public class Inventory {

	/*
	 * TAKING INSTANCE VARIABLE AS PRIVATE
	 */
	private String name;
	private int weight;
	private double price;

	/*
	 * GETTER SETTER FOR GETING THE VALUE AND SETTING THE VALUE
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	/*
	 * OVERRIDE TOSTRING METHOD
	 */
	@Override
	public String toString() {
		return "Inventory [name=" + name + ", weight=" + weight + ", price=" + price + "]";
	}
}
