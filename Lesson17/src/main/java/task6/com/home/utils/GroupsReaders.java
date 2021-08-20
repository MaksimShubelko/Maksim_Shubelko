package task6.com.home.utils;

import lombok.Data;
import task6.com.home.model.Reader;

import java.util.List;

@Data
public class GroupsReaders {
    private List<Reader> okGroupReaders;
    private List<Reader> tooMuchGroupReaders;
}
