import java.util.HashMap;

public class HashMapFunction {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Sujitha");
        map.put(2,"Pragna");
        map.put(3,"Pratyu");
        map.put(4,"Varshi");
        map.put(5,"rupa");
        System.out.println(map.get(1));
        System.out.println(map);
        map.put(2,"sree");
        System.out.println(map.get(2));
        map.remove(3,"Partyu");
        System.out.println(map);
        map.containsKey(2);
        map.containsValue("sree");
        System.out.println("Iterating through HashMap");
        for (Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
        for (String value : map.values()) {
            System.out.println(value);
        }
        map.putIfAbsent(1,"sujii");
        map.put(6,"vani");
        System.out.println(map);

    }
}
