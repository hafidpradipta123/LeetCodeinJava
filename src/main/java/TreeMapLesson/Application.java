package TreeMapLesson;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Application {
    public static void main(String[] args){
        LinkedHashMap<String, String> dictionary = new LinkedHashMap<String, String>();
        dictionary.put("Makan", "Kegiatan masukin makanan ke mulut");
        dictionary.put("Minum", "Kegiatan masukin air ke mulut");
        dictionary.put("Jalan", "Kegiatan masukin angkat kaki kiri dan kanan");

        for (String word: dictionary.keySet()){
            System.out.println(dictionary.get(word));
        }


    }
}
