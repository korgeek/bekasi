package bekasi.common.util;

import bekasi.common.Debug;
import junit.framework.TestCase;

public class TestDateFormatUtil extends TestCase{

	public void testToFormatAndDate() throws Exception {
		long date = System.currentTimeMillis();
		String format = "yyyyMMdd-HHmmss";
		long conconvert = DateFormatUtil.toDate(DateFormatUtil.toFormat(date, format)).getTime();
		
		Debug.debug(DateFormatUtil.toFormat(date, format), DateFormatUtil.toDate(DateFormatUtil.toFormat(date, format)));
		assertEquals(conconvert, (date/1000)*1000);
	}
	
	public void testSimpleTo() throws Exception {
		long date = System.currentTimeMillis();
		long conconvert = DateFormatUtil.toDate(DateFormatUtil.toFormat(date)).getTime();
		assertEquals(conconvert, (date/1000)*1000);
	}
	
}
