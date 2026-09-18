package main.week2.assignment_problems;
public class WordReversalEncoder {

    static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        String result = "";

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();

            result = result + sb + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {
        String sentence = "hello club";

        System.out.println(reverseEachWord(sentence));
    }
}