public class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;

    public TooLongTextAnalyzer(int m) {
        maxLength = m;
    }

    @Override
    public Label processText(String text) {
        if (text.length()>maxLength) return Label.TOO_LONG;
        return Label.OK;
    }
}
