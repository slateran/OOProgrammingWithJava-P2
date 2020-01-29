package reader.criteria;

public class Both implements Criterion {

    private Criterion endsWithQuestionOrExclamationMark;
    private Criterion containsWord;

    public Both(Criterion endsWithQuestionOrExclamationMark, Criterion containsWord) {
        this.endsWithQuestionOrExclamationMark = endsWithQuestionOrExclamationMark;
        this.containsWord = containsWord;
    }

    @Override
    public boolean complies(String line) {

        if(containsWord.complies(line) && endsWithQuestionOrExclamationMark.complies(line)){
            return true;
        }
        return false;
    }
}
