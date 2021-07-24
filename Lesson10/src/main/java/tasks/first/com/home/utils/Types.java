package tasks.first.com.home.utils;

import lombok.Getter;

@Getter
public enum Types {
    IHand("IHand"),
    IHead("IHead"),
    ILeg("ILeg");

    private final String type;

    Types(String type) {
        this.type = type;
    }
}
