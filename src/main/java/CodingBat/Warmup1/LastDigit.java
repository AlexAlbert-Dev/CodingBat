package CodingBat.Warmup1;

public class LastDigit {
    /*
    Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
    Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
    lastDigit(7, 17) → true
    lastDigit(6, 17) → false
    lastDigit(3, 113) → true
     */
    public boolean lastDigit(int a, int b) {
      do { a = a % 10; }
      while (Integer.toString(a % 10).length() != 1);
      do { b = b % 10; }
      while (Integer.toString(b % 10).length() != 1);

      return (a == b) ? true : false;
    }
}
