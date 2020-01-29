package reader.criteria;

public class LengthAtLeast implements Criterion {


    private int length;

    public LengthAtLeast(int length) {
        this.length = length;
    }

    @Override
    public boolean complies(String line) {

        if (line.length() >= this.length) {
            return true;
        }

        return false;
    }
}
