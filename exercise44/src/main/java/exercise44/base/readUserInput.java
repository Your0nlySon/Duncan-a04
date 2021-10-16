package exercise44.base;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class readUserInput {

    public void readInput(JSONArray subjects) {
        try {
            //Create buffered reader object to take user input
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            //Create string variable
            String input;
            //Flag is used whether given string is present or not
            int flag = 0;
            System.out.print("What is the product name? ");
            input = bufferedReader.readLine();
            //Create iterator for products array
            Iterator iterator = subjects.iterator();
            //Loop through the iterator
            while (iterator.hasNext()) {
                //Create another json
                JSONObject json = (JSONObject) iterator.next();
                //Get the name value
                String name = (String)json.get("name");
                //Compare it with given input
                if(input.toLowerCase().equals(name.toLowerCase())){
                    System.out.println("Name: "+name);
                    System.out.println("Price: "+json.get("price"));
                    System.out.println("Quantity: "+json.get("quantity"));
                    flag = 1;
                }
            }
            //If flag value is zero, then value is not found
            if(flag == 0) {
                System.out.println("Sorry, that product was not found in our inventory");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

