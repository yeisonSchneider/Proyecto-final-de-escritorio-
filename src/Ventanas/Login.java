/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Conexion.Conexion;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/**
 *
 * @author Mauricio
 */
public class Login extends javax.swing.JFrame {


    Conexion con = new Conexion();
    String u = "";
    String variable = "";
    int var = 0;
    String encryptedpassword;
    String salt;

    public Login() {

        initComponents();
        setUndecorated(true);
        setLocationRelativeTo(null);
        //btnIngresar.setEnabled(false);
        boolean error = false;

        leDni.setBorder(BorderFactory.createCompoundBorder(leDni.getBorder(), BorderFactory.createEmptyBorder(0, 18, 0, 0)));
        lePass.setBorder(BorderFactory.createCompoundBorder(lePass.getBorder(), BorderFactory.createEmptyBorder(0, 18, 0, 0)));

        con.ConectarBasedeDatos();
        this.getContentPane().setBackground(new java.awt.Color(238, 238, 238));
        lbDniInex.setVisible(false);
        lbPassInex.setVisible(false);

        btnCerrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0) {
                btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cerrar_con_hover.png")));
                lbCerrar.setForeground(new java.awt.Color(16, 136, 187));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cerrar_sin_hover.png")));
                lbCerrar.setForeground(new java.awt.Color(0, 0, 0));
            }
        });

    }

    class IndentedRenderer extends DefaultListCellRenderer {

        public Component getListCellRendererComponent(JList list, Object value,
                int index, boolean isSelected, boolean cellHasFocus) {
            JLabel lbl = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            lbl.setBorder(BorderFactory.createEmptyBorder(0, 18, 0, 0));//5 is the indent, modify to suit
            return lbl;
        }
    }

    class IndentedRenderer1 extends DefaultListCellRenderer {

        public Component getListCellRendererComponent(JList list, Object value,
                int index, boolean isSelected, boolean cellHasFocus) {
            JLabel lbl = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            lbl.setBorder(BorderFactory.createEmptyBorder(0, 18, 0, 0));//5 is the indent, modify to suit
            return lbl;
        }
    }

    class MyComboBoxRenderer extends JLabel implements ListCellRenderer {

        private String _title;

        public MyComboBoxRenderer(String title) {
            _title = title;
        }

        @Override
        public Component getListCellRendererComponent(JList list, Object value,
                int index, boolean isSelected, boolean hasFocus) {
            if (index == -1 && value == null) {
                setText(_title);
            } else {
                setText(value.toString());
            }
            return this;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        btnCerrar = new javax.swing.JButton();
        lbCerrar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        leDni = new javax.swing.JTextField();
        lbDni = new javax.swing.JLabel();
        lePass = new javax.swing.JPasswordField();
        lbPass = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        lbDniInex = new javax.swing.JLabel();
        lbPassInex = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setResizable(false);

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cerrar_sin_hover.png"))); // NOI18N
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setMaximumSize(new java.awt.Dimension(22, 22));
        btnCerrar.setMinimumSize(new java.awt.Dimension(22, 22));
        btnCerrar.setPreferredSize(new java.awt.Dimension(22, 22));
        btnCerrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnCerrarMouseMoved(evt);
            }
        });
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
        });
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        lbCerrar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lbCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCerrar.setText("CERRAR");
        lbCerrar.setToolTipText("");
        lbCerrar.setPreferredSize(new java.awt.Dimension(53, 12));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/titulo_turnero_municipal (1).png"))); // NOI18N

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setPreferredSize(new java.awt.Dimension(435, 416));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 46, 109));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("INICIAR SESIÓN");
        jLabel3.setPreferredSize(new java.awt.Dimension(138, 23));

        leDni.setBackground(new java.awt.Color(238, 238, 238));
        leDni.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        leDni.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 138, 153), 1, true));
        leDni.setPreferredSize(new java.awt.Dimension(278, 40));
        leDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leDniActionPerformed(evt);
            }
        });
        leDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                leDniKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                leDniKeyTyped(evt);
            }
        });

        lbDni.setFont(new java.awt.Font("Roboto", 1, 9)); // NOI18N
        lbDni.setForeground(new java.awt.Color(27, 182, 248));
        lbDni.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbDni.setText("DNI");
        lbDni.setPreferredSize(new java.awt.Dimension(15, 11));

        lePass.setBackground(new java.awt.Color(238, 238, 238));
        lePass.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lePass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 138, 153), 1, true));
        lePass.setPreferredSize(new java.awt.Dimension(278, 40));
        lePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lePassMouseClicked(evt);
            }
        });
        lePass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lePassKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lePassKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lePassKeyTyped(evt);
            }
        });

        lbPass.setFont(new java.awt.Font("Roboto", 1, 9)); // NOI18N
        lbPass.setForeground(new java.awt.Color(27, 182, 248));
        lbPass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbPass.setText("CONTRASEÑA");
        lbPass.setPreferredSize(new java.awt.Dimension(60, 11));

        btnIngresar.setBackground(new java.awt.Color(140, 179, 204));
        btnIngresar.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("INGRESAR");
        btnIngresar.setEnabled(false);
        btnIngresar.setPreferredSize(new java.awt.Dimension(278, 40));
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        lbDniInex.setFont(new java.awt.Font("Roboto", 0, 9)); // NOI18N
        lbDniInex.setForeground(new java.awt.Color(248, 27, 27));
        lbDniInex.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbDniInex.setText("El DNI no se encuentra en el sistema");
        lbDniInex.setPreferredSize(new java.awt.Dimension(151, 11));

        lbPassInex.setFont(new java.awt.Font("Roboto", 0, 9)); // NOI18N
        lbPassInex.setForeground(new java.awt.Color(248, 27, 27));
        lbPassInex.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbPassInex.setText("La contraseña no es correcta");
        lbPassInex.setPreferredSize(new java.awt.Dimension(120, 11));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(leDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lePass, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDni, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPass, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDniInex, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPassInex, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(lbDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(leDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lbDniInex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(lbPass, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lePass, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lbPassInex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/footer_logo.png"))); // NOI18N

        jSeparator2.setBackground(new java.awt.Color(0, 46, 109));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setPreferredSize(new java.awt.Dimension(35, 1));

        jLabel1.setBackground(new java.awt.Color(0, 46, 109));
        jLabel1.setFont(new java.awt.Font("Roboto", 0, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 46, 109));
        jLabel1.setText("Mesa de Entrada");
        jLabel1.setPreferredSize(new java.awt.Dimension(154, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(465, 465, 465))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(432, 432, 432))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(jLabel8))
        );

        setBounds(0, 0, 1366, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        //lePass.setBorder(BorderFactory.createCompoundBorder(lePass.getBorder(), BorderFactory.createEmptyBorder(0, 0, 0, 0)));
        try {

            u = leDni.getText();

            String p = lePass.getText().toUpperCase();

            String sql = "SELECT dni, contrasenia, salt FROM personal WHERE dni = '" + u + "'";
            con.resultado = con.sentencia.executeQuery(sql);

            if (con.resultado.next()) {
                encryptedpassword = con.resultado.getString("contrasenia");
                salt = con.resultado.getString("salt");
                Boolean status = PassBasedEnc.verifyUserPassword(p, encryptedpassword, salt);
                if (status == true) {
                    try {
                        // Creo una instancia de DocumentBuilderFactory
                        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                        // Creo un documentBuilder
                        DocumentBuilder builder = factory.newDocumentBuilder();
                        // Creo un DOMImplementation
                        DOMImplementation implementation = builder.getDOMImplementation();

                        // Creo un documento con un elemento raiz
                        Document documento = implementation.createDocument(null, "LoginMesaEntrada", null);
                        documento.setXmlVersion("1.0");

                        // Creo los elementos
                        Element datos = documento.createElement("datos");
                        Element dato = documento.createElement("dato");

                        // Matricula
                        Element dni = documento.createElement("dni");
                        Text textdni = documento.createTextNode(u);
                        dni.appendChild(textdni);
                        dato.appendChild(dni);

                        // Añado al elemento coches el elemento coche
                        datos.appendChild(dato);

                        // Añado al root el elemento coches
                        documento.getDocumentElement().appendChild(datos);

                        // Asocio el source con el Document
                        Source source = new DOMSource(documento);
                        // Creo el Result, indicado que fichero se va a crear
                        Result result = new StreamResult(new File("C:/archivosTurnero/LoginMesaEntrada.xml"));

                        // Creo un transformer, se crea el fichero XML
                        Transformer transformer = TransformerFactory.newInstance().newTransformer();
                        transformer.transform(source, result);

                        MesaEntrada_2 mesaE = new MesaEntrada_2();
                        mesaE.setVisible(true);
                        dispose();

                    } catch (ParserConfigurationException | TransformerException ex) {
                        System.out.println(ex.getMessage());
                    }
                } else {
                    //lbPassInex.setVisible(true);
                    lbPass.setForeground(new java.awt.Color(248, 27, 27));
                    lePass.setBorder(BorderFactory.createLineBorder(new java.awt.Color(248, 27, 27)));
                    leDni.setBorder(BorderFactory.createLineBorder(new java.awt.Color(248, 27, 27)));
                    lbDni.setForeground(new java.awt.Color(248, 27, 27));

                    lePass.setBorder(BorderFactory.createCompoundBorder(lePass.getBorder(), BorderFactory.createEmptyBorder(0, 18, 0, 0)));
                    leDni.setBorder(BorderFactory.createCompoundBorder(leDni.getBorder(), BorderFactory.createEmptyBorder(0, 18, 0, 0)));

                    ErrorLogin error = new ErrorLogin();
                    error.setVisible(true);

                }

                //lePass.setBorder(BorderFactory.createCompoundBorder(lePass.getBorder(), BorderFactory.createEmptyBorder(0, 18, 0, 0)));
            } else {
                //lbPassInex.setVisible(true);
                lbPass.setForeground(new java.awt.Color(248, 27, 27));
                lePass.setBorder(BorderFactory.createLineBorder(new java.awt.Color(248, 27, 27)));
                leDni.setBorder(BorderFactory.createLineBorder(new java.awt.Color(248, 27, 27)));
                lbDni.setForeground(new java.awt.Color(248, 27, 27));

                lePass.setBorder(BorderFactory.createCompoundBorder(lePass.getBorder(), BorderFactory.createEmptyBorder(0, 18, 0, 0)));
                leDni.setBorder(BorderFactory.createCompoundBorder(leDni.getBorder(), BorderFactory.createEmptyBorder(0, 18, 0, 0)));

                ErrorLogin error = new ErrorLogin();
                error.setVisible(true);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed


    private void btnCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseMoved

    }//GEN-LAST:event_btnCerrarMouseMoved

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited

    }//GEN-LAST:event_btnCerrarMouseExited

    private void lePassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lePassKeyTyped
        
    }//GEN-LAST:event_lePassKeyTyped

    private void lePassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lePassKeyReleased
        lbPassInex.setVisible(false);
        lbPass.setForeground(new java.awt.Color(27, 182, 248));
        lePass.setBorder(BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));
        lePass.setBorder(BorderFactory.createCompoundBorder(lePass.getBorder(), BorderFactory.createEmptyBorder(0, 18, 0, 0)));
        btnIngresar.setEnabled(true);
        btnIngresar.setBackground(new java.awt.Color(27, 182, 248));
        btnIngresar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0) {
                btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
                btnIngresar.setBackground(new java.awt.Color(16, 136, 187));

            }

            @Override
            public void mouseExited(MouseEvent e) {

                btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
                btnIngresar.setBackground(new java.awt.Color(27, 182, 248));
            }
        });

    }//GEN-LAST:event_lePassKeyReleased

    private void leDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_leDniKeyTyped

    }//GEN-LAST:event_leDniKeyTyped

    private void leDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_leDniKeyReleased
        lbDniInex.setVisible(false);
        lbDni.setForeground(new java.awt.Color(27, 182, 248));
        leDni.setBorder(BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));
        leDni.setBorder(BorderFactory.createCompoundBorder(leDni.getBorder(), BorderFactory.createEmptyBorder(0, 18, 0, 0)));

    }//GEN-LAST:event_leDniKeyReleased

    private void leDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leDniActionPerformed

    private void lePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lePassMouseClicked
        lbDniInex.setVisible(false);
        try {

            String u = leDni.getText();

            String sql = "SELECT dni FROM personal WHERE dni =" + u;
            con.resultado = con.sentencia.executeQuery(sql);

            if (con.resultado.next()) {
                lbDni.setForeground(new java.awt.Color(27, 182, 248));
                leDni.setBorder(BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));
                leDni.setBorder(BorderFactory.createCompoundBorder(leDni.getBorder(), BorderFactory.createEmptyBorder(0, 18, 0, 0)));

            } else {
                lbDniInex.setVisible(true);
                lbDni.setForeground(new java.awt.Color(248, 27, 27));
                leDni.setBorder(BorderFactory.createLineBorder(new java.awt.Color(248, 27, 27)));
                leDni.setBorder(BorderFactory.createCompoundBorder(leDni.getBorder(), BorderFactory.createEmptyBorder(0, 18, 0, 0)));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lePassMouseClicked

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarMouseClicked

    private void lePassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lePassKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            if (!lePass.getText().trim().equals("")) {
                btnIngresar.requestFocus();
                btnIngresar.doClick();

            } else {
                
                lePass.requestFocus();
            }
        }
    }//GEN-LAST:event_lePassKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbCerrar;
    private javax.swing.JLabel lbDni;
    private javax.swing.JLabel lbDniInex;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbPassInex;
    private javax.swing.JTextField leDni;
    private javax.swing.JPasswordField lePass;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
