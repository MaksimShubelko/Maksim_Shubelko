package task3.com.home.model;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Collection;
import java.util.List;


public class CheckCensorship implements ICensor {

    public boolean checkCensor(List<String> text, List<String> censorship) {
        Collection<String> intersection = CollectionUtils.intersection(text, censorship);

        return intersection.isEmpty();
    }
}
