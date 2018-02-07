package org.noob2ee.padavan.level0.ratio;

public class Fraction implements Comparable<Fraction>, IFraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator <= 0) {
            throw new IllegalArgumentException("Denominator must be positive");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static int gcd(int a, int b) {//in fact this function must not belong to this class
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public Fraction plus(Fraction fraction) {
        int num = this.numerator * fraction.denominator + this.denominator * fraction.numerator;
        int den = this.denominator * fraction.denominator;
        int gcd = gcd(num, den);
        return new Fraction(num / gcd, den / gcd);
    }

    @Override
    public Fraction minus(Fraction fraction) {
        return null;
    }

    @Override
    public Fraction multiply(Fraction fraction) {
        return null;
    }

    @Override
    public Fraction divide(Fraction fraction) {
        return null;
    }

    public String prettyShow() {
        String result;
        if (numerator == denominator) {
            result = String.valueOf(numerator);
        } else {
            result = numerator + "/" + denominator;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    @Override
    public int compareTo(Fraction fraction) {
        return 0;//todo
    }
}
