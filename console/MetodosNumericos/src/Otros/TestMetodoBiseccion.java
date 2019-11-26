package Otros;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class TestMetodoBiseccion extends JFrame {

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
    static private JTextField txtX1;
    static private JTextField txtX2;
    static private JTextField txtX3;
    static private JTextField txtX4;
    static private JTextField txtX5;
    static private JTextField txtX6;
    static private JTextField txtConst;
    static private JTextField txtIntervaloSup;
    static private JTextField txtIntervaloInf;
    static private JTextField txtError;
    private JComboBox cbxDecimales;
    private JComboBox cbxX1;
    private JComboBox cbxX2;
    private JComboBox cbxX3;
    private JComboBox cbxX4;
    private JComboBox cbxX5;
    private JComboBox cbxX6;
    private JButton btn;
    private double x1;
    private double x2;
    private double x3;
    private double x4;
    private double x5;
    private double x6;
    private String sx1;
    private String sx2;
    private String sx3;
    private String sx4;
    private String sx5;
    private String sx6;
    private String sconstante;
    private double constante;
    private String s1;
    private String s2;
    private String s3;
    private String s4;
    private String s5;
    private String s6;
    private String sIntervaloSup;
    private String sIntervaloInf;
    private String sError;
    private double ecuacion;
    private double intervaloSup;
    private double intervaloInf;
    private double error;

    //Constructor
    public TestMetodoBiseccion() {
        setTitle("Método de Bisección");
        setLayout(null);
        setBounds(200, 200, 1235, 410);
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
        cbxX1.addItem("+");
        cbxX1.addItem("-");
        cbxX2.addItem("+");
        cbxX2.addItem("-");
        cbxX3.addItem("+");
        cbxX3.addItem("-");
        cbxX4.addItem("+");
        cbxX4.addItem("-");
        cbxX5.addItem("+");
        cbxX5.addItem("-");
        cbxX6.addItem("+");
        cbxX6.addItem("-");
        cbxDecimales = new JComboBox();
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
        txtConst.setBounds(1150, 30, 50, 40);
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
        add(txtX5);
        add(lblX5);
        add(cbxX5);
        add(txtX4);
        add(lblX4);
        add(cbxX4);
        add(txtX3);
        add(lblX3);
        add(cbxX3);
        add(txtX2);
        add(lblX2);
        add(cbxX2);
        add(txtX1);
        add(lblX1);
        add(cbxX1);
        add(txtConst);
        add(lblIntervalo);
        add(txtIntervaloSup);
        add(txtIntervaloInf);
        add(lblError);
        add(txtError);
        add(lblDecimales);
        add(cbxDecimales);
        add(btn);
        cbxDecimales.setBackground(Color.white);
        setVisible(true);
        //Instancia de la clase donde esta la solución del método
        MetodoBiseccion ref = new MetodoBiseccion();
        //Evento del botón
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtIntervaloSup.getText().equals("")//verificando que el usuario no deje vacíos los intervalos y el % de error
                        || txtIntervaloInf.getText().equals("")
                        || txtError.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "<html><h1><font color=red>Atención: Campo(s) vacío(s)</font></h1></html>");
                } else {
                    //guardando los valores del JTextField en Strings para poder utilizar .replace(); y reemplazar los JTextField vacíos por 0
                    sx1 = txtX1.getText();
                    if(sx1.contains(",")){
                        sx1 = sx1.replace(",",".");
                    }
                    sx2 = txtX2.getText();
                    if(sx2.contains(",")){
                        sx2 = sx2.replace(",",".");
                    }
                    sx3 = txtX3.getText();
                    if(sx3.contains(",")){
                        sx3 = sx3.replace(",",".");
                    }
                    sx4 = txtX4.getText();
                    if(sx4.contains(",")){
                        sx4 = sx4.replace(",",".");
                    }
                    sx5 = txtX5.getText();
                    if(sx5.contains(",")){
                        sx5 = sx5.replace(",",".");
                    }
                    sx6 = txtX6.getText();
                    if(sx6.contains(",")){
                        sx6 = sx6.replace(",",".");
                    }
                    sconstante = txtConst.getText();
                    if(sconstante.contains(",")){
                        sconstante = sconstante.replace(",",".");
                    }
                    sIntervaloSup = txtIntervaloSup.getText();
                     if(sIntervaloSup.contains(",")){
                        sIntervaloSup = sIntervaloSup.replace(",",".");
                    }
                     sIntervaloInf = txtIntervaloSup.getText();
                     if(sIntervaloInf.contains(",")){
                        sIntervaloInf = sIntervaloInf.replace(",",".");
                    }
                    //validando si el usuario dejo JTextField vacíos 
                    if (sx1.equals(""))sx1 = sx1.replace("", "0");//reemplazando JTextField vacíos por 0
                    if (sx2.equals(""))sx2 = sx2.replace("", "0");
                    if (sx3.equals(""))sx3 = sx3.replace("", "0");
                    if (sx4.equals(""))sx4 = sx4.replace("", "0");
                    if (sx5.equals(""))sx5 = sx5.replace("", "0");
                    if (sx6.equals(""))sx6 = sx6.replace("", "0");
                    if (sconstante.equals(""))sconstante = sconstante.replace("", "0");
                    //una vez que asignamos todos los valores a los JTextField, se parsean a Double para poder hacer las operaciones
                    x1 = Double.parseDouble(sx1);
                    x2 = Double.parseDouble(sx2);
                    x3 = Double.parseDouble(sx3);
                    x4 = Double.parseDouble(sx4);
                    x5 = Double.parseDouble(sx5);
                    x6 = Double.parseDouble(sx6);
                    constante = Double.parseDouble(sconstante);
                    //obteniendo el valor seleccionado de los JComboBox (+)||(-),y casteándolos a String para trabajarlos en el método de la solución
                    s1 = (String) cbxX1.getSelectedItem();
                    s2 = (String) cbxX2.getSelectedItem();
                    s3 = (String) cbxX3.getSelectedItem();
                    s4 = (String) cbxX4.getSelectedItem();
                    s5 = (String) cbxX5.getSelectedItem();
                    s6 = (String) cbxX6.getSelectedItem();
                    intervaloSup = Double.parseDouble(txtIntervaloSup.getText());//parseando a Double el JTextField del intervalo superior
                    intervaloInf = Double.parseDouble(txtIntervaloInf.getText());
                    error = Double.parseDouble(txtError.getText());
                    ref.setMetodoBiseccion(x1, x2, x3, x4, x5, x6, constante, intervaloSup, intervaloInf, error, s1, s2, s3, s4, s5, s6);
                }
            }
        });
        
    }
