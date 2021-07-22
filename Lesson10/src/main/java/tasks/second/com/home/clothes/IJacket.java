package tasks.second.com.home.clothes;

import tasks.second.com.home.utils.Clothes;

public interface IJacket {
    default String showResult() {
        return Clothes.JACKET_ACTION.getResult();
    }
}
