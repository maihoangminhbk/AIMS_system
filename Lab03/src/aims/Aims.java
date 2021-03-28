package aims;

public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order anOrder = new Order();
		
		DigitalVideoDisc disc1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(disc1);
		
		DigitalVideoDisc disc2 = new DigitalVideoDisc("Star Wars", "SF", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(disc2);
		DigitalVideoDisc disc3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addDigitalVideoDisc(disc3);
		
		System.out.println("Cost is: ");
		System.out.println(anOrder.totalCost());
		anOrder.removeDigitalVideoDisc(null);
		System.out.println("Cost is: ");
		System.out.println(anOrder.totalCost());
	}

}
