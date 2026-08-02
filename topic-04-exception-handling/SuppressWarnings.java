import java.util.*;

class SuppressWarnings {
    @SuppressWarnings("unchecked")
    static void wordsList() {
        ArrayList words = new ArrayList<>();

// This causes an unchecked warning
        wordList.add("programiz");

        System.out.println("Word list => " + wordList);
    }

    public static void main(String[] args) {
        wordsList();
    }
}