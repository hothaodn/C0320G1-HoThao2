package models;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class DictionaryDao {
    private static Map<String,String> listWords;
    static {
        listWords = new HashMap<>();
        listWords.put("blue","xanh duong");
        listWords.put("red","do");
        listWords.put("pink","hong");
        listWords.put("green","xanh la");
        listWords.put("black","den");
        listWords.put("white","trang");
        listWords.put("orange","cam");
        listWords.put("yellow","vang");
    }

    public static String findById(String id){
        return listWords.get(id);
    }
}
