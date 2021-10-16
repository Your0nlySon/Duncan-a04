package exercise43.base;

import java.util.ArrayList;
import java.util.List;

public class Solution43 {

        private List<String> webName = new ArrayList<>();
        private List<String> authorName = new ArrayList<>();
        private List<String> javaScript = new ArrayList<>();
        private List<String> css = new ArrayList<>();
        readUserInput rUI = new readUserInput();
        createFiles cF = new createFiles();

    public static void main(String[] args) {
        Solution43 sol = new Solution43();

        //call methods
        sol.readUI();
        sol.createF();
    }

    private void readUI() {
        //calls the read class functions
        rUI.rWebName(webName);
        rUI.rAuthorName(authorName);
        rUI.rJavaScript(javaScript);
        rUI.rCSS(css);
    }

    private void createF() {
        //calls the createF class functions
        cF.createWebsite(webName);
        cF.createIndex(webName, authorName);
        cF.createJS(webName, javaScript);
        cF.createCSS(webName, css);
    }
}
