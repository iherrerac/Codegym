package codegym;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Task about algorithms

*/

public class ArraySortStringManual {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (isGreaterThan(array[i], array[j])) {
					String temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
    }

    // String comparison method: 'a' is greater than 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}