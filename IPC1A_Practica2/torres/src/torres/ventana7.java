package torres;


import java.awt.event.*;
import java.awt.*;
import javax.swing.Timer;

public class ventana7 extends javax.swing.JFrame {

    int i = 0;
    int h = 0;

    public ventana7() {
        Dimension tamano = Toolkit.getDefaultToolkit().getScreenSize();
        initComponents();
        this.setSize((int) tamano.getWidth() / 5, (int) tamano.getHeight() / 5);
        new parpadeo();
    }

    private class parpadeo implements ActionListener {

        private Timer parpadeo = new Timer(10, this);

        public parpadeo() {
            parpadeo.start();
        }

        public void actionPerformed(ActionEvent e) {
            i++;
            h++;
            jLabel1.setForeground(Color.red);
            jLabel2.setForeground(Color.red);
            jLabel1.setText("Hola");
            jLabel2.setText("Adios");
            if (h == 25) {
                jLabel1.setVisible(false);
                jLabel2.setVisible(true);

            } else {
                if (h == 50) {
                    jLabel1.setVisible(true);
                    jLabel2.setVisible(false);
                    h = 0;
                }
            }

            if (i == 300) {
                Toolkit.getDefaultToolkit().beep();
                jLabel1.setForeground(Color.black);
                jLabel2.setForeground(Color.black);
                parpadeo.stop();
                //
                
            }

        }
    }

    private void initComponents() {
    	setTitle("Torres de Hanoi (Marlon Pineda)");
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
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

        jLabel2.setBackground(new java.awt.Color(51, 255, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("jLabel2");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 20, 130, 40);

        jLabel1.setBackground(new java.awt.Color(255, 204, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel1.setText("jLabel1");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 120, 40);

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
                new ventana7().setVisible(true);
            }
        });
    }
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem12;
}

