package ejerciciosLecturaD21;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class NotepadApp extends JFrame {
    private JTextArea areaTexto;
    private JButton btnGuardar;

    public NotepadApp() {
        setTitle("Notas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        areaTexto = new JTextArea();
        btnGuardar = new JButton("Guardar");

        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                guardarArchivo();
            }
        });

        JScrollPane barra = new JScrollPane(areaTexto);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(barra, BorderLayout.CENTER);
        panel.add(btnGuardar, BorderLayout.SOUTH);

        getContentPane().add(panel);
    }

    private void guardarArchivo() {
        JFileChooser selecArchivo = new JFileChooser();
        int resultado = selecArchivo.showSaveDialog(this);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File archivo = selecArchivo.getSelectedFile();
            try (PrintWriter escribir = new PrintWriter(archivo)) {
                escribir.write(areaTexto.getText());
                JOptionPane.showMessageDialog(this, "Guardado Éxitoso !!");
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error de archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                NotepadApp app = new NotepadApp();
                app.setVisible(true);
            }
        });
    }
}
