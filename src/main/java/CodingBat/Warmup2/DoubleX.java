package CodingBat.Warmup2;

public class DoubleX {
    /*
    Given a string, return true if the first instance of "x" in the string is
    immediately followed by another "x".
    doubleX("axxbb") → true
    doubleX("axaxax") → false
    doubleX("xxxxx") → true
     */
    public boolean doubleX(String str) {
        int i = str.indexOf("x");
        return str.startsWith("xx", i);
    }
}
