package exercise44.base;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class jsonReader {

    public JSONArray parseJSON(JSONObject jsonObject, Object obj) {
        //Create one json parser object
        JSONParser parser = new JSONParser();
        //Create a JSON Array
        JSONArray subjects = null;
        try {
            //Read json file using parser and store it in obj
            obj = parser.parse(new FileReader("data/exercise44_input.json"));
            //Create json object to read internal values
            jsonObject = (JSONObject)obj;
            //Reading products array from  the file
            subjects = (JSONArray)jsonObject.get("products");
            //Catch exceptions
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return subjects;
    }
}
