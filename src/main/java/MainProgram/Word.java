package MainProgram;

public class Word {
    private String word_target;
    private String word_explain;
    private long dbID = -1;

    public String getWord_target() {
        return word_target;
    }

    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }

    public String getWord_explain() {
        return word_explain;
    }

    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }

    public long getDbID() {
        return dbID;
    }

    public void setDbID(Long dbID) {
        this.dbID = dbID;
    }

    /**
     * Format word to display form.
     *
     * @return formatted word
     */
    public String formattedWord() {
        String formattedWord;
        formattedWord = String.format("%-30s %s", "| " + word_target, "| " + word_explain);
        return formattedWord;
    }
}
