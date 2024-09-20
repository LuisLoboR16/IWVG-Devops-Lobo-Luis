package es.upm.miw.iwvg_devops.code;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public boolean isProper() {
        return Math.abs(this.numerator) < Math.abs(this.denominator);
    }

    public boolean isImproper() {
        return Math.abs(this.numerator) >= Math.abs(this.denominator);
    }

    public boolean isEquivalent(Fraction other) {
        return this.numerator * other.getDenominator() == this.denominator * other.getNumerator();
    }

    public Fraction add(Fraction other) {
        int commonDenominator = this.denominator * other.getDenominator();
        int newNumerator = (this.numerator * other.getDenominator()) + (other.getNumerator() * this.denominator);
        return new Fraction(newNumerator, commonDenominator);
    }

    public Fraction multiply(Fraction other) {
        return new Fraction(this.numerator * other.getNumerator(), this.denominator * other.getDenominator());
    }

    public Fraction divide(Fraction other) {
        return new Fraction(this.numerator * other.getDenominator(), this.denominator * other.getNumerator());
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}