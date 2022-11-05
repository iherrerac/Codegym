package codegym.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class L101CountLettersOf10Words {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alphabet
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }

        // Read in strings
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s;
			try {
				s = reader.readLine();
				list.add(s.toLowerCase());
			} catch (IOException e) {
				e.printStackTrace();
			}
            
        }

        Map<Character, Integer> resultMap = new HashMap<>();
        alphabet.forEach(key->resultMap.put(key, 0));
        for(String word : list){
            for (Character wordLetter : word.toCharArray() ){
                if(resultMap.keySet().contains(wordLetter))
                	resultMap.put(wordLetter,resultMap.get(wordLetter)+1);
                //forEach(letter -> letter.equals(wordLetter));
            }
        }
        
        resultMap.forEach((key,value)-> System.out.println(key+" "+value));
	}

}
