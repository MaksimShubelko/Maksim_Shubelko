package task4.com.home.model;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FuelTank implements Serializable {
    private String fuelType;
    private double capacity;
}
