/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobiblioteca.views;

import java.awt.*;
import java.awt.event.*;
import java.time.Year;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.basic.BasicToggleButtonUI;
import proyectobiblioteca.controllers.UsuariosDAO;
import proyectobiblioteca.controllers.adminsDAO;
import proyectobiblioteca.models.UsuariosDTO;
import proyectobiblioteca.models.adminsDTO;

/**
 *
 * @author juand
 */
public class GUIPrincipalAuxiliares extends JFrame {

    private final JPanel panelPrin = new JPanel();
    private final JPanel panelIzquierda = new JPanel();
    private JLabel jLabelTop;
    private JPanel panelArriba;
    private JPanel panelAbajo;
    private final Color verde = Color.decode("#36b756");
    private final Color verdeClaro = Color.decode("#ffffff");
    private JButton botonHome, botonAdmins, botonUsers;
    private final Container container = getContentPane();
    adminsDAO ADMINSdao = new adminsDAO();
    UsuariosDAO usuariosDAO = new UsuariosDAO();

    public GUIPrincipalAuxiliares() {
        
        pintarPanelIzquierdo();
        initComponents();
        setSize(1020, 800);
        setTitle("Sistema de Biblioteca - Colegio Francisco Jose de Caldas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        panelArriba = new JPanel();
        panelAbajo = new JPanel();
        jLabelTop = new JLabel();
        jLabelTop.setFont(new Font("Agency FB", Font.BOLD, 30));
        // jLabelTop.setPreferredSize(new Dimension(200, 100)); // establece el tamaño preferido a 200x50 píxeles
        panelArriba.add(jLabelTop);

        panelIzquierda.setBackground(verde);
        panelPrin.setBackground(verdeClaro);
        panelPrin.setPreferredSize(new Dimension(610, 800));
        panelIzquierda.setPreferredSize(new Dimension(300, 800));

        panelArriba.setBackground(verde);
        panelAbajo.setBackground(verdeClaro);
        container.setLayout(new BorderLayout());
        panelPrin.setLayout(new BorderLayout());
        panelPrin.add(panelArriba, BorderLayout.NORTH);
        panelArriba.setPreferredSize(new Dimension(610, 150));
        //  panelArriba.add(jLabelTop);
        panelPrin.add(panelAbajo, BorderLayout.SOUTH);
        panelAbajo.setPreferredSize(new Dimension(610, 600));

        container.add(panelIzquierda, BorderLayout.WEST);
        container.add(panelPrin, BorderLayout.CENTER);

        accionHome();
        pintarMenuHome();
      //  pintarMenuAdmins();
        pintarMenuUsers();

    }

    private void accionHome() {
    panelAbajo.removeAll();
    jLabelTop.setText("dashboard/home");
    panelAbajo.setLayout(new FlowLayout());
/*
    JToggleButton botonAdmin = new JToggleButton("Administradores");
    botonAdmin.setUI(new BootstrapSwitchUI()); // Aplica la clase UI personalizada
    botonAdmin.setPreferredSize(new Dimension(200,150));

        // Establece el icono en el botón
        botonAdmin.setIcon(new ImageIcon(getClass().getResource("/resources/iconAdmin.png")));
        botonAdmin.setBackground(verde);
      botonAdmin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                botonAdmin.setBackground(Color.YELLOW);  // Cambia el color de fondo al pasar el mouse
            }

            @Override
            public void mouseExited(MouseEvent e) {
                botonAdmin.setBackground(verde);  // Restaura el color de fondo original
            }
        });

      botonAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Validar el clic en el botón y realizar la acción deseada
                if (botonAdmin.isSelected()) {
                    // El botón está seleccionado (clicado)
                    accionAdmins();
                } else {
                    // El botón no está seleccionado
                    System.out.println("Botón no clicado");
                }
            }
        });
      */
       JToggleButton botonUser = new JToggleButton("Usuarios");
    botonUser.setUI(new BootstrapSwitchUI()); // Aplica la clase UI personalizada
    botonUser.setPreferredSize(new Dimension(200,150));

        // Establece el icono en el botón
        botonUser.setIcon(new ImageIcon(getClass().getResource("/resources/iconAdmin.png")));
        botonUser.setBackground(verde);
      botonUser.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                botonUser.setBackground(Color.YELLOW);  // Cambia el color de fondo al pasar el mouse
            }

            @Override
            public void mouseExited(MouseEvent e) {
                botonUser.setBackground(verde);  // Restaura el color de fondo original
            }
        });

      botonUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Validar el clic en el botón y realizar la acción deseada
                if (botonUser.isSelected()) {
                    // El botón está seleccionado (clicado)
                    accionUsers();
                } else {
                    // El botón no está seleccionado
                    System.out.println("Botón no clicado");
                }
            }
        });
      
      panelAbajo.setLayout(new FlowLayout());
