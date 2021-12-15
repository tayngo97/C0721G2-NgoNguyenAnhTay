package bai21_structural_pattern.translation_adapter;

public class JapaneseAdaptee {
    public void receive(String words){
        System.out.println("Retrieving words from Adapter ...");
        System.out.println(words);
    }
}
