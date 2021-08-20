package task6.com.home.service;

import task6.com.home.utils.Constants;
import task6.com.home.utils.GroupsReadersEmails;

import java.util.List;

public class SendingService {
    private static MailService mailService = new MailService();

    public void sendEmailMessageToAll(List<String> emails) {
            emails
                    .stream()
                    .forEach(email -> mailService.sendMessages(email, Constants.title, Constants.libraryClosedMessage));
    }

    public void sendEmailMessageToGroups(GroupsReadersEmails emails) {

        emails.getOkGroupEmails()
                .stream()
                .map(emailAddress -> emailAddress.getEmail())
                .forEach(email -> mailService.sendMessages(email, Constants.title, Constants.textOkGroup));

        emails.getTooMuchGroupEmails()
                .stream()
                .map(emailAddress -> emailAddress.getEmail())
                .forEach(email ->
                        mailService.sendMessages(email, Constants.title, Constants.textTooMuch));
    }
}



