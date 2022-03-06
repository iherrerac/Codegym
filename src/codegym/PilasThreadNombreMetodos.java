package codegym;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Iterator;

/* 
Index 1 es el methodo actual, index 2
es el metodo anterior que lo invoca

*/

public class PilasThreadNombreMetodos {
    public static void main(String[] args) throws Exception {
        System.out.println(method1());
        System.out.println(method2());
        System.out.println(method3());
        System.out.println(method4());
    }

    public static String method1() {
        method2();
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
    	return st[1].getMethodName();
    }

    public static String method2() {
        method3();
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
    	return st[1].getMethodName();
    }

    public static String method3() {
        method4();
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
    	return st[1].getMethodName();
    }

    public static String method4() {
        method5();
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
    	return st[1].getMethodName();
    }

    public static String method5() {
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
    	return st[1].getMethodName();
    }
}