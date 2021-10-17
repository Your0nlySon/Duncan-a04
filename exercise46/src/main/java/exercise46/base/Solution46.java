package exercise46.base;

public class Solution46 {

    readFile rF = new readFile;
    printFrequency pF = new printFrequency();
    String fileName = "data/exercise46_input.txt";

    public static void main(String[] args) {
        Solution46 sol = new Solution46();

        sol.readFile();
        sol.frequencyPrint();
    }

    private String readFile() {
       return rF.fileRead(fileName);
    }

    private void frequencyPrint() {
        pF.fPrint(readFile());
    }
}
