/**
 * Each Fraction object represents an immutable rational number with a numerator and denominator.
 * Fractions are always stored in reduced form such that the GCD of their
 * numerator and denominator is always 1.
 * Class Fraction is incomplete and mutable
 * Let's make it complete and immutable!
 *
 * @pre to all methods: valid arguments  (I know, I know...)
 */
public class Fraction implements Cloneable, Comparable<Fraction> {
    private int numerator, denominator;

    public Fraction(int numerator){
        this(numerator, 1);
    }

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public void setNumerator(int n){
        numerator = n;
    }

    public void setDenominator(int d){
        denominator = d;
    }

    public Fraction clone(){
        return null;
    }

    public int compareTo(Fraction other){
        return 0;
    }

    @Override
    public boolean equals(Object o){
        return false;
    }

    @Override
    public String toString(){
        if (denominator == 1) {
            return String.valueOf(numerator);
        } else {
            return numerator + "/" + denominator;
        }
    }

    //This add method is currently mutable
    public void add(Fraction other){
        numerator = numerator * other.denominator
                + other.numerator * denominator;
        denominator = denominator * other.denominator;
        reduce();   // private helper to reduce fraction
    }

    private void reduce(){
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator /gcd;
        this.denominator = denominator /gcd;
    }

    public void subtract(Fraction other){
    }

    public void multiply(Fraction other){

    }

    public void divide(Fraction other){

    }

    //this method returns greatest common divisor of x and y
    //-6 and 4 is 2
    private static int gcd(int x, int y){
        if( y == 0 )
            return Math.abs(x);
        else
            return gcd(y, x % y);
    }
}
