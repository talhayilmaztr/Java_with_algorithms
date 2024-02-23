import java.util.Scanner; 

public class Replace_character{
  
    public static String myReplace(String str, char orj, char rep) {
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == orj) {
                temp += rep;
                //continue;
            } else{
                temp += str.charAt(i);
            }
        }
        return temp;
    }
    public static String myReplace(String str, String orj, String rep) {
        String temp = "";
        String words [] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(orj)) {
                temp += rep + " ";
                //continue;
            } else{
                temp += words[i] + " ";
            }
        }
        return temp;
    }
    public static void main(String[] args) {

        System.out.println(myReplace("r?plac?abl? charact?r", '?', 'e'));
        System.out.println(myReplace("This is an apple that is also an apple An apple a day keeps the doctor away.", "apple", "orange"));
    }
}
