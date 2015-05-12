package torres;


import javax.swing.JOptionPane; 

public class ventana3 extends javax.swing.JFrame {

    static int[][] torre = new int[64][64];
    int i;
    int j;
    int escalones = 3;
    static int jj = 4;
    public int desde = 0;
    public int hasta = 0;
    int contador; 
    int torreDesde;
    int guardaIDesde;
    int torreHasta;
    int guardaIHasta;
    int jugadasPosibles;
    int jugadasRealizadas;
    int aciertos;
    int avisos;

    public ventana3() {

        initComponents();
        jLabel6.setText("");
        jLabel8.setText("");

        ultimaPosicionMatriz();
        llenarMatriz();
    }

    
    public void ultimaPosicionMatriz() {
        torre[escalones][1] = escalones;
        torre[escalones][2] = escalones;
        torre[escalones][3] = escalones;
        
        for (i = 1; i < escalones + 1; i++) {
            for (j = 1; j < jj; j++) {
                System.out.print("               " + torre[i][j]);
            }
            System.out.println();
        }
        System.out.println("prueba    ==========      ==========       =========");
        System.out.println("               1               2               3");
    }

    public void llenarMatriz() {
        System.out.println("------------------------------------------------------------");
        for (i = 1; i < escalones; i++) {
            for (j = 1; j < jj; j++) {
                torre[i][j] = 0;
                torre[i][1] = i;
            }
        }
        mostrarMatriz();
    }

    public void mostrarMatriz() {
        for (i = 1; i < escalones; i++) {
            for (j = 1; j < jj; j++) {
                System.out.print("               " + torre[i][j]);
            }
            System.out.println();
        }
        System.out.println("          ==========      ==========       =========");
        System.out.println("               1               2               3");
 

    }

    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Torres de Hanoi (Marlon Pineda)");
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); 
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 280, 220, 70);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 36)); 
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(280, 280, 230, 70);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 36)); 
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(540, 280, 210, 70);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 36));
        jButton4.setText("Mover");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(60, 380, 160, 150);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        jLabel1.setText("Jugadas posibles");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 380, 180, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        jLabel2.setText("Jugadas realizadas");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 410, 220, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        jLabel3.setText("Aciertos");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 440, 190, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("0");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(480, 380, 40, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("0");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(470, 420, 50, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("0");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(440, 444, 80, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); 
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(550, 10, 70, 50);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel18.setText("Avisos");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(240, 470, 160, 29);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        jLabel20.setText("Tiempo (seg.)");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(240, 500, 160, 29);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("0");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(400, 500, 120, 30);
        setJMenuBar(jMenuBar1);

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (desde == 0) {
            desde = 1;
            jLabel6.setText("" + desde);
        } else {
            if (hasta == 0) {

                hasta = 1;
                jLabel8.setText("" + hasta);
            }
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (desde == 0) {
            desde = 2;
            jLabel6.setText("" + desde);
        } else {
            if (hasta == 0) {

                hasta = 2;
                jLabel8.setText("" + hasta);
            }
        }


    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        if (desde == 0) {
            desde = 3;
            jLabel6.setText("" + desde);
        } else {
            if (hasta == 0) {

                hasta = 3;
                jLabel8.setText("" + hasta);
            }
        }
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        jugadasRealizadas = jugadasRealizadas + 1;
        jLabel5.setText("" + jugadasRealizadas);
        colocarEscalones();
        mostrarMatriz();
        desde = 0;
        jLabel6.setText("");
        hasta = 0;
        jLabel8.setText("");
   }

    public void colocarEscalones() {
        for (i = 1; i < escalones; i++) {
            if (torre[i][desde] == 0) {
            } else {
                contador = contador + 1;
                if (contador == 1) {
                    torreDesde = torre[i][desde];
                    guardaIDesde = i;
                    torre[i][desde] = 0;
                }
            }
        }
        contador = 0;

        for (i = 1; i < escalones; i++) {
            if (torre[i + 1][hasta] == 0) {
            } else {
                contador = contador + 1;
                if (contador == 1) {
                    guardaIHasta = i; 
                    torre[i][hasta] = torreDesde;
                }
            }
        }
        contador = 0;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ventana3().setVisible(true);
            }
        });
    }
 
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
}

