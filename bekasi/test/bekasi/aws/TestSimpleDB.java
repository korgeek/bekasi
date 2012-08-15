package bekasi.aws;

import junit.framework.TestCase;

public class TestSimpleDB extends TestCase{
	
	
	public void testCreate() throws Exception {
		
		String domain = "test";
		String secretKey = "";
		String accessKey = "";
		
		SimpleDB.create(secretKey, accessKey).setDomain(domain);
		
	}
}
