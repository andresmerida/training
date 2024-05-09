package org.andres.training.common;

public class FinalFinallyFinalizeObject {
    private final int CI_NUMBER = 1;

    public void someMethod() {
        try {
            int number = Integer.parseInt("1");
            System.out.println(number);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Execute after try or catch.");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize execution");
    }

    public static void main(String[] args) {
        FinalFinallyFinalizeObject object = new FinalFinallyFinalizeObject();
        object.someMethod();
        object = null;
        System.gc();
    }
}
