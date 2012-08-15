package bekasi.aws.util;

import java.util.Date;
import junit.framework.TestCase;

public class TestSimpleDBUtil extends TestCase {

	int intValue = Integer.MAX_VALUE;
	long longValue = Long.MAX_VALUE;
	float floatValue = Float.MAX_VALUE;
	Date dateValue = new Date(System.currentTimeMillis());
	String stringValue = "";
	
	public void testEncodeAndDecode() throws Exception {
		String intValueEnc = SimpleDBUtil.encode(intValue);
		assertEquals(SimpleDBUtil.decodeInt(intValueEnc), intValue);		
		
		String longValueEnc = SimpleDBUtil.encode(longValue);
		assertEquals(SimpleDBUtil.decodeLong(longValueEnc), longValue);
		
		String floatValueEnc = SimpleDBUtil.encode(floatValue);
		assertEquals(SimpleDBUtil.decodeFloat(floatValueEnc), floatValue);
		
		String dateValueEnc = SimpleDBUtil.encode(dateValue);
		assertEquals(SimpleDBUtil.decodeDate(dateValueEnc), dateValue);
		
		String stringValueEnc = SimpleDBUtil.encode(stringValue);
		assertEquals(SimpleDBUtil.decodeString(stringValueEnc), stringValue);
	}
	
}
