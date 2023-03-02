package CodingBat.Warmup1;

public class StartOz {
    /*
    Given a string, return a string made of the first 2 chars (if present),
    however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

    startOz("ozymandias") → "oz"
    startOz("bzoo") → "z"
    startOz("oxx") → "o"
     */

    public String startOz(String str) {
        String stringFinal = "";
        if (str.indexOf("o", 0)==0)
            stringFinal+="o";
        if (str.indexOf("z", 1)==1)
            stringFinal+="z";
        if (stringFinal=="")
            return "";
        return stringFinal;
    }
}
