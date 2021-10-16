package exercise44.base;

import org.json.simple.*;

public class Solution44 {

    private static JSONObject jsonObject;
    private static Object obj;
    jsonReader jR = new jsonReader();
    readUserInput uR = new readUserInput();

    public static void main(String[] args) {
        Solution44 sol = new Solution44();

        sol.readJSON();
        sol.uInputRead();
    }

    private void uInputRead() {
        uR.readInput(readJSON());
    }

    private JSONArray readJSON() {
        return jR.parseJSON(jsonObject, obj);
    }
}


