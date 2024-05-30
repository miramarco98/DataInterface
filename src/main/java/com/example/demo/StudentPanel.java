package com.example.demo;

import javax.swing.*;
import java.awt.*;

public class StudentPanel extends JPanel {
    private JTextField nomeField, cognomeField, mediaField;
    private JButton okButton;
    private Demo1Application Demo1Application;

    public StudentPanel(Demo1Application si) {
        this.Demo1Application = si;
        setLayout(new GridLayout(4, 2));
        add(new JLabel("Nome:"));
        nomeField = new JTextField();
        add(nomeField);
        add(new JLabel("Cognome:"));
        cognomeField = new JTextField();
        add(cognomeField);
        add(new JLabel("Media:"));
        mediaField = new JTextField();
        add(mediaField);
        okButton = new JButton("OK");
        add(okButton);

        okButton.addActionListener(e -> {
            Demo1Application.appendText("Studente: " + nomeField.getText() + " " + cognomeField.getText() + " - Media: " + mediaField.getText() + "\n");
            nomeField.setText("");
            cognomeField.setText("");
            mediaField.setText("");
        });
    }
}
