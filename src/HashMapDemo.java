import java.util.HashMap;
import java.util.Map;

/*
 * Created a class named as HasMapDemo
 */
public class HashMapDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating the object of hmap
		HashMap<String, String> hmap = new HashMap<String, String>();

		// Putting the element in the hashset
		hmap.put("Employee", "Bhawani Shankar");
		hmap.put("Designation", "Engineer");

		//  Adding a key-value pair to the HashMap
		// object if the key-value pair doesn’t exist already.
		hmap.put("Designation", "Bhawani");

		
		//  Retrieving a value associated
		// with a given key from the HashMap.
		System.out.println(hmap.get("Employee"));
		
		//  Clearing all the key-value pair present in the HashMap.
		hmap.clear();// removes
		//  initializing the hashmap
		for (Map.Entry<String, String> el : hmap.entrySet()) {
			String key = el.getKey();
			String value = el.getValue();
			System.out.println(key + " : " + value);
		}

	}
}