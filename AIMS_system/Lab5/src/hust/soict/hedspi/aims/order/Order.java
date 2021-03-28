package hust.soict.hedspi.aims.order;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.utils.MyDate;

public class Order {
	public static final int MAX_LIMITTED_ORDERED = 4;
	private static int nbOrders = 0;

	public static final int MAX_NUMBERS_ORDERED = 10;
	private DigitalVideoDisc[]itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	private MyDate dateOrdered;

	public static boolean checkLimitedOrdered() {
		return nbOrders < MAX_LIMITTED_ORDERED;
	}

	public Order(MyDate today) {
		Order.nbOrders++;
		this.dateOrdered = today;
	}

	public int addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("Order full, add not sucessfully");
			return 0;
		}
		
		itemsOrdered[qtyOrdered++] = disc;
		System.out.println("Add successfully");
		return 1;
	}
//	overload
//	public int addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
//		int addSuccess = 1;
//		for(int i = 0; i < dvdList.length; i++) {
//			addSuccess = addDigitalVideoDisc(dvdList[i]);
//			if(addSuccess == 0) {
//				System.out.println("Full order, " + "add " + dvdList[i].getTitle() + " not successfully");
//			}
//		}
//		return addSuccess;
//	}
	
	public int addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
		int addSuccess = 1;
		for(int i = 0; i < dvdList.length; i++) {
			addSuccess = addDigitalVideoDisc(dvdList[i]);
			if(addSuccess == 0) {
				System.out.println("Full order, " + "add " + dvdList[i].getTitle() + " not successfully");
			}
		}
		return addSuccess;
	}  

	
	public float totalCost() {
		float cost = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			cost += itemsOrdered[i].getCost();
		}
		return cost;
	}
	
	public int removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i = 0; i < qtyOrdered; i++) {
			if(disc == itemsOrdered[i]) {
				for(int j = i; j < qtyOrdered - 1; j++) {
					itemsOrdered[j] = itemsOrdered[j + 1];
				}
				itemsOrdered[--qtyOrdered] = null;
				System.out.println("Remove successfully");
				return 1;
			}
		}
		System.out.println("Remove not successfully");
		return 0;
	}

	public void print() {
		System.out.println("***********************Order***********************");
		System.out.print("Date: ");
		dateOrdered.print();
		System.out.println();
		System.out.println("Ordered Items");
		if(qtyOrdered != 0) {
			for(int i = 0; i < qtyOrdered; i++) {
				System.out.println(String.valueOf(i + 1) + ". " + itemsOrdered[i].toString());
			}
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("**************************************************");
	}

	public DigitalVideoDisc getALuckyItem() {
		double randomDouble = Math.random();
		randomDouble = randomDouble * 1000;
		int randomInt = (int) randomDouble % qtyOrdered;
		return itemsOrdered[randomInt];
	}

	public void setFreeItems() {
		DigitalVideoDisc freeItem = getALuckyItem();
		freeItem.setCost(0f);
	}
}

