package sample.controller;

import sample.service.EncryptionService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Main extends JFrame {
    private static final EncryptionService encryptionService = new EncryptionService();
    private static final JPanel panel = new JPanel();
    private static final JFrame frame = new JFrame("textfield");
    private static final Button buttonCode = new Button("Шифрование");
    private static final Button buttonDecode = new Button("Дишифрование");
    private static final TextArea textAreaText = new TextArea("Введите текст", 15, 100);
    private static final TextField textAreaKey = new TextField( 10);
    private static final TextArea textAreaText1 = new TextArea("Введите текст", 15, 100);
    public static final Label textBar = new Label("Ввод ключа");

    public static void main(String[] args) {
        addActions();
        addComponents();
        textAreaText.setVisible(true);
        frame.setSize(800, 1000);
        frame.show();
    }

    public static void addComponents() {
        panel.add(textAreaText);
        panel.add(textBar);
        panel.add(textAreaKey);
        panel.add(buttonCode);
        panel.add(buttonDecode);
        panel.add(textAreaText1);
        frame.add(panel);
    }

    public static void addActions() {
        buttonCode.addActionListener(e -> {
            StringBuilder textEnter = new StringBuilder();
            textEnter.append(textAreaText.getText());
            textAreaText1.setText(encryptionService.encrypt(new StringBuilder(textAreaText.getText()), Integer.parseInt(textAreaKey.getText())).toString());
        });

        buttonDecode.addActionListener(e -> {
            StringBuilder textEnter = new StringBuilder();
            textEnter.append(textAreaText.getText());
            textAreaText1.setText(encryptionService.decrypt(new StringBuilder(textAreaText.getText()), Integer.parseInt(textAreaKey.getText())).toString());
        });
    }
}