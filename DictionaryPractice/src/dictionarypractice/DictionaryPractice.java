
package dictionarypractice;

import java.util.HashMap;
import java.util.Map;


public class DictionaryPractice {

    
    
    public static void main(String[] args) {
        // English to Spanish dictionary
        Map<String,String> englSpanDictionary = new HashMap<String, String>();
        // puting things inside our dictionary
        englSpanDictionary.put("Monday", "Lunes");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miercoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "Viernes");
        // Retrieve things from ur dictionary
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));
        // print out all keys 
        System.out.println(englSpanDictionary.keySet());
        // print out all values
        System.out.println(englSpanDictionary.values());
        // print out length
        System.out.println(englSpanDictionary.size());
        
        System.out.println();
        System.out.println();
        
        // Shping list
        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", true);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Sugar", Boolean.FALSE);
        // Retrieve items
        System.out.println( shoppingList.get("Oreos"));
        System.out.println( shoppingList.get("Sugar"));
        // show  key=value pair 
        System.out.println( shoppingList.toString());
        System.out.println( shoppingList.toString());
        System.out.println( shoppingList.containsKey("Eggs"));
    }
    
}
