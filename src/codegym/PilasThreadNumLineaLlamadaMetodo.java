package codegym;


/* 
Who called me?

*/

public class PilasThreadNumLineaLlamadaMetodo {
    public static void main(String[] args) throws Exception {
        System.out.println(method1());
        System.out.println(method2());
        System.out.println(method3());
        System.out.println(method4());
        System.out.println(method5());
    }

    public static int method1() {
        method2();
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
        return  st[2].getLineNumber();
    }

    public static int method2() {
        method3();
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
        return  st[2].getLineNumber();
    }

    public static int method3() {
        method4();
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
        return  st[2].getLineNumber();
    }

    public static int method4() {
        method5();
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
        return  st[1].getLineNumber();
    }

    public static int method5() {
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
        return  st[2].getLineNumber();
    }
}