//    panelAbajo.add(botonAdmin);
     panelAbajo.add(botonUser);

    panelAbajo.repaint();
    panelAbajo.revalidate();
}
     private static class BootstrapSwitchUI extends BasicToggleButtonUI {
        @Override
        public void installUI(JComponent c) {
            super.installUI(c);
            // Personaliza la apariencia y el comportamiento del botón aquí
        }
    }


    private void accionAdmins() {
        panelAbajo.removeAll();
        jLabelTop.setText("dashboard/administradores");

        // Crear la tabla y configurar sus propiedades
        JTable table = new JTable();
        table.setRowHeight(30);
        table.setModel(ADMINSdao.tablaAdmins());
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(610, 400));
        table.setOpaque(false);
        table.setBackground(verdeClaro);
        table.getTableHeader().setPreferredSize(new Dimension(scrollPane.getWidth(), 30));
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table.getTableHeader().setOpaque(false);
        table.getTableHeader().setBackground(verde);
        table.getTableHeader().setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        table.setFont(new Font("Arial", Font.PLAIN, 10));
        table.setGridColor(Color.LIGHT_GRAY);
        table.setSelectionBackground(Color.decode("#f3eb55"));
        table.setSelectionForeground(Color.BLACK);

// Crear los botones
        JButton nuevoButton = new JButton("Nuevo");
        nuevoButton.setBackground(verde);
        nuevoButton.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        JButton editarButton = new JButton("Editar");
        editarButton.setBackground(verde);
        editarButton.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        JButton eliminarButton = new JButton("Eliminar");
        eliminarButton.setBackground(verde);
        eliminarButton.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

// Crear el campo de búsqueda
        JTextField buscarField = new JTextField(20);
        buscarField.setMaximumSize(buscarField.getPreferredSize());
        buscarField.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));

// Crear un JPanel para los botones y el campo de búsqueda
        JPanel botonesPanel = new JPanel();
        botonesPanel.setLayout(new BoxLayout(botonesPanel, BoxLayout.X_AXIS));
        botonesPanel.setOpaque(false);
        botonesPanel.setBackground(new Color(0, 0, 0, 0));
        botonesPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        botonesPanel.add(Box.createHorizontalGlue());
        botonesPanel.add(buscarField);
        botonesPanel.add(Box.createRigidArea(new Dimension(10, 0))); // Agregar un espacio entre los botones
        botonesPanel.add(nuevoButton);
        botonesPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        botonesPanel.add(editarButton);
        botonesPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        botonesPanel.add(eliminarButton);

        eliminarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = table.getSelectedRow();
                if (filaSeleccionada < 0) {
                    JOptionPane.showMessageDialog(null, "Es necesario que seleccione un usuario de la tabla para eliminar ");
                    return;
                }
                int idAdmin = (int) table.getValueAt(filaSeleccionada, 0);
                ADMINSdao.eliminarAdmin(idAdmin);
                table.setModel(ADMINSdao.tablaAdmins());
            }
        });

        nuevoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                accionbtnNuevo();

            }
        });
        editarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int filaSeleccionada = table.getSelectedRow();
                if (filaSeleccionada < 0) {
                    JOptionPane.showMessageDialog(null, "Es necesario que seleccione en la tabla un usuario a modificar");
                } else {
                    ArrayList<Object> datosFila = new ArrayList<>();

                    for (int i = 0; i < table.getColumnCount(); i++) {
                        datosFila.add(table.getValueAt(filaSeleccionada, i));
                    }

                    accionbtnEditar(datosFila);
                }
            }
        });

        // Agregar el JPanel y el JScrollPane al panelAbajo
        panelAbajo.setLayout(new BoxLayout(panelAbajo, BoxLayout.Y_AXIS));
        panelAbajo.add(botonesPanel);
        panelAbajo.add(Box.createRigidArea(new Dimension(0, 10))); // Agregar un espacio entre los botones y la tabla
        panelAbajo.add(scrollPane);

        panelAbajo.repaint();
        panelAbajo.revalidate();

        // Agregar un DocumentListener al campo de búsqueda para detectar cambios en el texto
        buscarField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                buscar();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                buscar();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                buscar();
            }

            // Método de búsqueda
            public void buscar() {
                String texto = buscarField.getText();
                table.setModel(ADMINSdao.busqueda(texto));
            }
        });
    }

    private void accionUsers() {
        panelAbajo.removeAll();
        jLabelTop.setText("dashboard/usuarios");

        // Crear la tabla y configurar sus propiedades
        JTable table = new JTable();
        table.setRowHeight(30);
        table.setModel(usuariosDAO.tablaUsers());
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(610, 400));
        table.setOpaque(false);
        table.setBackground(verdeClaro);
        table.getTableHeader().setPreferredSize(new Dimension(scrollPane.getWidth(), 30));
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table.getTableHeader().setOpaque(false);
        table.getTableHeader().setBackground(verde);
        table.getTableHeader().setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        table.setFont(new Font("Arial", Font.PLAIN, 10));
        table.setGridColor(Color.LIGHT_GRAY);
        table.setSelectionBackground(Color.decode("#f3eb55"));
        table.setSelectionForeground(Color.BLACK);

