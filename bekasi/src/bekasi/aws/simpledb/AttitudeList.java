package bekasi.aws.simpledb;

import java.util.Date;
import java.util.List;

import bekasi.aws.util.SimpleDBUtil;
import bekasi.common.util.ListUtil;

import com.amazonaws.services.simpledb.model.ReplaceableAttribute;

public class AttitudeList {

	private String name;
	private java.util.List<ReplaceableAttribute> attributes;
	
	private AttitudeList(String name){
		this.name = name;
		this.attributes = ListUtil.create();
	}
	
	public static AttitudeList create(String name) {
		// TODO Auto-generated method stub
		return new AttitudeList(name);
	}

	public List<ReplaceableAttribute> toList() {
		return attributes;
	}

	public AttitudeList add(String key, String value){
		add(key, value, true);
		return this;
	}
	
	public AttitudeList add(String key, String value, boolean replace) {
		attributes.add( new ReplaceableAttribute(key, SimpleDBUtil.encode(value), replace) );
		return this;
	}

	public AttitudeList add(String key, int value){
		add(key, value, true);
		return this;
	}
	
	public AttitudeList add(String key, int value, boolean replace) {
		attributes.add( new ReplaceableAttribute(key, SimpleDBUtil.encode(value), replace) );
		return this;
	}

	public AttitudeList add(String key, float value){
		add(key, value, true);
		return this;
	}
	
	public AttitudeList add(String key, float value, boolean replace) {
		attributes.add( new ReplaceableAttribute(key, SimpleDBUtil.encode(value), replace) );
		return this;		
	}
	
	public AttitudeList add(String key, long value){
		add(key, value, true);
		return this;
	}
	
	public AttitudeList add(String key, long value, boolean replace) {
		attributes.add( new ReplaceableAttribute(key, SimpleDBUtil.encode(value), replace) );
		return this;		
	}	

	public AttitudeList add(String key, Date value){
		add(key, value, true);
		return this;
	}
			
	public AttitudeList add(String key, Date value, boolean replace) {
		attributes.add( new ReplaceableAttribute(key, SimpleDBUtil.encode(value), replace) );
		return this;		
	}

}
