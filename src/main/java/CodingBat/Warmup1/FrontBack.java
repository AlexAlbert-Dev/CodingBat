package CodingBat.Warmup1;

public class FrontBack {
    /*
    Given a string, return a new string where the first and last chars have been exchanged.
    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"
     */
    public String frontBack(String str) {
        if (str.length() == 0 || str.length() == 1)
            return str;
        else return new StringBuilder(str).reverse().charAt(0) +
                str.subSequence(1, str.length()-1).toString() +
                new StringBuilder(str).reverse().charAt(str.length()-1);
    }
}
