import javax.swing.*; //Ventanas
import java.awt.event.*; //Eventos de Foco y Teclado; Botones; Menus; Combo
import java.awt.*;  //Fuente,Color,Imagenes


public class RegistrarProducto extends JFrame implements ActionListener,ItemListener {
    public JMenuBar barramenu;
    public JMenuItem ingresarproducto, retirarproducto, reportedeexistencias, regresar;
    public JLabel etiqueta1, etiqueta2, etiqueta3, etiqueta4;
    public JLabel titulo;
    public JLabel codigodelproducto, nombre, descripcion, clasificacionproducto1, clasificacionproducto2;
    public JTextField escribirnombre, escribirdescripcion;
    public JButton guardar;
    public JComboBox<Integer> listacodigos;
    public JComboBox<String> opcclasifproducto;
    public JScrollPane barradescripcion;
    public static int scodproducto1,scodproducto2,scodproducto3,scodproducto4,scodproducto5,scodproducto6,scodproducto7,scodproducto8,scodproducto9,scodproducto10;
    public static String snombre1="",snombre2="",snombre3="",snombre4="",snombre5="",snombre6="",snombre7="",snombre8="",snombre9="",snombre10="";
    public static String sdescripcion1="",sdescripcion2="",sdescripcion3="",sdescripcion4="",sdescripcion5="",sdescripcion6="",sdescripcion7="",sdescripcion8="",sdescripcion9="",sdescripcion10="";
    public static String sclasificacion1="",sclasificacion2="",sclasificacion3="",sclasificacion4="",sclasificacion5="",sclasificacion6="",sclasificacion7="",sclasificacion8="",sclasificacion9="",sclasificacion10="";
    public static int sexistencias1=0,sexistencias2=0,sexistencias3=0,sexistencias4=0,sexistencias5=0,sexistencias6=0,sexistencias7=0,sexistencias8=0,sexistencias9=0,sexistencias10=0;
    public static int contador;
    public int eleccion=0;



