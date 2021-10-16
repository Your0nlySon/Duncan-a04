package exercise43.base;

import java.io.*;
import java.util.List;

public class createFiles {

    public File createWebsite(List<String> webName) {
        //creates a website folder with the name of webName
        String websiteFile = "data/website/" + webName.get(0);
        File webFile = new File(websiteFile);
        boolean resultWeb;
        resultWeb = webFile.mkdirs();
        if (resultWeb) {
            System.out.println("Created " + websiteFile);
        } else {
            System.out.println("File already exist at location: " + websiteFile);
        }
        //then creates an index.html file that has <title> tag and the author in a <meta> tag.
        return webFile;
    }

    public File createIndex(List<String> webName, List<String> authorName) {
        String indexFile = "data/website/" + webName.get(0) + "/index.html";
        File inFile = new File(indexFile);
        boolean resultIn;
        try {
            resultIn = inFile.createNewFile();
            if (resultIn) {
                System.out.println("Created " + indexFile);
            }
            else {
                System.out.println("File already exist at location: " + indexFile);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(inFile));
            bw.write("<html><head><meta>" + authorName.get(0) + "</meta><title>" + webName.get(0) + "</title></head></html>");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inFile;
    }

    public void createJS(List<String> webName, List<String> javaScript) {
        //if else function that creates a js file
        if ("y".matches(javaScript.get(0)) || "Y".matches(javaScript.get(0))) {
            String jsFile = "data/website/" + webName.get(0) + "/js/";
            File javaSFile = new File(jsFile);
            Boolean resultJS;
            try {
                resultJS = javaSFile.createNewFile();
                if (resultJS) {
                    System.out.println("Created " + jsFile);
                } else {
                    System.out.println("File already exist at location: " + jsFile);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("Javascript file was not created");
        }
    }
        public void createCSS (List < String > webName, List < String > css){
            //if else function that creates a css file
            if ("y".matches(css.get(0)) || "Y".matches(css.get(0))) {
                String cssFile = "data/website/" + webName.get(0) + "/css/";
                File cSSFile = new File(cssFile);
                Boolean resultJS;
                try {
                    resultJS = cSSFile.createNewFile();
                    if (resultJS) {
                        System.out.println("Created " + cssFile);
                    } else {
                        System.out.println("File already exist at location: " + cssFile);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else {
                System.out.println("CSS file was not created");
            }
    }
}
