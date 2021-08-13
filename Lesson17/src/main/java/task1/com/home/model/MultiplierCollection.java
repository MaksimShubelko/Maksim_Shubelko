package task1.com.home.model;

import lombok.Setter;

import java.util.Set;
import java.util.stream.Collectors;

@Setter
public class MultiplierCollection {
    private int multipleMember;

    public Set<Integer> multipleCollections(Set<Integer> numbers) {
        return numbers
                .stream()
                .map(number -> number * multipleMember)
                .collect(Collectors.toSet());

    }
}
