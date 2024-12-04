package org.andres.training.youtube1;

public class MarkerInterface {
    public static void main(String[] args) throws CloneNotSupportedException {
        A a = new A(20, "GeeksForGeeks");
        // cloning 'a' and holding new cloned object reference in b
        // down-casting as clone() return type is Object
        A b = (A) a.clone();

        System.out.println(b.i);
        System.out.println(b.s);
    }

    static class A implements Cloneable {
        int i;
        String s;

        public A(int i, String s) {
            this.i = i;
            this.s = s;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
        // just adding a comment
    }
}
