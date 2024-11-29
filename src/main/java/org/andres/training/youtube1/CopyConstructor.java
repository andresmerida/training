package org.andres.training.youtube1;

public class CopyConstructor {

    public static void main(String[] args) {
        // creating object of above class
        Complex c1 = new Complex(10, 15);

        // Following involves a copy constructor call
        Complex c2 = new Complex(c1);

        System.out.println(c2);
    }

    static class Complex {
        private final double re;
        private final double im;

        public Complex(double re, double im) {
            // this keyword refers to current instance itself
            this.re = re;
            this.im = im;
        }

        public Complex(Complex c) {
            this(c.re, c.im);
        }

        @Override
        public String toString() {
            return "Complex{" +
                    "re=" + re +
                    ", im=" + im +
                    '}';
        }
    }
}
