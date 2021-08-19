package task6.com.home.service;

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
        String to = email;
        String host = "localhost";

        try {
            Session session = createSession();
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(messageSubject);
            message.setText(messageText);
            Transport transport = session.getTransport();
            transport.connect(null, "uysjlukmnixrzoqk");
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        } catch (MessagingException | FileNotFoundException mex) {
            mex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Session createSession() throws IOException {
        Properties props = System.getProperties();
        final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";

//        props.setProperty("mail.smtp.host", "smtp.gmail.com");
//        props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
//        props.setProperty("mail.smtp.socketFactory.fallback", "false");
//        props.setProperty("mail.smtp.port", "465");
//        props.setProperty("mail.smtp.socketFactory.port", "465");
//        props.setProperty("mail.smtp.auth", "true");
//        props.setProperty("mail.debug", "true");
//        props.setProperty("mail.store.protocol", "pop3");
//        props.setProperty("mail.transport.protocol", "smtp");
//        props.setProperty("mail.smtp.host","smtp.gmail.com");
//        props.setProperty("mail.smtp.port", "465");
//        props.setProperty("mail.smtp.user", from);
//        props.setProperty("mail.smtp.password", "uysjlukmnixrzoqk");
//        props.setProperty("mail.smtp.starttls.enable", "true");
//        props.setProperty("mail.smtp.starttls.required", "true");
//        props.setProperty("mail.smtp.startssl.enable", "true");
//        props.setProperty("mail.smtp.startssl.required", "true");
        FileInputStream fis = new FileInputStream("D:\\Java_projects\\Maksim_Shubelko\\Maxim_Shubelko\\Lesson17\\src\\main\\java\\task6\\com\\home\\propertyUtils\\mail.properties");
        props.load(fis);
        Session session = Session.getDefaultInstance(props);

        return session;

    }

}
