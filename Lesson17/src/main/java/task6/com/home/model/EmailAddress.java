package task6.com.home.model;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class EmailAddress {
    @NonNull
    private String email;
    private String additionalInformation;
}
