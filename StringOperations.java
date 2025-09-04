/*Khang Nguyen
AP Comp Sci A
8/29/2025*/

public class StringOperations{
    public static void main(String args[]){
        /*Challenge 1
        This program outputs the scrambled (first and last letters swapped) form of each word.*/
        String word = "popcorn";
        String fwordl = word.substring(0, 1);
        String mworldl = word.substring(1, word.length - 1);
        String lwordl = word.substring(word.length - 1);
        String scram = lwordl + mworldl + fwordl;

        System.out.print(scram);

        word = "picture";
        fwordl = word.substring(0, 1);
        mworldl = word.substring(1, word.length - 1);
        lwordl = word.substring(word.length - 1);
        scram = lwordl + mworldl + fwordl;

        System.out.print(scram);

        word = "computer";
        fwordl = word.substring(0, 1);
        mworldl = word.substring(1, word.length - 1);
        lwordl = word.substring(word.length - 1);
        scram = lwordl + mworldl + fwordl;

        System.out.print(scram);

        /*Challenge 2
        Using escape sequences, this program outputs ASCII art in one line.*/

        System.out.print("|\\---/|\n| O_O |\n \\_^_/");
    }
}