import java.util.Scanner; 

public class Replace_character{
  /** Main method */
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
        return temp;
    }
    public static void main(String[] args) {
        String str = "";
        System.out.println(myReplace("r?plac?abl? charact?r", '?', 'e'));
    }
}
