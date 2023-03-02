package CodingBat.Warmup1;

public class StringE {
    /*
    Return true if the given string contains between 1 and 3 'e' chars.
    stringE("Hello") → true
    stringE("Heelle") → true
    stringE("Heelele") → false
     */

    public boolean stringE(String str) {
        if (str.contains("e")) {
            int contador = 0;
            for (int i = 0; i < str.length(); i++) {
                char caractere = str.charAt(i);
                if (caractere == 'e')
                    contador+=1;
            }
            return (contador > 0 && contador < 4) ? true : false;
        }
        return false;
    }

}
