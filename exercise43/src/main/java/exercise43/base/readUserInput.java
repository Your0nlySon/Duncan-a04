package exercise43.base;

import java.util.List;
import java.util.Scanner;

public class readUserInput {

    private static final Scanner in = new Scanner(System.in);

    public void rWebName(List<String> webName) {
        //ask for site name and add it to the array list
        System.out.println("Site name: ");
        webName.add(in.nextLine());
    }

    void rAuthorName(List<String> authorName) {
        //ask for author name and add it to the array list
        System.out.println("Author: ");
        authorName.add(in.nextLine());
    }

    void rJavaScript(List<String> javaScript) {
        //ask if they want a js file and add it to the array list
        System.out.println("Do you want a folder for JavaScript? ");
        javaScript.add(in.nextLine());
    }

    void rCSS(List<String> css) {
        //ask if they want a css file and add it to the array list
        System.out.println("Do you want a folder for CSS? ");
        css.add(in.nextLine());
    }
}
