package task4.com.home.utils.model;

import lombok.*;

@ToString
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class Car {
    private String carNumber;
    @NonNull
    private int yearOfRealise;
}
