package ejerciciosLecturaD21;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ListaTareas extends JFrame implements ActionListener {
    private JTextField textoCampo;
    private JButton agregarBoton;
    private JButton borrarBoton;
    private JList<Tarea> listaTareas;
    private DefaultListModel<Tarea> listaModelo;

    public ListaTareas() {
        setTitle("Task List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new BorderLayout());

        // Panel para ingresar tareas
        JPanel inputPanel = new JPanel(new FlowLayout());
        textoCampo = new JTextField(20);
        agregarBoton = new JButton("Agregar");
        agregarBoton.addActionListener(this);
        borrarBoton = new JButton("Borrar");
        borrarBoton.addActionListener(this);
        inputPanel.add(textoCampo);
        inputPanel.add(agregarBoton);
        inputPanel.add(borrarBoton);

        // Lista de tareas
        listaModelo = new DefaultListModel<>();
        listaTareas = new JList<>(listaModelo);
        listaTareas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaTareas.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int indice = listaTareas.locationToIndex(e.getPoint());
                    Tarea tarea = listaModelo.get(indice);
                    tarea.setCompletado(!tarea.isCompletado());
                    listaTareas.repaint();
                }
            }
        });

        // Personalización del renderizado de las tareas en la lista
        listaTareas.setCellRenderer(new TareaCellda());

        // ScrollPane para la lista de tareas
        JScrollPane barra = new JScrollPane(listaTareas);
        barra.setPreferredSize(new Dimension(250, 200));

        // Panel principal
        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.add(inputPanel, BorderLayout.NORTH);
        panelPrincipal.add(barra, BorderLayout.CENTER);

        getContentPane().add(panelPrincipal);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ListaTareas();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == agregarBoton) {
            String descripcionTarea = textoCampo.getText();
            if (!descripcionTarea.isEmpty()) {
                Tarea tarea = new Tarea(descripcionTarea);
                listaModelo.addElement(tarea);
                textoCampo.setText("");
            }
        } else if (e.getSource() == borrarBoton) {
            int seleccionarIndice = listaTareas.getSelectedIndex();
            if (seleccionarIndice != -1) {
                listaModelo.remove(seleccionarIndice);
            }
        }
    }

    // Clase interna para representar una tarea
    private class Tarea {
        private String descripcion;
        private boolean completado;

        public Tarea(String descripcion) {
            this.descripcion = descripcion;
            this.completado = false;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public boolean isCompletado() {
            return completado;
        }

        public void setCompletado(boolean completado) {
            this.completado = completado;
        }

        @Override
        public String toString() {
            return descripcion + (completado ? " (Completado)" : "");
        }
    }

    // Clase interna para personalizar el renderizado de las celdas de la lista de tareas
    private class TareaCellda extends DefaultListCellRenderer {
        public Component getListCellRendererComponent(JList<?> lista, Object valor, int indice,
                                                      boolean esSeleccionado, boolean focoCelda) {
            super.getListCellRendererComponent(lista, valor, indice, esSeleccionado, focoCelda);
            Tarea tarea = (Tarea) valor;
            if (tarea.isCompletado()) {
                setForeground(Color.GRAY);
                setFont(getFont().deriveFont(Font.ITALIC));
            } else {
                setForeground(Color.BLACK);
                setFont(getFont().deriveFont(Font.PLAIN));
            }
            return this;
        }
    }
}
