package bekasi.aws.simpledb;

import java.util.Date;

import bekasi.common.Debug;

import com.amazonaws.services.simpledb.model.ReplaceableAttribute;

import junit.framework.TestCase;

public class TestAttitudeList extends TestCase{

	
	public void testAttitudeList() throws Exception {
		
		String name = "test";
		AttitudeList list = AttitudeList.create(name);
		
			list.add("key", "value", true);
			list.add("key", Integer.MAX_VALUE, true);
			list.add("key", Float.MAX_VALUE, true);
			list.add("key", Long.MAX_VALUE, true);
			list.add("key", (new Date()), true);
		
		java.util.List<ReplaceableAttribute> attributes = list.toList();
		Debug.debug(attributes);
	}
}
