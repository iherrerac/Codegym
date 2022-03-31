package codegym;

import java.io.*;

/* 
Let's make the code do something useful!

*/

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            String sourceFileName = reader.readLine();
            InputStream fileInputStream = getInputStream(sourceFileName);
        }catch(IOException e){
            System.out.println("File does not exist.");
            try{
            	String sourceFileName = reader.readLine();
            	InputStream fileInputStream = getInputStream(sourceFileName);
            }catch(IOException a){
                
            }
        }
        
        String destinationFileName = reader.readLine();
        OutputStream fileOutputStream = getOutputStream(destinationFileName);

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}
