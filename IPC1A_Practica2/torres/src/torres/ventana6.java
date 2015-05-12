package torres;


import java.text.DateFormat;
import java.util.Date;
import java.awt.event.*;
import java.awt.*;//barras
import javax.swing.JFrame;
import javax.swing.Timer;

public class ventana6 extends javax.swing.JFrame {

    int minutos = 0, segundos = 0, horas = 0;
    Timer horizontal;
    int i = 0;
    int j = 0;
    int h = 0;
    public int hori5 = 0;
    public int hori6 = 0;

    public ventana6() {
        Dimension tamano = Toolkit.getDefaultToolkit().getScreenSize();
        initComponents();
        this.setSize((int) tamano.getWidth() / 2, (int) tamano.getHeight() / 2);
        new vertical(); 
    }

    private class vertical implements ActionListener {
        private Timer vertical = new Timer(10, this);
        public vertical() {
            vertical.start();
        }
        public void actionPerformed(ActionEvent e) {
            i++;
            hori5 = i * 3;
            hori6 = i * 5;
            jLabel5.setBounds(hori5, 30, 50, 30);
            jLabel6.setBounds(hori6, 60, 50, 30);
            jLabel5.setText("" + i);
            if (i == 150) {
                Toolkit.getDefaultToolkit().beep();
                vertical.stop();
                new horizontal(); 
            }
        }
    }
    private class horizontal implements ActionListener {
        private Timer horizontal = new Timer(10, this);
        public horizontal() {
            horizontal.start();
        }
        public void actionPerformed(ActionEvent e) {
            j++;
            jLabel5.setBounds(hori5, 30 + j * 3, 50, 30);
            jLabel6.setBounds(hori6, 50 + j * 5, 50, 30);
            jLabel5.setText("" + j);
            jLabel6.setText("" + j);
            if (j == 80) {
                Toolkit.getDefaultToolkit().beep();
                horizontal.stop();
            }
        }
    }

    private void initComponents() {
    	setTitle("Torres de Hanoi (Marlon Pineda)");
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(300, 100));
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 190, 120, 30);

        jLabel5.setBackground(new java.awt.Color(0, 255, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        jLabel5.setText("jLabel5");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 30, 50, 30);

        jLabel6.setBackground(new java.awt.Color(255, 51, 51));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel6.setText("jLabel6");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 80, 50, 30);

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
                new ventana6().setVisible(true);
            }
        });
    }
 
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem12;

}

