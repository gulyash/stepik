import java.util.function.DoubleUnaryOperator;

public class RectangleMethod {
    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));//10.0
        System.out.println(integrate(x -> x + 2, 0, 10));//70.0
        System.out.println(integrate( x -> Math.sin(x) / x , 1, 5));//0.603848
    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double result = 0;
        double eps = Math.pow(10, -6);
        double x1=a;
        while (x1<b) {
            result+=f.applyAsDouble(x1)*eps;
            x1+=eps;
        }
        return result;
    }
}
