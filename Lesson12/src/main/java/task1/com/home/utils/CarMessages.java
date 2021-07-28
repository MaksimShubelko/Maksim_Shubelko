package task1.com.home.utils;

import lombok.Getter;

@Getter
public enum CarMessages {
    startOkay("Машина завелась"),
    startError("Error: машину не удалось завести");

    private final String message;

    CarMessages(String message) {
        this.message = message;
    }
}
