package exercise45.base;

public class replaceWord {
    public String wordReplace(String fileRead) {
        //create string called 'replaceString' and equal it to fileRead.replaceAll("utilize","use")
        String replaceString = fileRead.replaceAll("utilize", "use");
        //return 'replaceString'
        return replaceString;
    }
}
