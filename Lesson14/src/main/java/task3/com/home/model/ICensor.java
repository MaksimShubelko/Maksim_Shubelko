package task3.com.home.model;

import java.util.List;

public interface ICensor {
    boolean checkCensor(List<String> text, List<String> censorship);
}
