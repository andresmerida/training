package org.andres.training.lambda_expressions.example;

public class TestLambdaExpression {
    // operation is implemented using lambda expressions
    interface FuncInter1 {
        int operation(int a, int b);
    }

    // sayMessage() is implemented using lambda expressions
    interface FuncInter2 {
        void sayMessage(String message);
    }

    // performs FuncInter1's operation on 'a' and 'b'
    private int operate(int a, int b, FuncInter1 funcInter1) {
        return funcInter1.operation(a, b);
    }

    public static void main(String[] args) {
        // lambda expression for addition for two parameters data type for x and y is optional.
        // This expression implements 'FuncInter1' interface
        FuncInter1 add = Integer::sum;

        // lambda expression multiplication for two parameters. This expression also implements FuncInter1 interface
        FuncInter1 multiply = (a, b) -> a * b;

        // Creating an object of Test to call operate using different implementations using lambda expressions
        TestLambdaExpression test = new TestLambdaExpression();

        // Add two numbers using lambda expression
        System.out.println("Addition is " + test.operate(6, 3, add));

        // Multiply two numbers using lambda expression
        System.out.println("Multiplication is " + test.operate(6, 3, multiply));

        // lambda expression fo single parameter. This expression implements 'FuncInter2' interface
        FuncInter2 fObj = message -> System.out.println("Hello " + message);
        fObj.sayMessage("Geek");
    }
}
