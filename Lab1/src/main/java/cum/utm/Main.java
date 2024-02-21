package cum.utm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        String sentence ;
        int wordLenght;
        String myWord;
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(is);
        try {
            System.out.println("Itrodu propozitia: ");
            sentence = reader.readLine();
            System.out.println("Introdu lungimea cuvantului inlocuit");
            wordLenght = Integer.parseInt(reader.readLine());
            System.out.println("Introdu cuvintul care trebuie inlocuit");
            myWord = reader.readLine();
            TextProcessor processor = new TextProcessor(sentence,myWord,wordLenght);
            System.out.println("Result: "+processor.getResultSentence());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}