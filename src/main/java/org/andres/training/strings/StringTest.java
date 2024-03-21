package org.andres.training.strings;

public class StringTest {
    public static void main(String[] args) {
        String strName = "John Doe";
        String textBlockName = """
                John Doe""";

        System.out.println(strName.equals(textBlockName));
        System.out.println(strName == textBlockName);
    }
}
