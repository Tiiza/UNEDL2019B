package metodosnumericos;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Primera_Act_Visual extends JFrame {

    private JLabel lblNumero;
    private JLabel lblError;
    private JLabel lblDecimales;

    static JTextField txtNumero;
    static JTextField txtError;
    private JTextField txtDecimales;

    private JComboBox boxDecimales;
    private JButton resultado;

    //Crear 7 botones de Agregar, Buscar Curp, Modificar, Remover, Buscar Dato, Listar (mostrar todo), Limpiar. Poner botones verficales a la derecha
    //Crear botones con accionListener que diga "trabajando"
    public Primera_Act_Visual() {
        setSize(200, 500);
        setTitle("Obtencion de Raices Cuadradas por Metodos Iterativos");
        setLocation(1200, 500);
        setLayout(new GridLayout(4, 3, 20, 20));
        setResizable(true);
        setVisible(true);
        setBounds(4, 2, 5, 5); //Margenes
        lblNumero = new JLabel("[ NUMERO ]");
        lblError = new JLabel("[ % DE ERROR ] ");
        lblDecimales = new JLabel("[ DECIMALES ]");

        txtNumero = new JTextField();
        txtError = new JTextField();

        boxDecimales = new JComboBox();
        txtDecimales = new JTextField();

        resultado = new JButton("GENERAR RESULTADO");

        resultado.setBounds(100, 150, 100, 30);

        //Imput: Campo de texto
        add(lblNumero);
        add(txtNumero);
        add(lblError);
        add(txtError);

        boxDecimales.addItem("1");
        boxDecimales.addItem("2");
        boxDecimales.addItem("3");
        boxDecimales.addItem("4");
        boxDecimales.addItem("5");
        boxDecimales.addItem("6");
        boxDecimales.addItem("7");
        boxDecimales.addItem("8");
        boxDecimales.addItem("9");
        add(lblDecimales);
        add(boxDecimales);
        
        add(resultado);

        boxDecimales.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDecimales.setText(boxDecimales.getSelectedItem().toString());
            }
        });

        resultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int numeroAproximaciones = 0;   //Int
                String numeroUs = txtNumero.getText().trim();
                String errorPor = txtError.getText().trim();
                String deci = txtDecimales.getText().trim();
                double aproximadoNumero = 0;
                int numeroBase = 1;
                int numeroExponente = 2;
                double er = 0;
                double numeroCiclo = 0;
                String decimal = "#.";

                if (txtNumero.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Favor de rellenar el campo de Numero");
                } else if(txtNumero.getText().contains("´")|| txtNumero.getText().contains("+")
                        || txtNumero.getText().contains("*")|| txtNumero.getText().contains("{")
                        || txtNumero.getText().contains("}") || txtNumero.getText().contains("[")
                        || txtNumero.getText().contains("]") || txtNumero.getText().contains("-")
                        || txtNumero.getText().contains("_") || txtNumero.getText().contains(":")
                        || txtNumero.getText().contains(",") || txtNumero.getText().contains(";")
                        || txtNumero.getText().contains("|") || txtNumero.getText().contains("°")
                        || txtNumero.getText().contains("!") || txtNumero.getText().contains("#")
                        || txtNumero.getText().contains("$") || txtNumero.getText().contains("%")
                        || txtNumero.getText().contains("&") || txtNumero.getText().contains("/")
                        || txtNumero.getText().contains("=") || txtNumero.getText().contains(" ")){ 
                    JOptionPane.showMessageDialog(null, "El caracter en la casilla numero no es valido");
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
                }else if (txtDecimales.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Favor de rellenar el campo de Decimales");
                } else {
                    
                double numeroUsuario = Double.parseDouble(txtNumero.getText().trim());  //Double
                double errorP = Double.parseDouble(txtError.getText().trim());  //Double
                int decimales = Integer.parseInt(txtDecimales.getText().trim());   //Int 
                
                
                    for (int i = 0; i < decimales; i++) {
                        decimal += "#";
                    }
                    DecimalFormat decimas = new DecimalFormat(decimal);
                    
                    
                    do {
                        aproximadoNumero = (int) Math.pow(numeroBase, numeroExponente);

                        numeroBase++;
                    } while (aproximadoNumero <= numeroUsuario);
                    numeroBase = numeroBase - 2;

                    System.out.println(" -----------------------------NUMERO BASE " + numeroBase);

                    if (numeroBase * numeroBase == numeroUsuario) {
                        System.out.print("La raiz es: ");
                        System.out.println(decimas.format((numeroBase)));

//        numeroAproximaciones+=;
                    } else {

                        aproximadoNumero = (0.5 * (numeroBase + numeroUsuario / numeroBase));

                        numeroCiclo = aproximadoNumero;

                        numeroAproximaciones++;

                        System.out.println("--------------------------------------------------");
                        System.out.print("Iteracion N°" + numeroAproximaciones + ": ");
                        System.out.println(decimas.format((aproximadoNumero)));

                        er = (aproximadoNumero - numeroBase) / aproximadoNumero;
                        er = er * 100;

                        System.out.print("Porcentaje de error: ");
                        System.out.println(decimas.format((er)));

                        System.out.println("---------------------------------------------------------------");

                        while (errorP <= er) {

                            aproximadoNumero = (0.5 * (aproximadoNumero + numeroUsuario / aproximadoNumero));

                            numeroAproximaciones++;

                            System.out.print("Iteracion N°" + numeroAproximaciones + ": ");
                            System.out.println(decimas.format((aproximadoNumero)));

                            er = (aproximadoNumero - numeroCiclo) / aproximadoNumero;
                            er = er * 100;

                            System.out.print("Porcentaje de error: ");
                            System.out.println(decimas.format((er)));

                            numeroCiclo = aproximadoNumero;
                            System.out.println("------------------------------------------------------------------");

                            if (numeroAproximaciones == 10) {
                                System.out.println("TIENDE A INFINITO ");
                                break;
                            }
                        }

                        aproximadoNumero = (0.5 * (aproximadoNumero + numeroUsuario / aproximadoNumero));

                        numeroAproximaciones++;

                        System.out.print("Iteracion N°" + numeroAproximaciones + ": ");
                        System.out.println(decimas.format((aproximadoNumero)));

                        er = (aproximadoNumero - numeroCiclo) / aproximadoNumero;
                        er = er * 100;

                        System.out.print("Porcentaje de error: ");
                        System.out.println(decimas.format((er)));

                        numeroCiclo = aproximadoNumero;
                        System.out.println("------------------------------------------------------------------");

                        System.out.print("Numero de interaciones: ");
                        System.out.println(numeroAproximaciones);
                        System.out.print("La raiz es: ");
                        System.out.println(decimas.format((aproximadoNumero)));
                    }
//                                       
                }
            }

        });

        pack();
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
        Primera_Act_Visual act = new Primera_Act_Visual();
        act.ValidarLetras(txtNumero);
        act.ValidarLetras(txtError);
    }

}
