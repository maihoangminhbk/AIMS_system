package hust.soict.hedspi.aims.order;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.MyDate;

import java.util.ArrayList;
import java.util.List;

public class Order {
	public static final int MAX_LIMITED_ORDERED = 4;
	private static int nbOrders = 0;
	private List<Media> itemsOrdered = new ArrayList<Media>();
	private MyDate dateOrdered;

	public static boolean checkLimitedOrdered() {
		return nbOrders < MAX_LIMITED_ORDERED;
	}

	public Order(MyDate today) {
		Order.nbOrders++;
		this.dateOrdered = today;
	}

	public void addMedia(Media mediaOrder) {
		itemsOrdered.add(mediaOrder);
	}

	public void removeMedia(Media mediaOrder) {
		if(itemsOrdered.contains(mediaOrder)) {
			itemsOrdered.remove(mediaOrder);
		}
	}

	public void removeMediaId(String id) {
		for(Media i: itemsOrdered) {
			if(i.getId().equals(id)) {
				removeMedia(i);
				System.out.println("Delete successfully");
			}
		}
	}



	
	public float totalCost() {
		float cost = 0;
		for(Media media : itemsOrdered) {
			cost += media.getCost();
		}
		return cost;
	}
	


	public void printInfo() {
		System.out.println("***********************Order***********************");
		System.out.print("Date: ");
		dateOrdered.print();
		System.out.println();
		System.out.println("Ordered Items");

		for(Media media : itemsOrdered) {
			System.out.println(media.toString());
		}


		System.out.println("Total cost: " + totalCost());
		System.out.println("**************************************************");
	}

	public Media getALuckyItem() {
		double randomDouble = Math.random();
		randomDouble = randomDouble * 1000;
		int randomInt = (int) randomDouble % itemsOrdered.size();
		return itemsOrdered.get(randomInt);
	}

	public void setFreeItems() {
		Media freeItem = getALuckyItem();
		freeItem.setCost(0f);
	}
}