private void validarCaracteres(JTextField campo) {
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char[] charValidos = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.', ','};
                int aux = 0;
                for (int i = 0; i <= 11; i++) {
                    if (charValidos[i] == e.getKeyChar()) {
                        aux = 1;
                    }
                }
                if (aux == 0) {
                    e.consume();
                    getToolkit().beep();
                }
            }
        });
    }
private void validarCaracteresIntervalos(JTextField campo) {
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char[] charValidos = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.', ',', '-'};
                int aux = 0;
                for (int i = 0; i <= 12; i++) {
                    if (charValidos[i] == e.getKeyChar()) {
                        aux = 1;
                    }
                }
                if (aux == 0) {
                    e.consume();
                    getToolkit().beep();
                }
            }
        });
    }

    public static void main(String[] args) {
        TestMetodoBiseccion ref = new TestMetodoBiseccion();
        ref.validarCaracteres(txtX1);
        ref.validarCaracteres(txtX2);
        ref.validarCaracteres(txtX3);
        ref.validarCaracteres(txtX4);
        ref.validarCaracteres(txtX5);
        ref.validarCaracteres(txtX6);
        ref.validarCaracteresIntervalos(txtIntervaloSup);
        ref.validarCaracteresIntervalos(txtIntervaloInf);
        ref.validarCaracteres(txtError);
        ref.validarCaracteres(txtConst);
    }

}
