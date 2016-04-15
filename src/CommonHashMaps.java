import java.util.HashMap;

/**
 * Created by Zurab Vashakidze on 15/04/2016.
 */
public class CommonHashMaps {
    public static void main(String[] args) {
        HashMap<String,String> hashMap1 = new HashMap<>();
        HashMap<String, String> hashMap2 = new HashMap<>();
        //Filling hashmap 1
        hashMap1.put("Irakli","Mdzinara");
        hashMap1.put("Geolab", "Dzerski");
        hashMap1.put("Harry","Potter");
        hashMap1.put("Tbilisoba", "Mwvadi");
        hashMap1.put("Aba", "He");

        // Filling hashmap 2
        hashMap2.put("Geolab","Dzerski");
        hashMap2.put("Seriali","Silicon Valley");
        hashMap2.put("Zamtari","Civi");
        hashMap2.put("Irakli","Mdzinara");
        hashMap2.put("Aba","Ho");

        System.out.println("საერთო წყვილების რაოდენობაა: "+commonKeyValuePairs(hashMap1,hashMap2));

    }

    public static int commonKeyValuePairs(HashMap<String, String> map1,HashMap<String, String> map2){
        int counter = 0;
        for (String key:map1.keySet()) {
            if(map2.containsKey(key)){
                if(map2.get(key).contains(map1.get(key))){
                    counter++;
                }
            }
        }

        return counter;

    }
}