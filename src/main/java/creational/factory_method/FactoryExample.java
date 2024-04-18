package creational.factory_method;

import java.util.Calendar;
import java.util.Locale;

public class FactoryExample {

	public static void main(String args []) {
		
		Calendar cal = Calendar.getInstance();
//		Calendar cal = Calendar.getInstance(Locale.CANADA);
		System.out.println(cal);
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}
	
}
