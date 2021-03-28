package aims;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	public int addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("Order full, add not sucessfully");
			return 0;
		}
		
		itemsOrdered[qtyOrdered++] = disc;
		System.out.println("Add successfully");
		return 1;
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
}