// Crear los botones
        JButton nuevoButton = new JButton("Nuevo");
        nuevoButton.setBackground(verde);
        nuevoButton.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        JButton editarButton = new JButton("Editar");
        editarButton.setBackground(verde);
        editarButton.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        JButton eliminarButton = new JButton("Eliminar");
        eliminarButton.setBackground(verde);
        eliminarButton.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

// Crear el campo de búsqueda
        JTextField buscarField = new JTextField(20);
        buscarField.setMaximumSize(buscarField.getPreferredSize());
        buscarField.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));

// Crear un JPanel para los botones y el campo de búsqueda
        JPanel botonesPanel = new JPanel();
        botonesPanel.setLayout(new BoxLayout(botonesPanel, BoxLayout.X_AXIS));
        botonesPanel.setOpaque(false);
        botonesPanel.setBackground(new Color(0, 0, 0, 0));
        botonesPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        botonesPanel.add(Box.createHorizontalGlue());
        botonesPanel.add(buscarField);
        botonesPanel.add(Box.createRigidArea(new Dimension(10, 0))); // Agregar un espacio entre los botones
        botonesPanel.add(nuevoButton);
        botonesPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        botonesPanel.add(editarButton);
        botonesPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        botonesPanel.add(eliminarButton);

        eliminarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = table.getSelectedRow();
                if (filaSeleccionada < 0) {
                    JOptionPane.showMessageDialog(null, "Es necesario que seleccione un usuario de la tabla para eliminar ");
                    return;
                }
                int idAdmin = (int) table.getValueAt(filaSeleccionada, 0);
                UsuariosDAO.eliminarUser(idAdmin);
                System.out.println(idAdmin);
                table.setModel(usuariosDAO.tablaUsers());
            }
        });

        nuevoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                accionbtnNuevoUser();

            }
        });
        editarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int filaSeleccionada = table.getSelectedRow();
                if (filaSeleccionada < 0) {
                    JOptionPane.showMessageDialog(null, "Es necesario que seleccione en la tabla un usuario a modificar");
                } else {
                    ArrayList<Object> datosFila = new ArrayList<>();

                    for (int i = 0; i < table.getColumnCount(); i++) {
                        datosFila.add(table.getValueAt(filaSeleccionada, i));
                    }

                    accionbtnEditarUser(datosFila);
                }
            }
        });

        // Agregar el JPanel y el JScrollPane al panelAbajo
        panelAbajo.setLayout(new BoxLayout(panelAbajo, BoxLayout.Y_AXIS));
        panelAbajo.add(botonesPanel);
        panelAbajo.add(Box.createRigidArea(new Dimension(0, 10))); // Agregar un espacio entre los botones y la tabla
        panelAbajo.add(scrollPane);

        panelAbajo.repaint();
        panelAbajo.revalidate();

        // Agregar un DocumentListener al campo de búsqueda para detectar cambios en el texto
        buscarField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                buscar();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                buscar();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                buscar();
            }

            // Método de búsqueda
            public void buscar() {
                String texto = buscarField.getText();
                table.setModel(usuariosDAO.busqueda(texto));
            }
        });
    }

    private void accionbtnNuevo() {
        panelAbajo.removeAll();
        jLabelTop.setText("dashboard/administradores/nuevo");

        // Agrega las referencias a los archivos CSS y JavaScript de Bootstrap Switch
        JLabel bootstrapSwitchCss = new JLabel();
        bootstrapSwitchCss.setText("<html><head><link rel='stylesheet' href='lib/bootstrap-switch.min.css'></head><body></body></html>");
        JLabel bootstrapSwitchJs = new JLabel();
        bootstrapSwitchJs.setText("<html><head><script src='lib/bootstrap-switch.min.js'></script></head><body></body></html>");
        // Crea los componentes del formulario utilizando las clases de estilo de Bootstrap

        JLabel lblClave = new JLabel("Clave:");
        lblClave.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        lblClave.setForeground(new Color(52, 58, 64));

        JPasswordField txtClave = new JPasswordField();
        txtClave.setPreferredSize(new Dimension(250, 30));
        txtClave.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        lblNombre.setForeground(new Color(52, 58, 64));

        JTextField txtNombre = new JTextField();
        txtNombre.setPreferredSize(new Dimension(250, 30));
        txtNombre.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));

        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        lblApellido.setForeground(new Color(52, 58, 64));

        JTextField txtApellido = new JTextField();
        txtApellido.setPreferredSize(new Dimension(250, 30));
        txtApellido.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));

        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        lblUsuario.setForeground(new Color(52, 58, 64));

        JTextField txtUsuario = new JTextField();
        txtUsuario.setEditable(false);
        txtUsuario.setPreferredSize(new Dimension(250, 30));
        txtUsuario.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));

        JLabel lblDireccion = new JLabel("Direccion:");
        lblDireccion.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        lblDireccion.setForeground(new Color(52, 58, 64));

        JTextField txtDireccion = new JTextField();
        txtDireccion.setPreferredSize(new Dimension(250, 30));
        txtDireccion.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));

        JLabel lblCargo = new JLabel("Cargo:");
        lblCargo.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        lblCargo.setForeground(new Color(52, 58, 64));

        JComboBox JBCargo = new JComboBox();
        JBCargo.addItem("Seleccion");
        JBCargo.addItem("Administrador");
        JBCargo.addItem("Auxiliar");
        JBCargo.setPreferredSize(new Dimension(250, 30));
        JBCargo.setBackground(Color.white);
        JBCargo.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));

        // Agrega los componentes al panel utilizando un diseño de cuadrícula
        panelAbajo.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        panelAbajo.add(lblUsuario, gbc);
        gbc.gridx = 1;
        panelAbajo.add(txtUsuario, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panelAbajo.add(lblClave, gbc);
        gbc.gridx = 1;
        panelAbajo.add(txtClave, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        panelAbajo.add(lblNombre, gbc);
        gbc.gridx = 1;
        panelAbajo.add(txtNombre, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        panelAbajo.add(lblApellido, gbc);
        gbc.gridx = 1;
        panelAbajo.add(txtApellido, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        panelAbajo.add(lblDireccion, gbc);
        gbc.gridx = 1;
        panelAbajo.add(txtDireccion, gbc);
        gbc.gridx = 0;
        gbc.gridy = 5;
        panelAbajo.add(lblCargo, gbc);
        gbc.gridx = 1;
        panelAbajo.add(JBCargo, gbc);

        JButton enviar = new JButton("Enviar");
        enviar.setPreferredSize(new Dimension(250, 30));
        enviar.setBackground(verde);
        enviar.setForeground(Color.WHITE);
        enviar.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));
        gbc.gridx = 1;
        gbc.gridy = 6;
        panelAbajo.add(enviar, gbc);
        JButton btnRegresar = new JButton("Regresar");
        btnRegresar.setPreferredSize(new Dimension(250, 30));
        btnRegresar.setBackground(verde);
        btnRegresar.setForeground(Color.WHITE);
        btnRegresar.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));
        gbc.gridx = 1;
        gbc.gridy = 7;
        panelAbajo.add(btnRegresar, gbc);
        JButton btnGenerarUser = new JButton("Generar Usuario");
        btnGenerarUser.setPreferredSize(new Dimension(250, 30));
        btnGenerarUser.setBackground(verde);
        btnGenerarUser.setForeground(Color.WHITE);
        btnGenerarUser.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));
        gbc.gridx = 1;
        gbc.gridy = 8;
        panelAbajo.add(btnGenerarUser, gbc);

        // Agrega los archivos CSS y JavaScript de Bootstrap Switch al panel
        panelAbajo.add(bootstrapSwitchCss);
        panelAbajo.add(bootstrapSwitchJs);

        enviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txtUsuario.getText().isEmpty() || txtClave.getText().isEmpty() || txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtDireccion.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Todos los campos son requeridos");
                } else {

                    adminsDTO nuevoAdmin = new adminsDTO();
                    nuevoAdmin.setUsuario(txtUsuario.getText());
                    nuevoAdmin.setClave(txtClave.getText());
                    nuevoAdmin.setNombres(txtNombre.getText());
                    nuevoAdmin.setApellidos(txtApellido.getText());
                    nuevoAdmin.setDireccion(txtDireccion.getText());
                    nuevoAdmin.setCargo(1);
                    adminsDAO.insertarAdmin(nuevoAdmin);

                    txtUsuario.setText("");
                    txtClave.setText("");
                    txtNombre.setText("");
                    txtApellido.setText("");
                    txtDireccion.setText("");

                }
            }
        });

        btnRegresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                accionAdmins();
            }
        });

        btnGenerarUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtUsuario.setText(generateUsername(txtNombre.getText(), txtApellido.getText()));

            }
        });

        // Actualiza la interfaz gráfica
        panelAbajo.revalidate();
        panelAbajo.repaint();
    }

    private void accionbtnNuevoUser() {
        panelAbajo.removeAll();
        jLabelTop.setText("dashboard/usuarios/nuevo");

        // Agrega las referencias a los archivos CSS y JavaScript de Bootstrap Switch
        JLabel bootstrapSwitchCss = new JLabel();
        bootstrapSwitchCss.setText("<html><head><link rel='stylesheet' href='lib/bootstrap-switch.min.css'></head><body></body></html>");
        JLabel bootstrapSwitchJs = new JLabel();
        bootstrapSwitchJs.setText("<html><head><script src='lib/bootstrap-switch.min.js'></script></head><body></body></html>");
        // Crea los componentes del formulario utilizando las clases de estilo de Bootstrap

        JLabel lblTelefono1 = new JLabel("Telefono 1:");
        lblTelefono1.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        lblTelefono1.setForeground(new Color(52, 58, 64));

        JPasswordField txtTelefono1 = new JPasswordField();
        txtTelefono1.setPreferredSize(new Dimension(250, 30));
        txtTelefono1.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        lblNombre.setForeground(new Color(52, 58, 64));

        JTextField txtNombre = new JTextField();
        txtNombre.setPreferredSize(new Dimension(250, 30));
        txtNombre.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));

        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        lblApellido.setForeground(new Color(52, 58, 64));

        JTextField txtApellido = new JTextField();
        txtApellido.setPreferredSize(new Dimension(250, 30));
        txtApellido.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));

        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        lblUsuario.setForeground(new Color(52, 58, 64));

        JTextField txtUsuario = new JTextField();
        txtUsuario.setEditable(false);
        txtUsuario.setPreferredSize(new Dimension(250, 30));
        txtUsuario.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));

        JLabel lblDireccion = new JLabel("Direccion:");
        lblDireccion.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        lblDireccion.setForeground(new Color(52, 58, 64));

        JTextField txtDireccion = new JTextField();
        txtDireccion.setPreferredSize(new Dimension(250, 30));
        txtDireccion.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));

        JLabel lblTelefono2 = new JLabel("Telefono 2:");
        lblTelefono2.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        lblTelefono2.setForeground(new Color(52, 58, 64));

        JTextField txtTelefono2 = new JTextField();
        txtTelefono2.setPreferredSize(new Dimension(250, 30));
        txtTelefono2.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));

        JLabel lblGrado = new JLabel("Grado:");
        lblGrado.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        lblGrado.setForeground(new Color(52, 58, 64));

        JComboBox JCGrado = new JComboBox();
        JCGrado.addItem("601");
        JCGrado.addItem("602");
        JCGrado.addItem("603");
        JCGrado.addItem("604");

        // Agrega los componentes al panel utilizando un diseño de cuadrícula
        panelAbajo.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        panelAbajo.add(lblUsuario, gbc);
        gbc.gridx = 1;
        panelAbajo.add(txtUsuario, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panelAbajo.add(lblNombre, gbc);
        gbc.gridx = 1;
        panelAbajo.add(txtNombre, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        panelAbajo.add(lblApellido, gbc);
        gbc.gridx = 1;
        panelAbajo.add(txtApellido, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        panelAbajo.add(lblDireccion, gbc);
        gbc.gridx = 1;
        panelAbajo.add(txtDireccion, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        panelAbajo.add(lblTelefono1, gbc);
        gbc.gridx = 1;
        panelAbajo.add(txtTelefono1, gbc);
        gbc.gridx = 0;
        gbc.gridy = 5;
        panelAbajo.add(lblTelefono2, gbc);
        gbc.gridx = 1;
        panelAbajo.add(txtTelefono2, gbc);
        gbc.gridx = 0;
        gbc.gridy = 6;
        panelAbajo.add(lblGrado, gbc);
        gbc.gridx = 1;
        panelAbajo.add(JCGrado, gbc);
        gbc.gridx = 0;
        gbc.gridy = 7;

        JButton enviar = new JButton("Enviar");
        enviar.setPreferredSize(new Dimension(250, 30));
        enviar.setBackground(verde);
        enviar.setForeground(Color.WHITE);
        enviar.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));
        gbc.gridx = 1;
        gbc.gridy = 8;
        panelAbajo.add(enviar, gbc);
        JButton btnRegresar = new JButton("Regresar");
        btnRegresar.setPreferredSize(new Dimension(250, 30));
        btnRegresar.setBackground(verde);
        btnRegresar.setForeground(Color.WHITE);
        btnRegresar.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));
        gbc.gridx = 1;
        gbc.gridy = 9;
        panelAbajo.add(btnRegresar, gbc);
        JButton btnGenerarUser = new JButton("Generar Usuario");
        btnGenerarUser.setPreferredSize(new Dimension(250, 30));
        btnGenerarUser.setBackground(verde);
        btnGenerarUser.setForeground(Color.WHITE);
        btnGenerarUser.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));
        gbc.gridx = 1;
        gbc.gridy = 10;
        panelAbajo.add(btnGenerarUser, gbc);

        // Agrega los archivos CSS y JavaScript de Bootstrap Switch al panel
        panelAbajo.add(bootstrapSwitchCss);
        panelAbajo.add(bootstrapSwitchJs);

        enviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txtUsuario.getText().isEmpty() || txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtDireccion.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Todos los campos son requeridos");
                } else {
                    UsuariosDTO usersDto = new UsuariosDTO();
                    usersDto.setUser_generico(Integer.parseInt(txtUsuario.getText()));
                    usersDto.setNombre(txtNombre.getText());
                    usersDto.setApellido(txtApellido.getText());
                    usersDto.setDireccion(txtDireccion.getText());
                    usersDto.setTelefono(txtTelefono1.getText());
                    usersDto.setTelefonoF(txtTelefono2.getText());
                    usersDto.setGrado(Integer.parseInt((String) JCGrado.getSelectedItem()));
                    usuariosDAO.insertarUser(usersDto);

                }
            }
        });

        btnRegresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                accionUsers();
            }
        });

        btnGenerarUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtUsuario.setText(Integer.toString(generarUsuario()));

            }
        });

        // Actualiza la interfaz gráfica
        panelAbajo.revalidate();
        panelAbajo.repaint();
    }

    public static int generarUsuario() {
        int añoActual = Year.now().getValue();
        Random random = new Random();
        int[] numerosAleatorios = new int[4];

        for (int i = 0; i < 4; i++) {
            numerosAleatorios[i] = random.nextInt(10);
        }

        String usuario = String.valueOf(añoActual) + String.format("%04d", new Random().nextInt(10000));
        int usuarioInt = Integer.parseInt(usuario);

        return usuarioInt;
    }

    public static String generateUsername(String usuario, String apellido) {
        Random random = new Random();
        int number = random.nextInt(100);
        String username = (usuario.substring(0, 1) + apellido + number).toLowerCase();
        return username;
    }

    private void accionbtnEditar(ArrayList lista) {
        ArrayList<Object> datosFila = lista;
        panelAbajo.removeAll();
        jLabelTop.setText("dashboard/administradores/editar");

        // Agrega las referencias a los archivos CSS y JavaScript de Bootstrap Switch
        JLabel bootstrapSwitchCss = new JLabel();
        bootstrapSwitchCss.setText("<html><head><link rel='stylesheet' href='lib/bootstrap-switch.min.css'></head><body></body></html>");
        JLabel bootstrapSwitchJs = new JLabel();
        bootstrapSwitchJs.setText("<html><head><script src='lib/bootstrap-switch.min.js'></script></head><body></body></html>");

        // Crea los componentes del formulario utilizando las clases de estilo de Bootstrap
        JLabel lblID = new JLabel("Usuario:");
        lblID.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        lblID.setForeground(new Color(52, 58, 64));

        JTextField txtID = new JTextField();
        txtID.setText((String) datosFila.get(1));
        txtID.setPreferredSize(new Dimension(250, 30));
        txtID.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));

        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        lblUsuario.setForeground(new Color(52, 58, 64));

        JTextField txtUsuario = new JTextField();
        txtUsuario.setText((String) datosFila.get(1));
        txtUsuario.setPreferredSize(new Dimension(250, 30));
        txtUsuario.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));

        JLabel lblClave = new JLabel("Clave:");
        lblClave.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        lblClave.setForeground(new Color(52, 58, 64));

        JPasswordField txtClave = new JPasswordField();
        txtClave.setText((String) datosFila.get(2));
        txtClave.setPreferredSize(new Dimension(250, 30));
        txtClave.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        lblNombre.setForeground(new Color(52, 58, 64));

        JTextField txtNombre = new JTextField();
        txtNombre.setText((String) datosFila.get(3));
        txtNombre.setPreferredSize(new Dimension(250, 30));
        txtNombre.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));

        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        lblApellido.setForeground(new Color(52, 58, 64));

        JTextField txtApellido = new JTextField();
        txtApellido.setText((String) datosFila.get(4));
        txtApellido.setPreferredSize(new Dimension(250, 30));
        txtApellido.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));

        JLabel lblDireccion = new JLabel("Direccion:");
        lblDireccion.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        lblDireccion.setForeground(new Color(52, 58, 64));

        JTextField txtDireccion = new JTextField();
        txtDireccion.setText((String) datosFila.get(5));
        txtDireccion.setPreferredSize(new Dimension(250, 30));
        txtDireccion.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));

        JLabel lblCargo = new JLabel("Cargo:");
        lblCargo.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        lblCargo.setForeground(new Color(52, 58, 64));

        JComboBox JBCargo = new JComboBox();
        JBCargo.addItem("Seleccione");
        JBCargo.addItem("Administrador");
        JBCargo.addItem("Auxiliar");

        JBCargo.setSelectedIndex((int) datosFila.get(6));
        JBCargo.setPreferredSize(new Dimension(250, 30));
        JBCargo.setBackground(Color.white);
        JBCargo.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));

        // Agrega los componentes al panel utilizando un diseño de cuadrícula
        panelAbajo.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        panelAbajo.add(lblUsuario, gbc);
        gbc.gridx = 1;
        panelAbajo.add(txtUsuario, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panelAbajo.add(lblClave, gbc);
        gbc.gridx = 1;
        panelAbajo.add(txtClave, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        panelAbajo.add(lblNombre, gbc);
        gbc.gridx = 1;
        panelAbajo.add(txtNombre, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        panelAbajo.add(lblApellido, gbc);
        gbc.gridx = 1;
        panelAbajo.add(txtApellido, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        panelAbajo.add(lblDireccion, gbc);
        gbc.gridx = 1;
        panelAbajo.add(txtDireccion, gbc);
        gbc.gridx = 0;
        gbc.gridy = 5;
        panelAbajo.add(lblCargo, gbc);
        gbc.gridx = 1;
        panelAbajo.add(JBCargo, gbc);

        JButton enviar = new JButton("Enviar");
        enviar.setPreferredSize(new Dimension(250, 30));
        enviar.setBackground(verde);
        enviar.setForeground(Color.WHITE);
        enviar.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));
        gbc.gridx = 1;
        gbc.gridy = 6;
        panelAbajo.add(enviar, gbc);
        JButton btnRegresar = new JButton("Regresar");
        btnRegresar.setPreferredSize(new Dimension(250, 30));
        btnRegresar.setBackground(verde);
        btnRegresar.setForeground(Color.WHITE);
        btnRegresar.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));
        gbc.gridx = 1;
        gbc.gridy = 7;
        panelAbajo.add(btnRegresar, gbc);

        // Agrega los archivos CSS y JavaScript de Bootstrap Switch al panel
        panelAbajo.add(bootstrapSwitchCss);
        panelAbajo.add(bootstrapSwitchJs);

        enviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txtUsuario.getText().isEmpty() || txtClave.getText().isEmpty() || txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtDireccion.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Todos los campos son requeridos");
                } else {
                    adminsDTO nuevoAdmin = new adminsDTO();
                    nuevoAdmin.setUsuario(txtUsuario.getText());
                    nuevoAdmin.setClave(txtClave.getText());
                    nuevoAdmin.setNombres(txtNombre.getText());
                    nuevoAdmin.setApellidos(txtApellido.getText());
                    nuevoAdmin.setDireccion(txtDireccion.getText());
                    nuevoAdmin.setCargo(JBCargo.getSelectedIndex());
                    nuevoAdmin.setId_admin((int) datosFila.get(0));
                    adminsDAO.actualizarAdmin(nuevoAdmin);

                    txtUsuario.setText("");
                    txtClave.setText("");
                    txtNombre.setText("");
                    txtApellido.setText("");
                    txtDireccion.setText("");
                    JBCargo.setSelectedIndex(0);

                }
            }
        });

        btnRegresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                accionAdmins();
            }
        });

        // Actualiza la interfaz gráfica
        panelAbajo.revalidate();
        panelAbajo.repaint();
    }

    private void accionbtnEditarUser(ArrayList lista) {
        ArrayList<Object> datosFila = lista;
        panelAbajo.removeAll();
        jLabelTop.setText("dashboard/usuarios/editar");

        // Agrega las referencias a los archivos CSS y JavaScript de Bootstrap Switch
        JLabel bootstrapSwitchCss = new JLabel();
        bootstrapSwitchCss.setText("<html><head><link rel='stylesheet' href='lib/bootstrap-switch.min.css'></head><body></body></html>");
        JLabel bootstrapSwitchJs = new JLabel();
        bootstrapSwitchJs.setText("<html><head><script src='lib/bootstrap-switch.min.js'></script></head><body></body></html>");
        // Crea los componentes del formulario utilizando las clases de estilo de Bootstrap

        JLabel lblTelefono1 = new JLabel("Telefono 1:");
        lblTelefono1.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        lblTelefono1.setForeground(new Color(52, 58, 64));

        JTextField txtTelefono1 = new JTextField();

        txtTelefono1.setText((String) datosFila.get(5));

        txtTelefono1.setPreferredSize(new Dimension(250, 30));
        txtTelefono1.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        lblNombre.setForeground(new Color(52, 58, 64));

        JTextField txtNombre = new JTextField();
        txtNombre.setText((String) datosFila.get(2));
        txtNombre.setPreferredSize(new Dimension(250, 30));
        txtNombre.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));

        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        lblApellido.setForeground(new Color(52, 58, 64));

        JTextField txtApellido = new JTextField();
        txtApellido.setText((String) datosFila.get(3));
        txtApellido.setPreferredSize(new Dimension(250, 30));
        txtApellido.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));

        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        lblUsuario.setForeground(new Color(52, 58, 64));

        JTextField txtUsuario = new JTextField();
        txtUsuario.setText(Integer.toString((int) datosFila.get(1)));
        txtUsuario.setEditable(false);
        txtUsuario.setPreferredSize(new Dimension(250, 30));
        txtUsuario.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));

        JLabel lblDireccion = new JLabel("Direccion:");
        lblDireccion.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        lblDireccion.setForeground(new Color(52, 58, 64));

        JTextField txtDireccion = new JTextField();
        txtDireccion.setText((String) datosFila.get(4));
        txtDireccion.setPreferredSize(new Dimension(250, 30));
        txtDireccion.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));

        JLabel lblTelefono2 = new JLabel("Telefono 2:");
        lblTelefono2.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        lblTelefono2.setForeground(new Color(52, 58, 64));

        JTextField txtTelefono2 = new JTextField();
        txtTelefono2.setText((String) datosFila.get(6));

        txtTelefono2.setPreferredSize(new Dimension(250, 30));
        txtTelefono2.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));

        JLabel lblGrado = new JLabel("Grado:");
        lblGrado.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        lblGrado.setForeground(new Color(52, 58, 64));

        JComboBox JCGrado = new JComboBox();
        JCGrado.addItem("601");
        JCGrado.addItem("602");
        JCGrado.addItem("603");
        JCGrado.addItem("604");
        JCGrado.setSelectedItem(datosFila.get(7));

        // Agrega los componentes al panel utilizando un diseño de cuadrícula
        panelAbajo.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        panelAbajo.add(lblUsuario, gbc);
        gbc.gridx = 1;
        panelAbajo.add(txtUsuario, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panelAbajo.add(lblNombre, gbc);
        gbc.gridx = 1;
        panelAbajo.add(txtNombre, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        panelAbajo.add(lblApellido, gbc);
        gbc.gridx = 1;
        panelAbajo.add(txtApellido, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        panelAbajo.add(lblDireccion, gbc);
        gbc.gridx = 1;
        panelAbajo.add(txtDireccion, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        panelAbajo.add(lblTelefono1, gbc);
        gbc.gridx = 1;
        panelAbajo.add(txtTelefono1, gbc);
        gbc.gridx = 0;
        gbc.gridy = 5;
        panelAbajo.add(lblTelefono2, gbc);
        gbc.gridx = 1;
        panelAbajo.add(txtTelefono2, gbc);
        gbc.gridx = 0;
        gbc.gridy = 6;
        panelAbajo.add(lblGrado, gbc);
        gbc.gridx = 1;
        panelAbajo.add(JCGrado, gbc);
        gbc.gridx = 0;
        gbc.gridy = 7;

        JButton enviar = new JButton("Enviar");
        enviar.setPreferredSize(new Dimension(250, 30));
        enviar.setBackground(verde);
        enviar.setForeground(Color.WHITE);
        enviar.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));
        gbc.gridx = 1;
        gbc.gridy = 8;
        panelAbajo.add(enviar, gbc);
        JButton btnRegresar = new JButton("Regresar");
        btnRegresar.setPreferredSize(new Dimension(250, 30));
        btnRegresar.setBackground(verde);
        btnRegresar.setForeground(Color.WHITE);
        btnRegresar.setBorder(BorderFactory.createLineBorder(new Color(108, 117, 125)));
        gbc.gridx = 1;
        gbc.gridy = 9;
        panelAbajo.add(btnRegresar, gbc);

        // Agrega los archivos CSS y JavaScript de Bootstrap Switch al panel
        panelAbajo.add(bootstrapSwitchCss);
        panelAbajo.add(bootstrapSwitchJs);

        enviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txtUsuario.getText().isEmpty() || txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtDireccion.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Todos los campos son requeridos");
                } else {
                    UsuariosDTO usersDto = new UsuariosDTO();
                    usersDto.setId_usuario((int) datosFila.get(0));
                    usersDto.setUser_generico(Integer.parseInt(txtUsuario.getText()));
                    usersDto.setNombre(txtNombre.getText());
                    usersDto.setApellido(txtApellido.getText());
                    usersDto.setDireccion(txtDireccion.getText());
                    usersDto.setTelefono(txtTelefono1.getText());
                    usersDto.setTelefonoF(txtTelefono2.getText());
                    usersDto.setGrado(Integer.parseInt((String) JCGrado.getSelectedItem()));
                    UsuariosDAO.actualizarUser(usersDto);

                }
            }
        });

        btnRegresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                accionUsers();
            }
        });

        // Actualiza la interfaz gráfica
        panelAbajo.revalidate();
        panelAbajo.repaint();

    }

    private void pintarMenuHome() {
        botonHome = new JButton();
        botonHome.setPreferredSize(new Dimension(300, 50));
        botonHome.setOpaque(true);
        botonHome.setBackground(verdeClaro);
        botonHome.setText("Home");
        panelIzquierda.add(botonHome);
        botonHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.out.println("Se dio click en  boton Home");
                accionHome();
            }
        });
    }

    private void pintarMenuAdmins() {
        botonAdmins = new JButton();
        botonAdmins.setPreferredSize(new Dimension(300, 50));
        botonAdmins.setContentAreaFilled(false); // Quitar el relleno del botón
        botonAdmins.setOpaque(true);
        botonAdmins.setBackground(verdeClaro);
        botonAdmins.setText("Administradores");
        panelIzquierda.add(botonAdmins);
        botonAdmins.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.out.println("Se dio click en  boton Admins");
                accionAdmins();
            }
        });
    }

    private void pintarMenuUsers() {
        botonUsers = new JButton();
        botonUsers.setPreferredSize(new Dimension(300, 50));
        botonUsers.setContentAreaFilled(false); // Quitar el relleno del botón
        botonUsers.setOpaque(true);
        botonUsers.setBackground(verdeClaro);
        botonUsers.setText("Usuarios");
        panelIzquierda.add(botonUsers);
        botonUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.out.println("Se dio click en  boton Users");
                accionUsers();
            }
        });
    }
     private void pintarMenuLibros() {
        botonUsers = new JButton();
        botonUsers.setPreferredSize(new Dimension(300, 50));
        botonUsers.setContentAreaFilled(false); // Quitar el relleno del botón
        botonUsers.setOpaque(true);
        botonUsers.setBackground(verdeClaro);
        botonUsers.setText("Usuarios");
        panelIzquierda.add(botonUsers);
        botonUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.out.println("Se dio click en  boton Users");
                accionUsers();
            }
        });
    }

    public void pintarPanelIzquierdo() {
        JLabel logo = new JLabel();
        logo.setIcon(new ImageIcon(getClass().getResource("/resources/logoHome.png")));
        logo.setPreferredSize(new Dimension(300, 200));
        panelIzquierda.add(logo);
    }

    public static void main(String[] args) {
        new GUIPrincipalAuxiliares();
    }
}
