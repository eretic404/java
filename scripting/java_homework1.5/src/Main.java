
public class Main {
    public static void main(String args[]) {
        String word1 = "ГОВНО";
        String word2 = "ПОВНО С ГОВНОМ";
        if (!word1.isEmpty() && !word2.isEmpty() &&
            word1.charAt(0) == word2.charAt(0)) {
            System.out.println("Первые буквы совпадают.");
        } else {
            System.out.println("Первые буквы не совпадают.");
        }
    }
}