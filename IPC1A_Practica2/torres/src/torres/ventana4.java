package torres;

import java.text.DateFormat;
import java.util.Date;
import java.awt.event.*;
import java.awt.*;//barras
import javax.swing.JFrame;
import javax.swing.Timer;

public class ventana4 extends javax.swing.JFrame {

    int minutos = 0, segundos = 0, horas = 0;
    Timer cronometro;

    public ventana4() {
        super("Aplicación Torres de Hanoi");
        Dimension tamano = Toolkit.getDefaultToolkit().getScreenSize();

        initComponents();
        this.setMinimumSize(new Dimension(500, 220)); 
        setDefaultCloseOperation(0);
        this.setLocation((int) tamano.getWidth() / 2 - this.getWidth() / 2, 
                (int) tamano.getHeight() / 2 - this.getHeight() / 2);
        setResizable(false);
       
        jLabel2.setVisible(true);
        new reloj();
        new cronometro();
    }


    private class reloj implements ActionListener {
      
        private Timer muestraLaHora = new Timer(1000, this);
        public reloj() {
            muestraLaHora.start();
        }

        public void actionPerformed(ActionEvent e) {
            jLabel2.setText(DateFormat.getTimeInstance(DateFormat.MEDIUM).format(new Date()));
            System.out.println(DateFormat.getTimeInstance(DateFormat.MEDIUM).format(new Date()));
        }
    }

    private class cronometro implements ActionListener {
        private Timer cronometro = new Timer(1000, this);
        public cronometro() {
            cronometro.start();
        }

        public void actionPerformed(ActionEvent e) {
            segundos++;
            if (segundos == 59) {
                Toolkit.getDefaultToolkit().beep();
 
                segundos = 0;
                minutos++;
            }
            if (minutos == 59) {
                minutos = 0;
                horas++;
            }
            jLabel4.setText(horas + ":" + minutos + ":" + segundos);
            System.out.println(horas + ":" + minutos + ":" + segundos);
        }
    }

    private void initComponents() {
        setTitle("Torres de Hanoi (Marlon Pineda)");
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(300, 100));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        jLabel3.setText("Cronometro");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 100, 140, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(270, 100, 120, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 30, 150, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        jLabel1.setText("Reloj");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 30, 110, 29);

        jMenu1.setText("File");

        jMenuItem12.setText("Salir");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem12);

        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        pack();
    }

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {
      
        System.exit(0);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ventana4().setVisible(true);
            }
        });
    }
  
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem12;

}
