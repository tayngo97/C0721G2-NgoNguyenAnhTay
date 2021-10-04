package bai21_structural_pattern.translation_adapter;

public class VietnameseClient {
    public static void main(String[] args) {
        VietnameseTarget client = new TranslatorAdapter(new JapaneseAdaptee());
        client.send("Xin chao");
    }
}
