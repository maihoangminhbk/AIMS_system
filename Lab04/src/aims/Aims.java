package aims;

public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date1 = new MyDate(20, 02, 2000);
		Order anOrder = new Order(date1);

		DigitalVideoDisc disc1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);


		DigitalVideoDisc disc2 = new DigitalVideoDisc("Star Wars", "SF", "George Lucas", 87, 24.95f);
		DigitalVideoDisc disc3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		DigitalVideoDisc [] discArr = {disc1, disc2, disc3};
		anOrder.addDigitalVideoDisc(discArr);
		anOrder.print();




	}


}
