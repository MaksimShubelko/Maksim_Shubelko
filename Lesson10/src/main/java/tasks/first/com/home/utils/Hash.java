package tasks.first.com.home.utils;

import lombok.Getter;

@Getter
public enum Hash {
    HAND_HASH(1),
    HEAD_HASH(2),
    LEG_HASH(3);

    private final int hash;

    Hash(int hash) {
        this.hash = hash;
    }
}
