package task3.com.home.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public enum TextCheckingMessages {
    TEXT_OKAY("Текст прошёл цензуру"),
    TEXT_INCORRECT("Текст не прошёл цензуру");

    private String message;

}
