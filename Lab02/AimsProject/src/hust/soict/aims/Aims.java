package hust.soict.aims;

import hust.soict.aims.cart.Cart;
import hust.soict.aims.media.DigitalVideoDisc;

public class Aims {

	public static void main(String[] args) {
		//Create a new cart
		Cart anOrder = new Cart();
		
		//Create dvd Object and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addMedia(dvd2);
		anOrder.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addMedia(dvd3);
		
		//print the total cost of the items in the cart
		System.out.println("The total cost is:");
		System.out.println(anOrder.totalCost());
		
		anOrder.removeMedia(dvd2);
		System.out.println("The total cost is:");
		System.out.println(anOrder.totalCost());
		
		anOrder.printCart();
		anOrder.searchByTitle();
	}

}
