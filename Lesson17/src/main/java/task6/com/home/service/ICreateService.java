package task6.com.home.service;

import javax.mail.Session;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface ICreateService {
    Session createSession() throws IOException;
}
