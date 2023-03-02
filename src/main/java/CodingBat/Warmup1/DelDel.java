package CodingBat.Warmup1;

public class DelDel {
    /*
    Given a string, if the string "del" appears starting at index 1,
    return a string where that "del" has been deleted. Otherwise, return the string unchanged.
    delDel("adelbc") → "abc"
    delDel("adelHello") → "aHello"
    delDel("adedbc") → "adedbc"
     */

    public String delDel(String str) {
        if (str.length() >= 4)
            if (str.substring(1,4).compareTo("del")==0 )
                return new StringBuilder(str).delete(1,4).toString();
        return str;
    }
}
