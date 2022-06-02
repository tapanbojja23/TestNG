package otherTopic;



import java.util.Collection;
import java.util.HashMap;

public class HashmapTest {

    public static void main(String[] args) {

        //  parameterized class
        HashMap<Integer, String> hashmap = new HashMap<>();
        hashmap.put(1,"Sagar");
        hashmap.put(2,"Nisha");
        hashmap.put(3,"Tanush");
        hashmap.put(4,"123");
        hashmap.put(4,"456");
        hashmap.put(4,"789"); // Sagar, Nisha,Tanush,789
        hashmap.put(null,"Waghmare" );
        System.out.println(hashmap.get(0)); // null
        System.out.println(hashmap.get(1)); // Sagar



        for (int i =1; i<=hashmap.size();i++)
        {
            System.out.println(hashmap.get(i));
        }
        System.out.println(hashmap.entrySet());
        hashmap.getOrDefault(1, "abc");
        System.out.println(hashmap.get(1));


        HashMap<Integer, String> hashmap1 = new HashMap<>();
        hashmap1.put(8,"kba");
        hashmap1.putAll(hashmap);
        System.out.println(hashmap1);
        hashmap1.remove(1);
        hashmap1.remove(1, "sagar");
        hashmap1.replace(8,"aBC");

        System.out.println(hashmap1);
        System.out.println(hashmap1.size());
        System.out.println(hashmap1.values());


        System.out.println(hashmap1.values().stream().sorted().toString());





        System.out.println(hashmap1.hashCode());

    }






}