    public RegistrarProducto() {
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("IconChafazon.png")).getImage());
        getContentPane().setBackground(new Color(135, 201, 214));
        setTitle("Administración de Productos");

        barramenu = new JMenuBar();
        barramenu.setBackground(Color.BLACK);
        setJMenuBar(barramenu);


        ingresarproducto = new JMenuItem("Ingresar Producto      ");
        ingresarproducto.setFont(new Font("Calibri Cuerpo", Font.BOLD, 20));
        ingresarproducto.setBackground(Color.BLACK);
        ingresarproducto.setForeground(Color.WHITE);
        barramenu.add(ingresarproducto);

        retirarproducto = new JMenuItem("Retirar Producto      ");
        retirarproducto.setFont(new Font("Calibri Cuerpo", Font.BOLD, 20));
        retirarproducto.setBackground(Color.BLACK);
        retirarproducto.setForeground(Color.WHITE);
        barramenu.add(retirarproducto);

        reportedeexistencias = new JMenuItem("Reporte de Existencias      ");
        reportedeexistencias.setFont(new Font("Calibri Cuerpo", Font.BOLD, 20));
        reportedeexistencias.setBackground(Color.BLACK);
        reportedeexistencias.setForeground(Color.WHITE);
        barramenu.add(reportedeexistencias);

        regresar = new JMenuItem("Regresar      ");
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

        titulo = new JLabel("Registro de Productos");
        titulo.setBounds(50, 0, 670, 140);
        titulo.setFont(new Font("Calibri Cuerpo", Font.BOLD, 40));
        titulo.setForeground(Color.BLACK);
        add(titulo);


        //Parámetros a llenar
        codigodelproducto = new JLabel("Código del producto");
        codigodelproducto.setBounds(50, 130, 250, 30);
        codigodelproducto.setFont(new Font("Calibri Cuerpo", Font.BOLD, 24));
        add(codigodelproducto);


        listacodigos = new JComboBox<>();
        listacodigos.setBounds(330, 130, 250, 30);
        add(listacodigos);
        listacodigos.addItem(1);
        listacodigos.addItem(2);
        listacodigos.addItem(3);
        listacodigos.addItem(4);
        listacodigos.addItem(5);
        listacodigos.addItem(6);
        listacodigos.addItem(7);
        listacodigos.addItem(8);
        listacodigos.addItem(9);
        listacodigos.addItem(10);
        listacodigos.setEditable(true);
        listacodigos.setSelectedItem("");
        listacodigos.setFont(new Font("", Font.PLAIN, 20));
        listacodigos.setEditable(false);


        nombre = new JLabel("Nombre");
        nombre.setBounds(50, 180, 250, 30);
        nombre.setFont(new Font("Calibri Cuerpo", Font.BOLD, 24));
        add(nombre);

        escribirnombre = new JTextField();
        escribirnombre.setBounds(330, 180, 500, 30);
        escribirnombre.setFont(new Font("Calibre Cuerpo", Font.PLAIN, 18));
        add(escribirnombre);

        descripcion = new JLabel("Descripción");
        descripcion.setBounds(50, 230, 250, 24);
        descripcion.setFont(new Font("Calibri Cuerpo", Font.BOLD, 24));
        add(descripcion);

        escribirdescripcion = new JTextField();
        barradescripcion = new JScrollPane(escribirdescripcion);
        barradescripcion.getVerticalScrollBar().setUnitIncrement(10);
        escribirdescripcion.setBounds(330, 230, 500, 30);
        escribirdescripcion.setFont(new Font("", Font.PLAIN, 18));
        add(escribirdescripcion);
        add(barradescripcion);

        clasificacionproducto1 = new JLabel("Clasificación del");
        clasificacionproducto1.setBounds(50, 280, 250, 30);
        clasificacionproducto1.setFont(new Font("Calibri Cuerpo", Font.BOLD, 24));
        add(clasificacionproducto1);
        clasificacionproducto2 = new JLabel("producto");
        clasificacionproducto2.setBounds(50, 310, 250, 30);
        clasificacionproducto2.setFont(new Font("Calibri Cuerpo", Font.BOLD, 24));
        add(clasificacionproducto2);

        opcclasifproducto = new JComboBox<>();
        opcclasifproducto.setBounds(330, 280, 250, 30);
        add(opcclasifproducto);
        opcclasifproducto.addItem("Electrónicos");
        opcclasifproducto.addItem("Accesorios");
        opcclasifproducto.addItem("Artículos deportivos");
        opcclasifproducto.addItem("Ropa");
        opcclasifproducto.addItem("Electrodomésticos");
        opcclasifproducto.addItem("Cosméticos");
        opcclasifproducto.addItem("Mobiliaria");
        opcclasifproducto.addItem("Otros");
        opcclasifproducto.setEditable(true);
        opcclasifproducto.setSelectedItem("");
        opcclasifproducto.setFont(new Font("", Font.PLAIN, 20));
        opcclasifproducto.setEditable(false);

        guardar = new JButton("Guardar");
        guardar.setBounds(750, 380, 150, 50);
        guardar.setBackground( Color.BLACK);
        guardar.setForeground(Color.WHITE);
        guardar.setFont(new Font("Calibri Cuerpo", Font.PLAIN, 20));
        add(guardar);


        ImageIcon cajas = new ImageIcon("cajas.jpg");
        etiqueta2 = new JLabel(cajas);
        etiqueta2.setBounds(50, 470, 280, 200);
        Icon icono2 = new ImageIcon(cajas.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_DEFAULT));
        etiqueta2.setIcon(icono2);
        add(etiqueta2);

        ImageIcon cajas2 = new ImageIcon("cajas2.jpg");
        etiqueta3 = new JLabel(cajas2);
        etiqueta3.setBounds(350, 470, 280, 200);
        Icon icono3 = new ImageIcon(cajas2.getImage().getScaledInstance(etiqueta3.getWidth(), etiqueta3.getHeight(), Image.SCALE_DEFAULT));
        etiqueta3.setIcon(icono3);
        add(etiqueta3);

        ImageIcon cajas3 = new ImageIcon("cajas3.jpg");
        etiqueta4 = new JLabel(cajas3);
        etiqueta4.setBounds(650, 470, 280, 200);
        Icon icono4 = new ImageIcon(cajas3.getImage().getScaledInstance(etiqueta4.getWidth(), etiqueta4.getHeight(), Image.SCALE_DEFAULT));
        etiqueta4.setIcon(icono4);
        add(etiqueta4);

        guardar.addActionListener(this);
        regresar.addActionListener(this);
        reportedeexistencias.addActionListener(this);
        ingresarproducto.addActionListener(this);
        retirarproducto.addActionListener(this);
    }




    @Override
    public void itemStateChanged(ItemEvent e) {

    }





    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == guardar) {
            eleccion= (int) listacodigos.getSelectedItem();

            if(eleccion==1) {
                scodproducto1 = (int) listacodigos.getSelectedItem();
                snombre1 = escribirnombre.getText();
                sdescripcion1 = escribirdescripcion.getText();
                sclasificacion1 = opcclasifproducto.getSelectedItem().toString();
                sexistencias1 = 0;
                String f1="Código: "+scodproducto1+"\nNombre: "+snombre1+"\nDescripción: "+sdescripcion1+"\nClasificación: "+sclasificacion1+"\nNúm.de existencias: "+sexistencias1;
                JOptionPane.showMessageDialog(null,f1);
            }
            if(eleccion==2) {
                scodproducto2 = (int) listacodigos.getSelectedItem();
                snombre2 = escribirnombre.getText();
                sdescripcion2 = escribirdescripcion.getText();
                sclasificacion2 = opcclasifproducto.getSelectedItem().toString();
                sexistencias2 = 0;
                String f2="Código: "+scodproducto2+"\nNombre: "+snombre2+"\nDescripción: "+sdescripcion2+"\nClasificación: "+sclasificacion2+"\nNúm.de existencias: "+sexistencias2;
                JOptionPane.showMessageDialog(null,f2);
            }
            if(eleccion==3) {
                scodproducto3 = (int) listacodigos.getSelectedItem();
                snombre3 = escribirnombre.getText();
                sdescripcion3 = escribirdescripcion.getText();
                sclasificacion3 = opcclasifproducto.getSelectedItem().toString();
                sexistencias3 = 0;
                String f3="Código: "+scodproducto3+"\nNombre: "+snombre3+"\nDescripción: "+sdescripcion3+"\nClasificación: "+sclasificacion3+"\nNúm.de existencias: "+sexistencias3;
                JOptionPane.showMessageDialog(null,f3);
            }
            if(eleccion==4) {
                scodproducto4 = (int) listacodigos.getSelectedItem();
                snombre4 = escribirnombre.getText();
                sdescripcion4 = escribirdescripcion.getText();
                sclasificacion4 = opcclasifproducto.getSelectedItem().toString();
                sexistencias4 = 0;
                String f4="Código: "+scodproducto4+"\nNombre: "+snombre4+"\nDescripción: "+sdescripcion4+"\nClasificación: "+sclasificacion4+"\nNúm.de existencias: "+sexistencias4;
                JOptionPane.showMessageDialog(null,f4);
            }
            if(eleccion==5) {
                scodproducto5 = (int) listacodigos.getSelectedItem();
                snombre5 = escribirnombre.getText();
                sdescripcion5 = escribirdescripcion.getText();
                sclasificacion5 = opcclasifproducto.getSelectedItem().toString();
                sexistencias5 = 0;
                String f5="Código: "+scodproducto5+"\nNombre: "+snombre5+"\nDescripción: "+sdescripcion5+"\nClasificación: "+sclasificacion5+"\nNúm.de existencias: "+sexistencias5;
                JOptionPane.showMessageDialog(null,f5);
            }
            if(eleccion==6) {
                scodproducto6 = (int) listacodigos.getSelectedItem();
                snombre6 = escribirnombre.getText();
                sdescripcion6 = escribirdescripcion.getText();
                sclasificacion6 = opcclasifproducto.getSelectedItem().toString();
                sexistencias6 = 0;
                String f6="Código: "+scodproducto6+"\nNombre: "+snombre6+"\nDescripción: "+sdescripcion6+"\nClasificación: "+sclasificacion6+"\nNúm.de existencias: "+sexistencias6;
                JOptionPane.showMessageDialog(null,f6);
            }
            if(eleccion==7) {
                scodproducto7 = (int) listacodigos.getSelectedItem();
                snombre7 = escribirnombre.getText();
                sdescripcion7 = escribirdescripcion.getText();
                sclasificacion7 = opcclasifproducto.getSelectedItem().toString();
                sexistencias7 = 0;
                String f7="Código: "+scodproducto7+"\nNombre: "+snombre7+"\nDescripción: "+sdescripcion7+"\nClasificación: "+sclasificacion7+"\nNúm.de existencias: "+sexistencias7;
                JOptionPane.showMessageDialog(null,f7);
            }
            if(eleccion==8) {
                scodproducto8 = (int) listacodigos.getSelectedItem();
                snombre8 = escribirnombre.getText();
                sdescripcion8 = escribirdescripcion.getText();
                sclasificacion8 = opcclasifproducto.getSelectedItem().toString();
                sexistencias8 = 0;
                String f8="Código: "+scodproducto8+"\nNombre: "+snombre8+"\nDescripción: "+sdescripcion8+"\nClasificación: "+sclasificacion8+"\nNúm.de existencias: "+sexistencias8;
                JOptionPane.showMessageDialog(null,f8);
            }
            if(eleccion==9) {
                scodproducto9 = (int) listacodigos.getSelectedItem();
                snombre9 = escribirnombre.getText();
                sdescripcion9 = escribirdescripcion.getText();
                sclasificacion9 = opcclasifproducto.getSelectedItem().toString();
                sexistencias9 = 0;
                String f9="Código: "+scodproducto9+"\nNombre: "+snombre9+"\nDescripción: "+sdescripcion9+"\nClasificación: "+sclasificacion9+"\nNúm.de existencias: "+sexistencias9;
                JOptionPane.showMessageDialog(null,f9);
            }
            if(eleccion==10) {
                scodproducto10 = (int) listacodigos.getSelectedItem();
                snombre10 = escribirnombre.getText();
                sdescripcion10 = escribirdescripcion.getText();
                sclasificacion10 = opcclasifproducto.getSelectedItem().toString();
                sexistencias10 = 0;
                String f10="Código: "+scodproducto10+"\nNombre: "+snombre10+"\nDescripción: "+sdescripcion10+"\nClasificación: "+sclasificacion10+"\nNúm.de existencias: "+sexistencias10;
                JOptionPane.showMessageDialog(null,f10);
            }
        }


        if (e.getSource() == regresar) {
            dispose();
        }

        if (e.getSource() == ingresarproducto) {
            IngresarProducto IP = new IngresarProducto();
            IP.setBounds(550, 120, 1000, 780);
            IP.setVisible(true);
            IP.setResizable(true);
        }

        if (e.getSource() == retirarproducto) {
            RetirarProducto RP = new RetirarProducto();
            RP.setBounds(550, 120, 1000, 780);
            RP.setVisible(true);
            RP.setResizable(false);
        }

        if (e.getSource() == reportedeexistencias) {
            ReporteDeExistencias RDE = new ReporteDeExistencias();
            RDE.setBounds(550, 120, 1000, 780);
            RDE.setVisible(true);
            RDE.setResizable(false);
        }
    }


    public static void main(String args[]) {
        RegistrarProducto RP = new RegistrarProducto();
        RP.setBounds(550, 120, 1000, 780);
        RP.setVisible(true);
        RP.setResizable(false);

    }

}
