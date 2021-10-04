package bai21_structural_pattern.translation_adapter;

public class TranslatorAdapter implements VietnameseTarget{
    private JapaneseAdaptee adaptee;

    public TranslatorAdapter(JapaneseAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void send(String word) {
        System.out.println("Reading Words ...");
        System.out.println(word);
        String vietnameseWords = this.translate(word);
        System.out.println("Sending Words ...");
        adaptee.receive(vietnameseWords);
    }

    public String translate(String vietnameseWords){
        System.out.println("Translated!");
        return "こんにちは";
    }
}
