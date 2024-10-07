import java.util.HashMap;

public class HashMapTest {

    public void hashMapUserCase (){
        //_______________________ test why we override hashcode and equal when useing hashcode Hashpam

        HashMap<Person, String> map = new HashMap<Person, String>();

        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);

        map.put(person1, "Person 1");
        map.put(person2, "Person 2");

        // Should print only one entry if hashCode() and equals() are overridden correctly
        System.out.println("Map size: " + map.size()); // Should be 1

        if (person1.equals(person2)){
            System.out.println("person1 equals person2");
        }

        // Checking value associated with key person1
        System.out.println("Value for person1: " + map.get(person1)); // Should re
        System.out.println("Value for person2: " + map.get(person2)); // Should re

        System.out.println("___________________________________________________");
        String str1 = new String("str1");
        String str2 = new String("str1");

        HashMap <String, String> stringMap = new HashMap();
        stringMap.put(str1, "value1");
        stringMap.put(str2, "value2");

        System.out.println("Map size: " + stringMap.size());

        System.out.println("Value for str1: " + stringMap.get(str1));
        System.out.println("Value for str2: " + stringMap.get(str2));

        if (str1.equals(str2)){
            System.out.println("str1 equals str2");
        }


    }
}
