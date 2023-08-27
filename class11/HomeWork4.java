package class11;

public class HomeWork4 {
    public static void main(String[] args) {
// How would you find out how many sentences are in that String?
//How would you reverse a String word by word? for example
//        // input=>This is sentence i want to reverse
//        // output=>sihT si ecnetnes i tnaw ot esrever

        String str = "Is it saturday? Is it raining? Do we have a Java Class today?";

        // Split the string based on sentence-ending punctuation marks
        String[] sentences = str.split("[.!?]");

        // Count the number of sentences
        int sentenceCount = sentences.length;

        System.out.println("Number of sentences: " + sentenceCount);
    }

}









