package CodingBat.Warmup2;

public class CountXX {
    /*
    Count the number of "xx" in the given string.
    We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
    countXX("abcxx") → 1
    countXX("xxx") → 2
    countXX("xxxx") → 3
     */
    public int countXX(String str) {
        if (str.length() < 2)
            return 0;
        int contador = 0;
        for(int i = 0; i < str.length()-1; i++) {
            if(str.substring(i, i+2).compareTo("xx")==0)
                contador += 1;
        }
        return contador;
    }
}
