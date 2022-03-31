package codegym;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Method in a try-catch

*/

public class ExcepcionesEnMetodo {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        List<Integer> listNums = new ArrayList<Integer>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                listNums.add(Integer.parseInt(r.readLine()));
            }
        } catch (Exception e) {
            for (Integer value : listNums) {
                System.out.println(value);
            }
        }
    }
}