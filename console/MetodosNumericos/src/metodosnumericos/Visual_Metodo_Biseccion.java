
package metodosnumericos;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;

public class Visual_Metodo_Biseccion extends JFrame{
    
    MetodoBiseccion met = new MetodoBiseccion();
    
    //Atributos
    private JLabel lblEcuacion;
    private JLabel lblIntervalo;
    private JLabel lblError;
    private JLabel lblDecimales;
    private JLabel lblX1;
    private JLabel lblX2;
    private JLabel lblX3;
    private JLabel lblX4;
    private JLabel lblX5;
    private JLabel lblX6;
    private JLabel lblConst;
    static JTextField txtX1;
    static JTextField txtX2;
    static JTextField txtX3;
    static JTextField txtX4;
    static JTextField txtX5;
    static JTextField txtX6;
    static JTextField txtConst;
    static JTextField txtIntervaloSup;
    static JTextField txtIntervaloInf;
    static JTextField txtError;
    private JTextField txtDecimales;
    private JTextField txtsig1;
    private JTextField txtsig2;
    private JTextField txtsig3;
    private JTextField txtsig4;
    private JTextField txtsig5;
    private JTextField txtsig6;
    private JComboBox cbxDecimales;
    private JComboBox cbxX1;
    private JComboBox cbxX2;
    private JComboBox cbxX3;
    private JComboBox cbxX4;
    private JComboBox cbxX5;
    private JComboBox cbxX6;
    private JButton btn;

