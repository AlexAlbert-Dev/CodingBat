package CodingBat.Warmup1;

public class EveryNth {
    /*
    Given a non-empty string and an int N, return the string made starting with char 0,
    and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on.
    N is 1 or more.
    everyNth("Miracle", 2) → "Mrce"
    everyNth("abcdefg", 2) → "aceg"
    everyNth("abcdefg", 3) → "adg"
     */
    public String everyNth(String str, int n) {
        String strFinal = String.valueOf(str.charAt(0));
        int contador = n;
        while (contador < str.length()){
            strFinal+= String.valueOf(str.charAt(contador));
            contador+=n;
        }
        return strFinal;
    }
}
