package Java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;


public class MonthCode{


	public static void main(String[] args) throws ParseException {
		
		List<String> mon = Arrays.asList("April","January","December","February"/*,"June","May","October","March","August","November","September","July"*/);
		
		TreeMap<Integer,String> m=new TreeMap<Integer,String>();
		for(int i=0;i<mon.size();i++)
		{
		Date date = new SimpleDateFormat("MMMM", Locale.ENGLISH).parse(mon.get(i));
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int n=cal.get(Calendar.MONTH);
//		System.out.println(n);
		m.put(n+1,mon.get(i));
		}

//		System.out.println(m);
//		System.out.println(m.values());
//		for(String x : m.values()) {
//			System.out.println(x);
//		}
		
	}



}
