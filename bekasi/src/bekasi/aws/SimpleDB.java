package bekasi.aws;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.simpledb.AmazonSimpleDB;
import com.amazonaws.services.simpledb.AmazonSimpleDBClient;
import com.amazonaws.services.simpledb.model.CreateDomainRequest;

public class SimpleDB {

	private AmazonSimpleDB sdb;
	
	private SimpleDB(String secretKey, String accessKey){
		sdb = new AmazonSimpleDBClient(new BasicAWSCredentials(secretKey, accessKey));
	}
	
	public static SimpleDB create(String secretKey, String accessKey) {
		return new SimpleDB(secretKey, accessKey);
	}

	public SimpleDB setDomain(String domain) {
		sdb.createDomain(new CreateDomainRequest(domain));
		return this;
	}

}
