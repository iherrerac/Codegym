package codegym;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
What's today's date?

*/

public class FechasCambioFormato {

    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat dfNew = new SimpleDateFormat ("MMM dd, yyyy", Locale.ENGLISH);
        SimpleDateFormat dfOld = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date fecha = dfOld.parse(r.readLine());
        System.out.println((dfNew.format(fecha)).toUpperCase());
    }
}