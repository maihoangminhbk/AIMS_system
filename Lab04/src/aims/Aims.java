package aims;

public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order anOrder = new Order();
		
		DigitalVideoDisc disc1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		
		
		DigitalVideoDisc disc2 = new DigitalVideoDisc("Star Wars", "SF", "George Lucas", 87, 24.95f);
		DigitalVideoDisc disc3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		DigitalVideoDisc [] discArr = {disc1, disc2, disc3};
		anOrder.addDigitalVideoDisc(discArr);
		System.out.println("Cost is: ");
		System.out.println(anOrder.totalCost());
		anOrder.removeDigitalVideoDisc(null);
		System.out.println("Cost is: ");
		System.out.println(anOrder.totalCost());
	}

}
