package bekasi.aws.util;

import java.text.ParseException;
import java.util.Date;

import bekasi.common.Debug;

import com.amazonaws.services.simpledb.util.SimpleDBUtils;

public class SimpleDBUtil {

	private static final int MAX_INT_DIGITS = 10;
	private static final int MAX_LONG_DIGITS = 20;
	private static final int MAX_FLOAT_DIGITS = 20;
	
	private static final String PREFIX_INT = "int@";
	private static final String PREFIX_LONG = "long@";
	private static final String PREFIX_FLOAT = "float@";
	private static final String PREFIX_DATE = "date@";
	private static final String PREFIX_STRING = "string@";
	
	public static String encode(int intValue) {
		return PREFIX_INT + SimpleDBUtils.encodeZeroPadding(intValue, MAX_INT_DIGITS);
	}

	public static String encode(long longValue) {
		return PREFIX_LONG + SimpleDBUtils.encodeZeroPadding(longValue, MAX_LONG_DIGITS);
	}

	public static String encode(float floatValue) {
		return PREFIX_FLOAT + SimpleDBUtils.encodeZeroPadding(floatValue, MAX_FLOAT_DIGITS);
	}

	public static String encode(Date dateValue) {
		return PREFIX_DATE + SimpleDBUtils.encodeDate(dateValue);
	}

	public static String encode(String stringValue) {
		return PREFIX_STRING + stringValue;
	}

	public static Object decode(String valueEnc){
		
		if(valueEnc.startsWith(PREFIX_INT)){
			return SimpleDBUtils.decodeZeroPaddingInt(valueEnc.replaceFirst(PREFIX_INT, ""));
		}else if(valueEnc.startsWith(PREFIX_LONG)){
			return SimpleDBUtils.decodeZeroPaddingLong(valueEnc.replaceFirst(PREFIX_LONG, ""));
		}else if(valueEnc.startsWith(PREFIX_FLOAT)){
			return SimpleDBUtils.decodeZeroPaddingFloat(valueEnc.replaceFirst(PREFIX_FLOAT, ""));
		}else if(valueEnc.startsWith(PREFIX_DATE)){
			try {
				return SimpleDBUtils.decodeDate(valueEnc.replaceFirst(PREFIX_DATE, ""));
			} catch (ParseException e) {
				Debug.error(e);
			}
		}else if(valueEnc.startsWith(PREFIX_STRING)){
			return valueEnc.replaceFirst(PREFIX_STRING, "");
		}
		
		return valueEnc;
	}
	
	public static int decodeInt(String valueEnc) {
		return ((Integer)decode(valueEnc)).intValue();
	}

	public static long decodeLong(String valueEnc) {
		return ((Long)decode(valueEnc)).longValue();
	}
	
	public static float decodeFloat(String valueEnc) {
		return ((Float)decode(valueEnc)).floatValue();
	}
	
	public static Date decodeDate(String valueEnc) {
		return (Date)decode(valueEnc);
	}
	
	public static String decodeString(String valueEnc) {
		return (String)decode(valueEnc);
	}
	

}
