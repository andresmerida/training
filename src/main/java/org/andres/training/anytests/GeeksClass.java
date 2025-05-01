package org.andres.training.anytests;

public class GeeksClass {

    public static void main(String[] args) {
        // creating the object of baseclass
        BaseClass baseClass = new BaseClass();
        // calling the protected method from base class
        baseClass.Msg();
        baseClass.Msg2();
        baseClass.defaultMsg();
    }
}
