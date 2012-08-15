package bekasi.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import bekasi.common.Debug;

public class DateFormatUtil {
	
	private static final String DEFALUT = "yyyyMMdd-HHmmss";

	public static String toFormat(long date) {
		return toFormat(date, DEFALUT);
	}
	
	public static String toFormat(long date, String format) {
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		return formatter.format( new Date(date) );
	}
	
	public static Date toDate(String date){
		try{
			return toDate(date, DEFALUT);
		}catch(Exception e){
			Debug.error(e);
		}
		return null;
	}
	
	public static Date toDate(String date, String format) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		return formatter.parse(date);
	}

}
