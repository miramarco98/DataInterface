package com.example.demo;

import javax.swing.*;
import java.awt.*;

public class ProfessorPanel extends JPanel {
    private JTextField nomeField, cognomeField, stipendioField;
    private JButton okButton;
    private Demo1Application Demo1Application;

    public ProfessorPanel(Demo1Application si) {
        this.Demo1Application = si;
        setLayout(new GridLayout(4, 2));
        add(new JLabel("Nome:"));
        nomeField = new JTextField();
        add(nomeField);
        add(new JLabel("Cognome:"));
        cognomeField = new JTextField();
        add(cognomeField);
        add(new JLabel("Stipendio:"));
        stipendioField = new JTextField();
        add(stipendioField);
        okButton = new JButton("OK");
        add(okButton);

        okButton.addActionListener(e -> {
            Demo1Application.appendText("Professore: " + nomeField.getText() + " " + cognomeField.getText() + " - Stipendio: " + stipendioField.getText() + "\n");
            nomeField.setText("");
            cognomeField.setText("");
            stipendioField.setText("");
        });
    }
}
