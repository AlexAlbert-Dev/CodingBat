package CodingBat.Warmup2;

public class StringMatch {
    /*
    Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
    So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
    stringMatch("xxcaazz", "xxbaaz") → 3
    stringMatch("abc", "abc") → 2
    stringMatch("abc", "axc") → 0
     */
    public int stringMatch(String a, String b) {
        int contador = 0;
        int menorComprimento = a.length() < b.length() ? a.length() : b.length();
        for(int i=0; i < menorComprimento-1; i++) {
            if(a.substring(i, i+2).compareTo(b.substring(i, i+2))==0)
                contador++;
        }
        return contador;
    }
}
