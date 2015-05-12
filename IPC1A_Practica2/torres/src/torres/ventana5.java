package torres;



import java.awt.event.*;
import java.awt.*;//barras
import javax.swing.Timer;

public class ventana5 extends javax.swing.JFrame implements ActionListener {

    Dimension tamano = Toolkit.getDefaultToolkit().getScreenSize();
    int i = 0;
    Timer timer;

    public ventana5() {
        initComponents();
        this.setSize((int) tamano.getWidth() / 2, (int) tamano.getHeight() / 2);
        timer = new Timer(100, this);
        timer.start();
    }

    public void actionPerformed(ActionEvent e) {
        i++;
        jLabel3.setBounds(i * 3, 30, 50, 30);
        jLabel4.setBounds(i * 5, 60, 50, 30);
        System.out.println("Elvalor de i es = " + i);
        jLabel1.setText("" + i);
        jLabel3.setText("" + i);
        jLabel4.setText("" + i);

        if (i == 100) {
            Toolkit.getDefaultToolkit().beep();
            timer.stop();
        }
    }

    private void initComponents() {
    	setTitle("Torres de Hanoi (Marlon Pineda)");
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 280, 34, 14);

        jLabel2.setText("Decimas de segundo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(33, 283, 130, 14);

        jLabel3.setBackground(new java.awt.Color(255, 204, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("8");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 200, 120, 30);

        jLabel4.setBackground(new java.awt.Color(51, 255, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("8");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 240, 120, 30);

        pack();
    }
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ventana5().setVisible(true);
            }
        });
    }
  
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;

}
