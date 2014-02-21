package DataStructures;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Set;
import java.util.HashMap;
import java.util.Map.Entry;
public class HashFunction {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable<String,String> hash = new Hashtable<String, String>();
	// basic functionalities
	hash.put("first", "First Inserted");
	hash.put("second", "Second Inserted");
	hash.put("third", "Third Inserted");
	System.out.println(hash);
	System.out.println("Value of key 'second': "+ hash.get("second"));
	System.out.println("clone of hashtable?"+hash.clone());
	System.out.println("Size of hash table: "+hash.size());
	System.out.println("is hashtable empty?"+ hash.isEmpty())	;
	System.out.println("hash table :" +hash);
	System.out.println("Size of hash table: "+hash.size());
	// iterate through
	Set<String> keys= hash.keySet();
	for(String key: keys){
		System.out.println("Value of "+key+" is: "+hash.get(key));
	}
	// copy from one hashmap to another
	HashMap<String, String> submap = new HashMap<String, String>();
	submap.put("s1", "S1 Value");
	submap.put("s2", "S2 Value");
	submap.put("null", "null");
	submap.put("s4", "null");
	submap.put("s5", "null");
	submap.put("s6", "null");
// a hashmap can store only one key value as null while any number of 'values' as null
	// a hashmap is less synchronized. this makes hashmap more suitable for non threaded applications.
	hash.putAll(submap);
	System.out.println(submap);
	System.out.println(hash);
	
// Program: How to search a key in Hashtable?
	   if(hash.containsKey("first")){
           System.out.println("The Hashtable contains key first");
       } else {
           System.out.println("The Hashtable does not contains key first");
       }
       if(hash.containsKey("seco")){
           System.out.println("The Hashtable contains key second");
       } else {
           System.out.println("The Hashtable does not contains key fifth");
       }



// http://www.java2novice.com/java-collections-and-util/hashtable/key-search/
// program to get all keys from hashtable
Set<String> key= hash.keySet();
for(String key1: key){
System.out.println(key1);
}

//program to get entry set from hashtable
Set<Entry<String, String>> entries = hash.entrySet();
for(Entry<String, String> ent:entries){
    System.out.println(ent.getKey()+" ==> "+ent.getValue());
    
// clearing hashtable
    
    System.out.println(hash);
    System.out.println("Clearing Hashtable:");
    hash.clear();
    System.out.println("Content After clear:");
    System.out.println(hash);
}
}
}