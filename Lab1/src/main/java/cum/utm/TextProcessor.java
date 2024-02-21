package cum.utm;

public class TextProcessor {

    private String sentence;
    private final String wordToChange;
    private final Integer wordLenght;

    public TextProcessor(String sentence, String wordToChange, Integer wordLenght) {
        this.sentence = sentence;
        this.wordToChange = wordToChange;
        this.wordLenght = wordLenght;
    }

    public String[] sentenceToArrayOfWord() {
        String[] words = new String[10];
        int arrayIndex = 0;
        int startIndex = 0;
        sentence = sentence.trim();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                words[arrayIndex++] = sentence.substring(startIndex, i);
                startIndex = i + 1;
            }
        }
        words[arrayIndex] = sentence.substring(startIndex);
        return words;
    }

    public String getResultSentence() {
        String[] words = sentenceToArrayOfWord();
        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            if (word != null && word.length() == wordLenght) {
                builder.append(wordToChange).append(" ");
            } else if (word != null) {
                builder.append(word).append(" ");
            }
        }
        return builder.toString();
    }
}
