package tasks.first.com.home.utils;

import lombok.Getter;

@Getter
public enum Actions {
    SONY_HEAD_SAYS("Sony head"),
    SAMSUNG_HEAD_SAYS("Samsung head"),
    TOSHIBA_HEAD_SAYS("Toshiba head"),
    SONY_HAND_MOVES("Sony hand move's"),
    SAMSUNG_HAND_MOVES("Samsung hand move's"),
    TOSHIBA_HAND_MOVES("Toshiba hand move's"),
    SONY_LEG_MOVES("Sony leg move's"),
    SAMSUNG_LEG_MOVES("Samsung leg move's"),
    TOSHIBA_LEG_MOVES("Toshiba leg move's");

    private final String action;

    Actions(String action) {
        this.action = action;
    }
}
