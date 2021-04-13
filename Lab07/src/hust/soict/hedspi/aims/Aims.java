package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Playable;
import hust.soict.hedspi.aims.media.factory.MediaFactory;
import hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.aims.utils.DateUtils;
import hust.soict.hedspi.aims.utils.KeyBoard;
import hust.soict.hedspi.aims.utils.MyDate;

import java.util.Scanner;


public class Aims {
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
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

			showMenu();
			n = KeyBoard.getKeyBoard();
			if(!DateUtils.isNumeric(n)) {
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
					MediaFactory mediaFactory = new MediaFactory();
					System.out.println("Input item name [Book, CD, DVD]:");
					String itemName = KeyBoard.getKeyBoard();
					Media mediaOrder = mediaFactory.getItem(itemName);
					if(mediaOrder == null) {
						break;
					}
					order.addMedia(mediaOrder);
					break;
				}

				case "3": {
					if(order == null) {
						System.out.println("order not creat");
						break;
					}

					System.out.println("Input id to delete");
					String id = KeyBoard.getKeyBoard();
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
