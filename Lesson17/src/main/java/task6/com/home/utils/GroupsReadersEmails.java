package task6.com.home.utils;

import lombok.Data;
import task6.com.home.model.EmailAddress;

import java.util.List;

@Data
public class GroupsReadersEmails {
    private List<EmailAddress> okGroupEmails;
    private List<EmailAddress> tooMuchGroupEmails;
}
