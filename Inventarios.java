import javax.swing.*; //Ventanas
import java.awt.event.*; //Eventos de Foco y Teclado; Botones; Menus; Combo
import java.awt.*;  //Fuente,Color,Imagenes
import java.net.URI;
import java.util.Objects;

public class Inventarios extends JFrame implements ActionListener{
    public JMenuBar barramenu;
    public JMenuItem administracionproductos,contactanos,salir;
    public JLabel etiqueta1,etiqueta2,etiqueta3,etiqueta4,etiqueta5,etiqueta6,etiqueta7,etiqueta8;
    public JLabel derechos1,derechos2;
    public JLabel mapaenviosletras1,mapaenviosletras2;
    public JPanel parteabajo,partederecha;
    public JButton ubicacionbot;

    public Inventarios() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("IconChafazon.png")).getImage());
        getContentPane().setBackground(new Color(135, 201, 214));

        barramenu = new JMenuBar();
        barramenu.setBackground(Color.BLACK);
        setJMenuBar(barramenu);
        setTitle("Menu Principal");

        administracionproductos = new JMenuItem("Administrar Productos      ");
        administracionproductos.setFont(new Font("Calibri Cuerpo", Font.BOLD, 20));
        administracionproductos.setBackground(Color.BLACK);
        administracionproductos.setForeground(Color.WHITE);
        barramenu.add(administracionproductos);



        contactanos = new JMenuItem("Contáctanos     ");
        contactanos.setFont(new Font("Calibri Cuerpo", Font.BOLD, 20));
        contactanos.setBackground(Color.BLACK);
        contactanos.setForeground(Color.WHITE);
        // Reporte de artículos y su existencia
        barramenu.add(contactanos);

        salir = new JMenuItem("Salir      ");
        salir.setFont(new Font("Calibri Cuerpo", Font.BOLD, 20));
        salir.setBackground(Color.BLACK);
        salir.setForeground(Color.WHITE);
        // Reporte de artículos y su existencia
        barramenu.add(salir);

        ImageIcon chafazon = new ImageIcon("Chafazon no fondo.png");
        etiqueta1 = new JLabel(chafazon);
        etiqueta1.setBounds(80, 50, 430, 150);
        Icon icono1 = new ImageIcon(chafazon.getImage().getScaledInstance(etiqueta1.getWidth(), etiqueta1.getHeight(), Image.SCALE_DEFAULT));
        etiqueta1.setIcon(icono1);
        add(etiqueta1);

        //Inicia partederecha
        ImageIcon promos = new ImageIcon("Promociones.jpg");
        etiqueta6 = new JLabel(promos);
        etiqueta6.setBounds(750, 300, 225, 260);
        Icon icono6 = new ImageIcon(promos.getImage().getScaledInstance(etiqueta6.getWidth(), etiqueta6.getHeight(), Image.SCALE_DEFAULT));
        etiqueta6.setIcon(icono6);
        add(etiqueta6);

        ImageIcon buenfin = new ImageIcon("buenfin.png");
        etiqueta7 = new JLabel(buenfin);
        etiqueta7.setBounds(10, 330, 730, 230);
        Icon icono7 = new ImageIcon(buenfin.getImage().getScaledInstance(etiqueta7.getWidth(), etiqueta7.getHeight(), Image.SCALE_DEFAULT));
        etiqueta7.setIcon(icono7);
        add(etiqueta7);

        ImageIcon mapaenvios = new ImageIcon("mapaenvios.jpg");
        etiqueta8 = new JLabel(mapaenvios);
        etiqueta8.setBounds(5, 65, 290, 210);
        Icon icono8 = new ImageIcon(mapaenvios.getImage().getScaledInstance(etiqueta8.getWidth(), etiqueta8.getHeight(), Image.SCALE_DEFAULT));
        etiqueta8.setIcon(icono8);


        mapaenviosletras1 = new JLabel(" Ofertas de Chafazon en México y");
        mapaenviosletras1.setBounds(5, 10, 350, 20);
        mapaenviosletras1.setFont(new Font("Arial", Font.BOLD, 15));
        mapaenviosletras1.setForeground(Color.WHITE);

        mapaenviosletras2 = new JLabel(" Estados Unidos");
        mapaenviosletras2.setBounds(5, 30, 300, 20);
        mapaenviosletras2.setFont(new Font("Arial", Font.BOLD, 15));
        mapaenviosletras2.setForeground(Color.WHITE);


        partederecha = new JPanel();
        partederecha.setLayout(null);
        partederecha.add(etiqueta8);
        partederecha.add(mapaenviosletras1);
        partederecha.add(mapaenviosletras2);
        partederecha.setBounds(675, 10, 300, 280);
        partederecha.setBackground(Color.black);
        this.getContentPane().add(partederecha);
        //Termina parterecha

        //Inicio barra abajo
        derechos1 = new JLabel("© 2020 Profesionales en Inventarios S.A. de C.V.");
        derechos1.setBounds(50,95,350,20);
        derechos1.setFont(new Font("Arial", Font.PLAIN,14));
        derechos1.setForeground(Color.WHITE);

        derechos2 = new JLabel("Avenida Las Nubes 145 , Col. Independencia, C.P. 44700, Guadalajara, Jal.");
        derechos2.setBounds(365,95,500,20);
        derechos2.setFont(new Font("Arial", Font.PLAIN,14));
        derechos2.setForeground(Color.WHITE);

        ImageIcon LDM = new ImageIcon("selloLDM.jpg");
        etiqueta2 = new JLabel(LDM);
        etiqueta2.setBounds(30,0,200,80);
        Icon icono2 = new ImageIcon(LDM.getImage().getScaledInstance(etiqueta2.getWidth(),etiqueta2.getHeight(),Image.SCALE_DEFAULT));
        etiqueta2.setIcon(icono2);


        ImageIcon Manhattan = new ImageIcon("selloManhattan.jpg");
        etiqueta3 = new JLabel(Manhattan);
        etiqueta3.setBounds(250,0,220,80);
        Icon icono3 = new ImageIcon(Manhattan.getImage().getScaledInstance(etiqueta3.getWidth(),etiqueta3.getHeight(),Image.SCALE_DEFAULT));
        etiqueta3.setIcon(icono3);


        ImageIcon Honeywell = new ImageIcon("selloHoneywell.png");
        etiqueta4 = new JLabel(Honeywell);
        etiqueta4.setBounds(480,20,200,60);
        Icon icono4 = new ImageIcon(Honeywell.getImage().getScaledInstance(etiqueta4.getWidth(),etiqueta4.getHeight(),Image.SCALE_DEFAULT));
        etiqueta4.setIcon(icono4);


        ImageIcon RSI = new ImageIcon("selloRSI.png");
        etiqueta5 = new JLabel(RSI);
        etiqueta5.setBounds(690,0,200,80);
        Icon icono5 = new ImageIcon(RSI.getImage().getScaledInstance(etiqueta5.getWidth(),etiqueta5.getHeight(),Image.SCALE_DEFAULT));
        etiqueta5.setIcon(icono5);

        ImageIcon ubisimbolo = new ImageIcon("ubisimbolo.png");
        ubicacionbot = new JButton();
        ubicacionbot.setBackground(Color.BLACK);
        ubicacionbot.setBounds(863,0,119,119);
        Icon icono9 = new ImageIcon(ubisimbolo.getImage().getScaledInstance(ubicacionbot.getWidth(),ubicacionbot.getHeight(),Image.SCALE_DEFAULT));
        ubicacionbot.setIcon(icono9);

        parteabajo = new JPanel();
        parteabajo.setLayout(null);
        parteabajo.setBounds(0,580,1000,300);
        parteabajo.add(ubicacionbot);
        parteabajo.add(etiqueta2);
        parteabajo.add(etiqueta3);
        parteabajo.add(etiqueta4);
        parteabajo.add(etiqueta5);
        parteabajo.add(derechos1);
        parteabajo.add(derechos2);
        parteabajo.setBackground(Color.BLACK);
        this.getContentPane().add(parteabajo);
        //Fin parte de abajo



        administracionproductos.addActionListener(this);
        salir.addActionListener(this);
        contactanos.addActionListener(this);
        ubicacionbot.addActionListener(this);
}

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == ubicacionbot){
            try {
                Desktop desktop = java.awt.Desktop.getDesktop();
                URI oURL = new URI("https://goo.gl/maps/z2hSDdf5KG2L4HnE7");
                        desktop.browse(oURL);
            } catch (Exception de) {
                de.printStackTrace();
            }
        }

        if (e.getSource() == administracionproductos) {
            RegistrarProducto RP = new RegistrarProducto();
            RP.setBounds(550,120,1000,780);
            RP.setVisible(true);
            RP.setResizable(false);
        }
      if (e.getSource() == contactanos) {
          Contactanos contac = new Contactanos();
          contac.setBounds(450,100,1000,780);
          contac.setVisible(true);
          contac.setResizable(false);
      }
        if (e.getSource() == salir) {
            System.exit(0);
        }


    }


    public static void main (String args[]) {
        Inventarios inv = new Inventarios();
        inv.setBounds(450,100,1000,780);
        inv.setVisible(true);
        inv.setResizable(false);


    }
}

