package task4.com.home.model;

import lombok.*;
import task4.com.home.utils.Serializator;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Engine implements Serializable {
    private int countCylinders;
    private String engineType;
}
