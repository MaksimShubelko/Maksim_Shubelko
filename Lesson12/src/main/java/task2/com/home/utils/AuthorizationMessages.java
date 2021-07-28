package task2.com.home.utils;

import lombok.Getter;

@Getter
public enum AuthorizationMessages {
    WrongLoginMessage("Неверный логин"),
    WrongPasswordMessage("Неверный пароль");

    private final String message;

    AuthorizationMessages(String message) {
        this.message = message;
    }
}
