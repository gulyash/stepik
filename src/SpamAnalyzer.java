public class SpamAnalyzer extends KeywordAnalyzer{
    private String[] keywords;

    public SpamAnalyzer(String[] k) {
        keywords = k;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}
