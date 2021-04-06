package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.aims.utils.DateUtils;
import hust.soict.hedspi.aims.utils.MyDate;

import java.util.Scanner;


public class Aims {
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create neworder");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}

	public static void main(String[] args) {
//		 TODO Auto-generated method stub


		Order order = null;
		String n = "1";
		while(!n.equals("0")) {
			Scanner keyBoard = new Scanner(System.in);
			showMenu();
			n = keyBoard.next();
			if(DateUtils.isNumeric(n)) {
				System.out.println("Input not valid");
				break;
			}
			switch (n) {
				case "1": {
					if(Order.checkLimitedOrdered()) {
						MyDate date = new MyDate(20, 02, 2000);
						order = new Order(date);
						System.out.println("Create order successfully");
					} else {
						System.out.println("Order limited");
					}
					break;
				}

				case "2": {
					if(order == null) {
						System.out.println("order not creat");
						break;
					}
					DigitalVideoDisc disc1 = new DigitalVideoDisc("001","The Lion King", "Animation", "Roger Allers", 87, 19.95f);
					Book book1 = new Book("002", "Bird", "Animation", 12.6f, "Hoang Minh");
					order.addMedia(disc1);
					order.addMedia(book1);

					break;
				}

				case "3": {
					if(order == null) {
						System.out.println("order not creat");
						break;
					}

					System.out.println("Input id to delete");
					String id = keyBoard.next();
					order.removeMediaId(id);
					break;
				}

				case "4": {
					if(order == null) {
						System.out.println("order not creat");
						break;
					}

					order.printInfo();
					break;
				}

				default:
					n = "0";
					break;
			}

		}


	}




}
