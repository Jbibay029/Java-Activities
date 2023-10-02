public class LetterCount {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        String sentence = "Hello World!";

        System.out.println("count the letter 'l' ");
        char letter = 'l';

        int count = 0;

        for (int z = 0; z < sentence.length(); z++) {
            if (sentence.charAt(z) == letter) {
                count++;
            }
        }
        System.out.println("The letter " + letter + " appears " + count + " times in the sentence");
    }

}
