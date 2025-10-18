package org.andres.inner_class;

public class OuterClass {
    private final int outerData = 10;

    public void createAndUseInnerClass() {
        InnerClass innerClass = new InnerClass();
        innerClass.displayInnerData();
    }

    private class InnerClass {
        public void displayInnerData() {
            System.out.println("OuterData from inner class: " + OuterClass.this.outerData);
        }
    }
}
