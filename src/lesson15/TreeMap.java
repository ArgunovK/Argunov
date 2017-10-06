package lesson15;

import java.util.Map;

/**
 * Created by Админ on 26.09.2017.
 */
public class TreeMap {
    public static void main(String args[]){
        Toy toy1= new Toy("Doll",4);
        Toy toy2= new Toy ("Box", 5);
        Toy toy3= new Toy ("Car", 7);
        Map<String, Toy> map= new java.util.TreeMap<>();

        map.put(toy1.getName(), toy1);
        map.put(toy2.getName(), toy2);
        map.put(toy3.getName(), toy3);

        for (Toy toy : map.values()){
            System.out.println(toy);
        }

        for (String key : map.keySet()){
            System.out.println(key);
            System.out.println(map.get(key));
        }

        for (Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
