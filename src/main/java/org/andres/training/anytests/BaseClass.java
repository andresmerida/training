package org.andres.training.anytests;

class BaseClass {

    private String msg = "Hello Geeks";

    protected void Msg() {
        System.out.println("This is the protected method");
    }

    public void Msg2() {
        System.out.println("Private variable having message: " + msg);
    }

    void defaultMsg() {
        System.out.println("This method having default modifier");
    }
}
