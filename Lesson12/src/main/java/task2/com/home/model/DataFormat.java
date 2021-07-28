package task2.com.home.model;

import lombok.Getter;

@Getter
public enum DataFormat {
    PasswordLoginFormat("^[0-9A-Z_a-z]{1,19}$");

    private final String dataFormat;

    DataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }
}
