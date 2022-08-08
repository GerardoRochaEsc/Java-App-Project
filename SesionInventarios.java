import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image;
import javax.swing.JPanel;

public class SesionInventarios extends JFrame implements ActionListener,MouseListener{
    JPanel fondo;
    JLabel usuario, contra, etiqueta1,etiqueta2;
    JTextField textusuario;
    JButton iniciar;
    JPasswordField textcontra;


    public SesionInventarios() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("  Inicia Sesión");
        setIconImage(new ImageIcon(getClass().getResource("IconChafazon.png")).getImage());

        usuario = new JLabel("Usuario");
        usuario.setBounds(180, 210, 160, 30);
        usuario.setFont(new Font("Calibri Cuerpo", Font.BOLD, 24));
        add(usuario);

        textusuario = new JTextField();
        textusuario.setBounds(340, 210, 200, 33);
        textusuario.setFont(new Font("Calibri Cuerpo", Font.BOLD, 20));
        add(textusuario);

        contra = new JLabel("Contraseña");
        contra.setBounds(180, 250, 160, 30);
        contra.setFont(new Font("Calibri Cuerpo", Font.BOLD, 24));
        add(contra);

        textcontra = new JPasswordField();
        textcontra.setBounds(340, 250, 200, 33);
        textcontra.setFont(new Font("Calibri Cuerpo", Font.BOLD, 20));
        add(textcontra);

        iniciar = new JButton("Ingresar");
        iniciar.setBounds(310, 330, 150, 50);
        iniciar.setFont(new Font("Calibri Cuerpo", Font.BOLD, 20));
        iniciar.setBackground(new Color(253, 254, 254 ));
        add(iniciar);
        iniciar.addMouseListener(this);

        ImageIcon chafazon = new ImageIcon("Chafazon no fondo.png");
        etiqueta1 = new JLabel(chafazon);
        etiqueta1.setBounds(170, 20, 390, 150);
        Icon icono1 = new ImageIcon(chafazon.getImage().getScaledInstance(etiqueta1.getWidth(), etiqueta1.getHeight(), Image.SCALE_DEFAULT));
        etiqueta1.setIcon(icono1);
        add(etiqueta1);



        fondo = new JPanel();
        fondo.setLayout(null);
        fondo.setBackground(new Color(135, 207, 214));
        fondo.setBounds(0, 0, 800, 600);
        fondo.add(etiqueta1);
        fondo.add(iniciar);
        fondo.add(usuario);
        fondo.add(textusuario);
        fondo.add(contra);
        fondo.add(textcontra);
        this.getContentPane().add(fondo);

        iniciar.addActionListener(this);
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        char clave[] = textcontra.getPassword();

        String clavedef = new String(clave);

        if (textusuario.getText().equals("admin") && clavedef.equals("12345")) {

            this.dispose();

            Inventarios inv = new Inventarios();
            inv.setBounds(450, 100, 1000, 780);
            inv.setVisible(true);
            inv.setResizable(false);


        } else {
            JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
                            + "Por favor ingrese un usuario y/o contraseña correctos",
                    "Acceso denegado", JOptionPane.ERROR_MESSAGE);
        }
    }



    public static void main (String args[]) {
        SesionInventarios sinv = new SesionInventarios();
        sinv.setBounds(450,100,800,600);
        sinv.setVisible(true);
        sinv.setResizable(false);
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
iniciar.setBackground(new Color(174, 182, 191));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        iniciar.setBackground(new Color(253, 254, 254 ));
    }
}