    //Constructor
    public Visual_Metodo_Biseccion() {
        setTitle("Método de Bisección");
        setLayout(null);
//        setBounds(1000, 200, 585, 410);
        setBounds(200, 200, 1230, 410);
        setResizable(false);
        Font fuente = new Font("ARIAL", Font.PLAIN, 25);
        //Instanciando los atributos
        lblEcuacion = new JLabel("Ecuación:");
        lblIntervalo = new JLabel("Intervalo:");
        lblError = new JLabel("Error:");
        lblDecimales = new JLabel("Decimales:");
        lblX1 = new JLabel("X^1");
        lblX2 = new JLabel("X^2");
        lblX3 = new JLabel("X^3");
        lblX4 = new JLabel("X^4");
        lblX5 = new JLabel("X^5");
        lblX6 = new JLabel("X^6");
        txtX1 = new JTextField();
        txtX2 = new JTextField();
        txtX3 = new JTextField();
        txtX4 = new JTextField();
        txtX5 = new JTextField();
        txtX6 = new JTextField();
        txtConst = new JTextField();
        txtIntervaloSup = new JTextField();
        txtIntervaloInf = new JTextField();
        txtError = new JTextField();
        cbxX1 = new JComboBox();
        cbxX2 = new JComboBox();
        cbxX3 = new JComboBox();
        cbxX4 = new JComboBox();
        cbxX5 = new JComboBox();
        cbxX6 = new JComboBox();
        txtX1.setText("0");
        txtX2.setText("0");
        txtX3.setText("0");
        txtX4.setText("0");
        txtX5.setText("0");
        txtX6.setText("0");
        cbxX1.addItem("+");
        cbxX1.addItem("-");
        txtsig1 = new JTextField();
        cbxX2.addItem("+");
        cbxX2.addItem("-");
        txtsig2 = new JTextField();
        cbxX3.addItem("+");
        cbxX3.addItem("-");
        txtsig3 = new JTextField();
        cbxX4.addItem("+");
        cbxX4.addItem("-");
        txtsig4 = new JTextField();
        cbxX5.addItem("+");
        cbxX5.addItem("-");
        txtsig5 = new JTextField();
        cbxX6.addItem("+");
        cbxX6.addItem("-");
        txtsig6 = new JTextField();
        cbxDecimales = new JComboBox();
        txtDecimales = new JTextField();
        cbxDecimales.addItem("1");
        cbxDecimales.addItem("2");
        cbxDecimales.addItem("3");
        cbxDecimales.addItem("4");
        cbxDecimales.addItem("5");
        cbxDecimales.addItem("6");
        cbxDecimales.addItem("7");
        cbxDecimales.addItem("8");
        cbxDecimales.addItem("9");
        btn = new JButton("Calcular");
        //Colocando en coordenadas (x,y), ancho y alto los atributos
        lblEcuacion.setBounds(30, 30, 170, 40);
        txtX6.setBounds(200, 30, 50, 40);
        lblX6.setBounds(250, 30, 50, 40);
        cbxX6.setBounds(300, 30, 50, 40);
        txtX5.setBounds(355, 30, 50, 40);
        lblX5.setBounds(405, 30, 50, 40);
        cbxX5.setBounds(455, 30, 50, 40);
        txtX4.setBounds(510, 30, 50, 40);
        lblX4.setBounds(560, 30, 50, 40);
        cbxX4.setBounds(610, 30, 50, 40);
        txtX3.setBounds(670, 30, 50, 40);
        lblX3.setBounds(720, 30, 50, 40);
        cbxX3.setBounds(770, 30, 50, 40);
        txtX2.setBounds(830, 30, 50, 40);
        lblX2.setBounds(880, 30, 50, 40);
        cbxX2.setBounds(930, 30, 50, 40);
        txtX1.setBounds(990, 30, 50, 40);
        lblX1.setBounds(1040, 30, 50, 40);
        cbxX1.setBounds(1090, 30, 50, 40);
        txtConst.setBounds(1150,30,50,40);
        
        lblIntervalo.setBounds(30, 90, 170, 40);
        txtIntervaloSup.setBounds(200, 90, 495, 40);
        txtIntervaloInf.setBounds(705, 90, 495, 40);
        lblError.setBounds(30, 150, 170, 40);
        txtError.setBounds(200, 150, 1000, 40);
        lblDecimales.setBounds(30, 210, 170, 40);
        cbxDecimales.setBounds(200, 210, 1000, 40);
        btn.setBounds(30, 290, 1170, 50);
        //Cambiando tipografía a los atributos
        lblEcuacion.setFont(fuente);
        txtX1.setFont(fuente);
        lblIntervalo.setFont(fuente);
        txtIntervaloSup.setFont(fuente);
        txtIntervaloInf.setFont(fuente);
        lblError.setFont(fuente);
        txtError.setFont(fuente);
        lblDecimales.setFont(fuente);
        cbxDecimales.setFont(fuente);
        btn.setFont(fuente);
        lblX1.setFont(fuente);
        lblX2.setFont(fuente);
        lblX3.setFont(fuente);
        lblX4.setFont(fuente);
        lblX5.setFont(fuente);
        lblX6.setFont(fuente);
        txtX1.setFont(fuente);
        txtX2.setFont(fuente);
        txtX3.setFont(fuente);
        txtX4.setFont(fuente);
        txtX5.setFont(fuente);
        txtX6.setFont(fuente);
        txtConst.setFont(fuente);
        cbxX1.setFont(fuente);
        cbxX2.setFont(fuente);
        cbxX3.setFont(fuente);
        cbxX4.setFont(fuente);
        cbxX5.setFont(fuente);
        cbxX6.setFont(fuente);
        //Agregando los atributos al Frame
        add(lblEcuacion);
        add(txtX6);
        add(lblX6);
        add(cbxX6);
        add(txtsig6);
        add(txtX5);
        add(lblX5);
        add(cbxX5);
        add(txtsig5);
        add(txtX4);
        add(lblX4);
        add(cbxX4);
        add(txtsig4);
        add(txtX3);
        add(lblX3);
        add(cbxX3);
        add(txtsig3);
        add(txtX2);
        add(lblX2);
        add(cbxX2);
        add(txtsig2);
        add(txtX1);
        add(lblX1);
        add(cbxX1);
        add(txtsig1);
        add(txtConst);
        add(lblIntervalo);
        add(txtIntervaloSup);
        add(txtIntervaloInf);
        add(lblError);
        add(txtError);
        add(lblDecimales);
        add(cbxDecimales);
        add(txtDecimales);
        
        add(btn);
        cbxDecimales.setBackground(Color.white);
        setVisible(true);
        
        
        
        cbxDecimales.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDecimales.setText(cbxDecimales.getSelectedItem().toString());
            }
        });
        
        cbxX1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtsig1.setText((String) cbxX1.getSelectedItem());
                
            }
        });
        
        cbxX2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtsig2.setText((String) cbxX2.getSelectedItem());
            }
            
        });
        
        cbxX3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtsig3.setText((String) cbxX3.getSelectedItem());
            }
        });
        
        cbxX4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtsig4.setText((String) cbxX4.getSelectedItem());
            }
        });
        
        cbxX5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtsig5.setText((String) cbxX5.getSelectedItem());
            }
        });
        
        cbxX6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtsig6.setText((String) cbxX6.getSelectedItem());
            }
        });
        
        
        btn.addActionListener(new ActionListener() {
            @Override
            
            public void actionPerformed(ActionEvent e) {
                
                String tIntervaloSup = txtIntervaloSup.getText().trim();
                String tIntervaloInf = txtIntervaloInf.getText().trim();
                String tError = txtError.getText().trim();
                String tX1 = txtX1.getText().trim();
                String tX2 = txtX2.getText().trim();
                String tX3 = txtX3.getText().trim();
                String tX4 = txtX4.getText().trim();
                String tX5 = txtX5.getText().trim();
                String tX6 = txtX6.getText().trim();
                String tConstante = txtConst.getText().trim();
                String boxDecimales =txtDecimales.getText().trim();
                String sim1 = txtsig1.getText();
                String sim2 = txtsig2.getText();
                String sim3 = txtsig3.getText();
                String sim4 = txtsig4.getText();
                String sim5 = txtsig5.getText();
                String sim6 = txtsig6.getText();
                
                if (txtX1.getText().equals("")
                        || txtIntervaloSup.getText().equals("")
                        || txtIntervaloInf.getText().equals("")
                        || txtError.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "<html><h1><font color=azul>Atención: Campo(s) vacío(s)</font></h1></html>");
                }else if(txtIntervaloSup.getText().contains("´")|| txtIntervaloSup.getText().contains("+")
                        || txtIntervaloSup.getText().contains("*")|| txtIntervaloSup.getText().contains("{")
                        || txtIntervaloSup.getText().contains("}") || txtIntervaloSup.getText().contains("[")
                        || txtIntervaloSup.getText().contains("]") 
                        || txtIntervaloSup.getText().contains("_") || txtIntervaloSup.getText().contains(":")
                        || txtIntervaloSup.getText().contains(",") || txtIntervaloSup.getText().contains(";")
                        || txtIntervaloSup.getText().contains("|") || txtIntervaloSup.getText().contains("°")
                        || txtIntervaloSup.getText().contains("!") || txtIntervaloSup.getText().contains("#")
                        || txtIntervaloSup.getText().contains("$") || txtIntervaloSup.getText().contains("%")
                        || txtIntervaloSup.getText().contains("&") || txtIntervaloSup.getText().contains("/")
                        || txtIntervaloSup.getText().contains("=") || txtIntervaloSup.getText().contains(" ")){ 
                    JOptionPane.showMessageDialog(null, "El caracter en la casilla Intervalo A no es valido");
                }else if(txtIntervaloSup.getText().contains("´")|| txtIntervaloInf.getText().contains("+")
                        || txtIntervaloInf.getText().contains("*")|| txtIntervaloInf.getText().contains("{")
                        || txtIntervaloInf.getText().contains("}") || txtIntervaloInf.getText().contains("[")
                        || txtIntervaloInf.getText().contains("]") 
                        || txtIntervaloInf.getText().contains("_") || txtIntervaloInf.getText().contains(":")
                        || txtIntervaloInf.getText().contains(",") || txtIntervaloInf.getText().contains(";")
                        || txtIntervaloInf.getText().contains("|") || txtIntervaloInf.getText().contains("°")
                        || txtIntervaloInf.getText().contains("!") || txtIntervaloInf.getText().contains("#")
                        || txtIntervaloInf.getText().contains("$") || txtIntervaloInf.getText().contains("%")
                        || txtIntervaloInf.getText().contains("&") || txtIntervaloInf.getText().contains("/")
                        || txtIntervaloInf.getText().contains("=") || txtIntervaloInf.getText().contains(" ")){ 
                    JOptionPane.showMessageDialog(null, "El caracter en la casilla Intervalo B no es valido");
                }else if (txtError.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Favor de rellenar el campo de Error");    
                }else if(txtError.getText().contains("´")|| txtError.getText().contains("+")
                        || txtError.getText().contains("*")|| txtError.getText().contains("{")
                        || txtError.getText().contains("}") || txtError.getText().contains("[")
                        || txtError.getText().contains("]") || txtError.getText().contains("-")
                        || txtError.getText().contains("_") || txtError.getText().contains(":")
                        || txtError.getText().contains(",") || txtError.getText().contains(";")
                        || txtError.getText().contains("|") || txtError.getText().contains("°")
                        || txtError.getText().contains("!") || txtError.getText().contains("#")
                        || txtError.getText().contains("$") || txtError.getText().contains("%")
                        || txtError.getText().contains("&") || txtError.getText().contains("/")
                        || txtError.getText().contains("=") || txtError.getText().contains(" ")){ 
                    JOptionPane.showMessageDialog(null, "El caracter en la casilla de Error no es valido");
                }else if(txtConst.getText().contains("´")|| txtConst.getText().contains("+")
                        || txtConst.getText().contains("*")|| txtConst.getText().contains("{")
                        || txtConst.getText().contains("}") || txtConst.getText().contains("[")
                        || txtConst.getText().contains("]") || txtError.getText().contains("-")
                        || txtConst.getText().contains("_") || txtConst.getText().contains(":")
                        || txtConst.getText().contains(",") || txtConst.getText().contains(";")
                        || txtConst.getText().contains("|") || txtConst.getText().contains("°")
                        || txtConst.getText().contains("!") || txtConst.getText().contains("#")
                        || txtConst.getText().contains("$") || txtConst.getText().contains("%")
                        || txtConst.getText().contains("&") || txtConst.getText().contains("/")
                        || txtConst.getText().contains("=") || txtConst.getText().contains(" ")){ 
                    JOptionPane.showMessageDialog(null, "El caracter en la casilla Intervalo A no es valido");
                }else if(txtX1.getText().contains("´")|| txtX1.getText().contains("+")
                        || txtX1.getText().contains("*")|| txtX1.getText().contains("{")
                        || txtX1.getText().contains("}") || txtX1.getText().contains("[")
                        || txtX1.getText().contains("]") || txtError.getText().contains("-")
                        || txtX1.getText().contains("_") || txtX1.getText().contains(":")
                        || txtX1.getText().contains(",") || txtX1.getText().contains(";")
                        || txtX1.getText().contains("|") || txtX1.getText().contains("°")
                        || txtX1.getText().contains("!") || txtX1.getText().contains("#")
                        || txtX1.getText().contains("$") || txtX1.getText().contains("%")
                        || txtX1.getText().contains("&") || txtX1.getText().contains("/")
                        || txtX1.getText().contains("=") || txtX1.getText().contains(" ")){ 
                    JOptionPane.showMessageDialog(null, "El caracter en la casilla Intervalo B no es valido");
                }else if(txtX2.getText().contains("´")|| txtX2.getText().contains("+")
                        || txtX2.getText().contains("*")|| txtX2.getText().contains("{")
                        || txtX2.getText().contains("}") || txtX2.getText().contains("[")
                        || txtX2.getText().contains("]") || txtError.getText().contains("-")
                        || txtX2.getText().contains("_") || txtX2.getText().contains(":")
                        || txtX2.getText().contains(",") || txtX2.getText().contains(";")
                        || txtX2.getText().contains("|") || txtX2.getText().contains("°")
                        || txtX2.getText().contains("!") || txtX2.getText().contains("#")
                        || txtX2.getText().contains("$") || txtX2.getText().contains("%")
                        || txtX2.getText().contains("&") || txtX2.getText().contains("/")
                        || txtX2.getText().contains("=") || txtX2.getText().contains(" ")){ 
                    JOptionPane.showMessageDialog(null, "El caracter en la casilla Intervalo B no es valido");
                }else if(txtX3.getText().contains("´")|| txtX3.getText().contains("+")
                        || txtX3.getText().contains("*")|| txtX3.getText().contains("{")
                        || txtX3.getText().contains("}") || txtX3.getText().contains("[")
                        || txtX3.getText().contains("]") || txtError.getText().contains("-")
                        || txtX3.getText().contains("_") || txtX3.getText().contains(":")
                        || txtX3.getText().contains(",") || txtX3.getText().contains(";")
                        || txtX3.getText().contains("|") || txtX3.getText().contains("°")
                        || txtX3.getText().contains("!") || txtX3.getText().contains("#")
                        || txtX3.getText().contains("$") || txtX3.getText().contains("%")
                        || txtX3.getText().contains("&") || txtX3.getText().contains("/")
                        || txtX3.getText().contains("=") || txtX3.getText().contains(" ")){ 
                    JOptionPane.showMessageDialog(null, "El caracter en la casilla Intervalo B no es valido");
                }else if(txtX4.getText().contains("´")|| txtX4.getText().contains("+")
                        || txtX4.getText().contains("*")|| txtX4.getText().contains("{")
                        || txtX4.getText().contains("}") || txtX4.getText().contains("[")
                        || txtX4.getText().contains("]") || txtError.getText().contains("-")
                        || txtX4.getText().contains("_") || txtX4.getText().contains(":")
                        || txtX4.getText().contains(",") || txtX4.getText().contains(";")
                        || txtX4.getText().contains("|") || txtX4.getText().contains("°")
                        || txtX4.getText().contains("!") || txtX4.getText().contains("#")
                        || txtX4.getText().contains("$") || txtX4.getText().contains("%")
                        || txtX4.getText().contains("&") || txtX4.getText().contains("/")
                        || txtX4.getText().contains("=") || txtX4.getText().contains(" ")){ 
                    JOptionPane.showMessageDialog(null, "El caracter en la casilla Intervalo B no es valido");
                }else if(txtX5.getText().contains("´")|| txtX5.getText().contains("+")
                        || txtX5.getText().contains("*")|| txtX5.getText().contains("{")
                        || txtX5.getText().contains("}") || txtX5.getText().contains("[")
                        || txtX5.getText().contains("]") || txtError.getText().contains("-") 
                        || txtX5.getText().contains("_") || txtX5.getText().contains(":")
                        || txtX5.getText().contains(",") || txtX5.getText().contains(";")
                        || txtX5.getText().contains("|") || txtX5.getText().contains("°")
                        || txtX5.getText().contains("!") || txtX5.getText().contains("#")
                        || txtX5.getText().contains("$") || txtX5.getText().contains("%")
                        || txtX5.getText().contains("&") || txtX5.getText().contains("/")
                        || txtX5.getText().contains("=") || txtX5.getText().contains(" ")){ 
                    JOptionPane.showMessageDialog(null, "El caracter en la casilla Intervalo B no es valido");
                }else if(txtX6.getText().contains("´")|| txtX6.getText().contains("+")
                        || txtX6.getText().contains("*")|| txtX6.getText().contains("{")
                        || txtX6.getText().contains("}") || txtX6.getText().contains("[")
                        || txtX6.getText().contains("]")|| txtError.getText().contains("-")
                        || txtX6.getText().contains("_") || txtX6.getText().contains(":")
                        || txtX6.getText().contains(",") || txtX6.getText().contains(";")
                        || txtX6.getText().contains("|") || txtX6.getText().contains("°")
                        || txtX6.getText().contains("!") || txtX6.getText().contains("#")
                        || txtX6.getText().contains("$") || txtX6.getText().contains("%")
                        || txtX6.getText().contains("&") || txtX6.getText().contains("/")
                        || txtX6.getText().contains("=") || txtX6.getText().contains(" ")){ 
                    JOptionPane.showMessageDialog(null, "El caracter en la casilla Intervalo B no es valido");
                }else {
//                    if(txt)
                    
                    
                    
                    double intervaloA = Double.parseDouble(txtIntervaloSup.getText().trim());
                    double intervaloB = Double.parseDouble(txtIntervaloInf.getText().trim());
                    double constante = Double.parseDouble(txtConst.getText().trim());
                    double error = Double.parseDouble(txtError.getText().trim());
                    int decimales = Integer.parseInt(txtDecimales.getText().trim());
                    double x1 = Double.parseDouble(txtX1.getText().trim());
                    double x2 = Double.parseDouble(txtX2.getText().trim());
                    double x3 = Double.parseDouble(txtX3.getText().trim());
                    double x4 = Double.parseDouble(txtX4.getText().trim());
                    double x5 = Double.parseDouble(txtX5.getText().trim());
                    double x6 = Double.parseDouble(txtX6.getText().trim());
                    met.setIntervaloA(intervaloA);
                    met.setIntervaloB(intervaloB);
                    met.setError(error);
                    met.setConstante(constante);
                    met.setDecimales(decimales);
                    met.setX1(x1);
                    met.setX2(x2);
                    met.setX3(x3);
                    met.setX4(x4);
                    met.setX5(x5);
                    met.setX6(x6);
                    met.setS1(sim1);
                    met.setS2(sim2);
                    met.setS3(sim3);
                    met.setS4(sim4);
                    met.setS5(sim5);
                    met.setS6(sim6);
                    
                    met.proceso();
                    
                    
                     
                }
                
            }
        });
    }
    
    
    public void ValidarLetras(JTextField campo) {
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if(Character.isLetter(c)){
                    e.consume();
                }
            }
        });
    }

    public static void main(String[] args) {
        Visual_Metodo_Biseccion ref = new Visual_Metodo_Biseccion();
        ref.ValidarLetras(txtIntervaloSup);
        ref.ValidarLetras(txtIntervaloInf);
        ref.ValidarLetras(txtError);
        ref.ValidarLetras(txtConst);
        ref.ValidarLetras(txtX1);
        ref.ValidarLetras(txtX2);
        ref.ValidarLetras(txtX3);
        ref.ValidarLetras(txtX4);
        ref.ValidarLetras(txtX5);
        ref.ValidarLetras(txtX6);
        
    }

}


    

