package CodingBat.Warmup1;

public class MixStart {
    /*
    Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
    mixStart("mix snacks") → true
    mixStart("pix snacks") → true
    mixStart("piz snacks") → false
     */

    public boolean mixStart(String str) {
        if (str.length()>2)
            if (str.substring(1,3).compareTo("ix")==0)
                return true;
        return false;
    }
}
