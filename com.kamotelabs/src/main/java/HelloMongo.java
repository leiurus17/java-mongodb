import com.mongodb.MongoClient;
import com.mongodb.client.MongoIterable;

public class HelloMongo {

	public static void main(String[] args) {
		MongoClient mongo = new MongoClient("localhost", 27017);

		MongoIterable<String> mongoDBList = mongo.listDatabaseNames();
		for (String mong : mongoDBList) {
			System.out.println(mong);
		}
		
		mongo.close();
	}
}