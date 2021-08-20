package task6.com.home.service;

import task6.com.home.utils.FileUtils;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MailService implements ICreateService{
    private static final String from = "library.tms.maximshubelko@gmail.com";

    public void sendMessages(String email, String messageSubject, String messageText) {
        String host = "localhost";

        try {
            Session session = createSession();
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
            message.setSubject(messageSubject);
            message.setText(messageText);
            Transport transport = session.getTransport();
            transport.connect(null, "uysjlukmnixrzoqk");
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        } catch (MessagingException | IOException mex) {
            mex.printStackTrace();
        }
    }

    public Session createSession() throws IOException {
        Properties props = System.getProperties();
        props.load(FileUtils.fileReadProperty());

        return Session.getDefaultInstance(props);
    }
}
