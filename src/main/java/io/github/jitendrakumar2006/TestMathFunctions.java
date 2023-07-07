package io.github.jitendrakumar2006;

/**
 * The type Test math functions.
 */
public class TestMathFunctions {

    /**
     * Sum int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    public int sum(int a, int b) {
        return a + b;
    }

    /**
     * Sub int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    public int sub(int a, int b) {
        return a - b;
    }

    /**
     * Mult int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    public int mult(int a, int b) {
        return a * b;
    }

    /**
     * Div int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    public int div(int a, int b) {
        return a / b;
    }

    /**
     * Rem int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    public int rem(int a, int b) {
        return a % b;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        TestMathFunctions tmf = new TestMathFunctions();
        int sum30 = tmf.sum(10,20);
        System.out.println("sum(10,20) is : " + sum30);
    }
}
