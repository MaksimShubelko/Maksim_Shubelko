package tasks.second.com.home.utils;

import lombok.Getter;

@Getter
public enum Clothes {
    JACKET_ACTION("Вы взаимодействовали с курткой"),
    SHOES_ACTION("Вы взаимодействовали с обувью"),
    PANTS_ACTION("Вы взаимодействовали со штанами"),
    CLOTHES_ACTION_TAKE_OFF(" (снято)"),
    CLOTHES_ACTION_TAKE_ON(" (одето)");


    private final String result;

    Clothes(String result) {
        this.result = result;
    }
}
