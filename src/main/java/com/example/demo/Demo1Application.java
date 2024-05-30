package com.example.demo;

import javax.swing.*;
import java.awt.*;

public class Demo1Application extends JFrame {
    private JTextArea textArea;

    public Demo1Application() {
        // Creazione dei tab
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Studente", new StudentPanel(this));
        tabbedPane.addTab("Professore", new ProfessorPanel(this));

        // Area di testo per visualizzare i dati
        textArea = new JTextArea(10, 30);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Aggiunta dei componenti al frame
        add(tabbedPane, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);

        // Impostazioni del frame
        setTitle("Interfaccia Scuola");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void appendText(String text) {
        textArea.append(text);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Demo1Application());
    }
}
