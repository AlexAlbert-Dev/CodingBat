package CodingBat.Warmup2;

public class AltPairs {
    /*
    Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
    altPairs("kitten") → "kien"
    altPairs("Chocolate") → "Chole"
    altPairs("CodingHorror") → "Congrr"
     */
    public String altPairs(String str) {
        String resultado = "";

        for(int i=0; i < str.length(); i+=4){
            resultado += str.charAt(i);
            if(i < str.length()-1)
                resultado += str.charAt(i+1);
        }
        return resultado;
    }
}
