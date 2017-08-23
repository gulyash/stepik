

public class Test {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    private static String getCallerClassAndMethodName() {

        StringBuilder sb = new StringBuilder();
        try {
            sb.append(Thread.currentThread().getStackTrace()[3].getClassName());
            sb.append("#" + Thread.currentThread().getStackTrace()[3].getMethodName());
            return sb.toString();
        }
        catch (ArrayIndexOutOfBoundsException e){
            return null;
        }

    }
}
