package tasks.second.com.home.clothes;

import tasks.second.com.home.utils.Clothes;

public interface IShoes {
    default String showResult() {
        return Clothes.SHOES_ACTION.getResult();
    }
}
