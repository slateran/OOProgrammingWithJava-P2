package reader.criteria;

import java.util.ArrayList;
import java.util.List;

public class AtLeastOne implements Criterion {

    private Criterion[] criterionArray;
    private List<Criterion> criterionList;

    public AtLeastOne(Criterion... criterionArray) {
        this.criterionArray = criterionArray;
        this.criterionList = new ArrayList<Criterion>();

        for(Criterion c : criterionArray){
            criterionList.add(c);
        }
    }

    public boolean complies(String line) {

        for(Criterion c : criterionList){
            if(c.complies(line)){
                return true;
            }
        }

        return false;

    }
}
