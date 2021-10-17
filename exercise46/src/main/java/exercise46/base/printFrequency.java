package exercise46.base;

import java.util.Map;
import java.util.TreeMap;

public class printFrequency {

    public Map<String, String> fPrint(String readFile) {
        //create map called wordCount
        Map<String, String> wordCount = new TreeMap<>();
        //splitting to find the word
        String arr[] = readFile.split(" ");
        //create for loop to iterate through the words
        for(int i = 0; i < arr.length; i++)  {
            if(wordCount.containsKey(arr[i]))
            {
                wordCount.put(arr[i], wordCount.get(arr[i])+ "*");
            }
            else
            {
                wordCount.put(arr[i],"*");
            }
        }
        //check if the element of the array is in the hash-map
        //for loop that prints the map
        for(Map.Entry<String,String> entry:
                wordCount.entrySet())
        {
            System.out.println(entry.getKey()+
                    " - "+entry.getValue());
        }
        return wordCount;
    }
}
