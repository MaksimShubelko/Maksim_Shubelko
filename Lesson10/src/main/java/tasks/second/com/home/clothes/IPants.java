package tasks.second.com.home.clothes;

import tasks.second.com.home.utils.Clothes;

public interface IPants {
    default String showResult() {
        return Clothes.PANTS_ACTION.getResult();
    }
}
