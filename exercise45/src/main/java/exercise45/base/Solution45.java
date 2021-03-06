package exercise45.base;

public class Solution45 {

    readFile rF = new readFile();
    replaceWord rW = new replaceWord();
    writeToFile wF = new writeToFile();
    askFileName aF = new askFileName();
    String fileName = "data/exercise44_input.txt";

    public static void main(String[] args) {
        Solution45 sol = new Solution45();

        sol.fileRead();
        sol.wordReplace();
        sol.askFileName();
        sol.fileWrite();
    }

    private String askFileName() {
        return aF.askFN();
    }

    private String fileRead() {
        return rF.fileRead(fileName);
    }

    private String wordReplace() {
        return rW.wordReplace(fileRead());
    }

    private void fileWrite() {
        wF.fileWrite(wordReplace(), askFileName());
    }
}
