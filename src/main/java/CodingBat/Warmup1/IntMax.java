package CodingBat.Warmup1;

public class IntMax {
    /*
    Given three int values, a b c, return the largest.
    intMax(1, 2, 3) → 3
    intMax(1, 3, 2) → 3
    intMax(3, 2, 1) → 3
     */

    public int intMax(int a, int b, int c) {
        if (a >= b && a >= c)
            return a;
        return (b >= a && b >= c) ? b : c;
    }


}
