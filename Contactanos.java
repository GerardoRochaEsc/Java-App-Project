import javax.swing.*; //Ventanas
import java.awt.event.*; //Eventos de Foco y Teclado; Botones; Menus; Combo
import java.awt.*;  //Fuente,Color,Imagenes

public class Contactanos extends JFrame implements ActionListener{
    public JMenuBar barramenu;
    public JMenuItem regresar;
    public JLabel etiqueta1,etiqueta2,etiqueta3,etiqueta4,etiqueta5,etiqueta6;
    public JLabel derechos1,derechos2,titulo;
    public JLabel pregunta1,pregunta2,pregunta3;
    public JTextField pregunta;
    public JPanel parteabajo;
    public JButton enviar;

    public Contactanos() {
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("IconChafazon.png")).getImage());
        getContentPane().setBackground(new Color(135, 201, 214));

        barramenu = new JMenuBar();
        barramenu.setBackground(Color.BLACK);
        setJMenuBar(barramenu);
        setTitle("Atención a clientes");

       regresar = new JMenuItem("Regresar     ");
       regresar.setFont(new Font("Calibri Cuerpo", Font.BOLD, 20));
       regresar.setBackground(Color.BLACK);
       regresar.setForeground(Color.WHITE);
        barramenu.add(regresar);



        ImageIcon chafazon = new ImageIcon("Chafazon no fondo.png");
        etiqueta1 = new JLabel(chafazon);
        etiqueta1.setBounds(680, 10, 270, 100);
        Icon icono1 = new ImageIcon(chafazon.getImage().getScaledInstance(etiqueta1.getWidth(), etiqueta1.getHeight(), Image.SCALE_DEFAULT));
        etiqueta1.setIcon(icono1);
        add(etiqueta1);


        enviar = new JButton("Enviar");
        enviar.setBounds(30, 480, 150, 50);
        enviar.setBackground( Color.BLACK);
        enviar.setForeground(Color.WHITE);
        enviar.setFont(new Font("Calibri Cuerpo", Font.BOLD, 20));
        add(enviar);

        titulo = new JLabel("Contáctanos");
        titulo.setBounds(50, 0, 670, 140);
        titulo.setFont(new Font("Calibri Cuerpo", Font.BOLD, 50));
        titulo.setForeground(Color.BLACK);
        add(titulo);

        pregunta1 = new JLabel();
        String texto = "<html>Preguntas frecuentes sobre pedidos y<P>" +
                "<html>entregas y el virus COVID-19<P>";
        pregunta1.setText(texto);
        pregunta1.setBounds(30,110,680,120);
        pregunta1.setFont(new Font("Calibri Cuerpo", Font.BOLD, 28));
        add(pregunta1);

        pregunta2 = new JLabel();
        String texto2 = "<html>Las operaciones de Chafazon continúan, pero los plazos de entrega pueden ser más<P>" +
                "<html>largos de lo habitual.<P>";
        pregunta2.setText(texto2);
        pregunta2.setBounds(30,180,680,120);
        pregunta2.setFont(new Font("Calibri Cuerpo", Font.PLAIN, 18));
        add(pregunta2);

        pregunta3 = new JLabel();
        String texto3 = "<html>¿No puedes encontrar lo que necesitas?\n<P>" +
                "<html>Haznos una pregunta<P>";
        pregunta3.setText(texto3);
        pregunta3.setBounds(30,310,680,80);
        pregunta3.setFont(new Font("Calibri Cuerpo", Font.BOLD, 28));
        add(pregunta3);

        pregunta = new JTextField();
        pregunta.setBounds(30,400,680,40);
        pregunta.setFont(new Font("Calibre Cuerpo", Font.PLAIN, 18));
        add(pregunta);


        ImageIcon comentarios = new ImageIcon("comentarios.png");
        etiqueta6 = new JLabel(comentarios);
        etiqueta6.setBounds(770, 350, 150, 150);
        Icon icono6 = new ImageIcon(comentarios.getImage().getScaledInstance(etiqueta6.getWidth(), etiqueta6.getHeight(), Image.SCALE_DEFAULT));
        etiqueta6.setIcon(icono6);
        add(etiqueta6);

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


        parteabajo = new JPanel();
        parteabajo.setLayout(null);
        parteabajo.setBounds(0,580,1000,300);
        parteabajo.add(etiqueta2);
        parteabajo.add(etiqueta3);
        parteabajo.add(etiqueta4);
        parteabajo.add(etiqueta5);
        parteabajo.add(derechos1);
        parteabajo.add(derechos2);
        parteabajo.setBackground(Color.BLACK);
        this.getContentPane().add(parteabajo);


        regresar.addActionListener(this);
        enviar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == regresar) {
           dispose();
        }

        if (e.getSource() == enviar) {

            pregunta.setText(null);
            JOptionPane.showMessageDialog(null, "Pregunta recibida:\n"
                            + "En un momento uno de nuestros asesores se comunicará con usted",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);

        }
    }


    public static void main (String args[]) {
        Contactanos contac = new Contactanos();
        contac.setBounds(450,100,1000,780);
        contac.setVisible(true);
        contac.setResizable(false);
    }
}

