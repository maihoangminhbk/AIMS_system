package util;

public class DateUtils {
	public static int convertToMonth(String month) {
		String[] monthArr = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		String[] abbreviation = { "Jan.", "Feb.", "Mar.", "Apr.", "May", "June", "July", "Aug.", "Sept.", "Oct.",
				"Nov.", "Dec." };
		String[] in3Letters = { "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec" };
		String[] number = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };

		int i = 0;
		String[] list = { "month", "abbreviation", "in3Letters", "number" };

		for (i = 0; i < 12; i++) {
			if (month.equals(monthArr[i]) == true || month.equals(abbreviation[i]) == true
					|| month.equals(in3Letters[i]) == true || month.equals(number[i]) == true) {
				return i + 1;
			}
		}
		
		return 0;

	}
	
	public static boolean isNumeric(String str) { 
		  try {  
		    Integer.parseInt(str);  
		    return true;
		  } catch(NumberFormatException e){  
		    return false;  
		  }  
		}
	
	public static int convertToYear(String year) {
		if(!isNumeric(year)) {
			System.out.println("year not valid");
			return 0;
		}
		return Integer.parseInt(year);
	}
	
	public static int convertToDay(String day) {
		if(!isNumeric(day)) {
			System.out.println("day not valid");
			return 0;
		}
		return Integer.parseInt(day);
	}
	
	
	
	public int compareTwDate() {
		return 0;
	};
}
