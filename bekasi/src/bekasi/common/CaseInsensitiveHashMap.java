package bekasi.common;

import java.util.HashMap;

public class CaseInsensitiveHashMap<V> extends HashMap<String,V>{

	private static final long serialVersionUID = 5858585858585858L;

		public V get(Object name)
	  {
	    return super.get(((String) name).toLowerCase());
	  }
	   
	  @Override
	  public V put(String name, V value)
	  {
	    return super.put(name.toLowerCase(), value);
	  }
	   
	  @Override
	  public V remove(Object name)
	  {
	    return super.remove(((String) name).toLowerCase());
	  }
}
