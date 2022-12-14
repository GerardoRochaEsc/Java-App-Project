import javax.swing.*; //Ventanas
import java.awt.event.*; //Eventos de Foco y Teclado; Botones; Menus; Combo
import java.awt.*;  //Fuente,Color,Imagenes

public class ReporteDeExistencias extends JFrame implements ActionListener{
    public JMenuBar barramenu;
    public JMenuItem regresar;
    public JLabel etiqueta1,etiqueta2;
    public JLabel titulo;
    public JTextArea lista;
    public JButton mostrar;
    public JScrollPane barralista;
    public int codigo1,codigo2,codigo3,codigo4,codigo5,codigo6,codigo7,codigo8,codigo9,codigo10
            , existencia1,existencia2,existencia3,existencia4,existencia5,existencia6,existencia7,existencia8,existencia9,existencia10;
    public String nombre1="",nombre2="",nombre3="",nombre4="",nombre5="",nombre6="",nombre7="",nombre8="",nombre9="",nombre10="";
    public String descripcion1="",descripcion2="",descripcion3="",descripcion4="",descripcion5="",descripcion6="",descripcion7="",descripcion8="",descripcion9="",descripcion10="";
    public String clasificacion1="",clasificacion2="",clasificacion3="",clasificacion4="",clasificacion5="",clasificacion6="",clasificacion7="",clasificacion8="",clasificacion9="",clasificacion10="";
    public String frase1="",frase2="",frase3="",frase4="",frase5="",frase6="",frase7="",frase8="",frase9="",frase10="";


    public ReporteDeExistencias(){
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("IconChafazon.png")).getImage());
        getContentPane().setBackground(new Color(135, 201, 214));
        setTitle("Reporte de existencia de productos");

        barramenu = new JMenuBar();
        barramenu.setBackground(Color.BLACK);
        setJMenuBar(barramenu);



        ImageIcon chafazon = new ImageIcon("Chafazon no fondo.png");
        etiqueta1 = new JLabel(chafazon);
        etiqueta1.setBounds(680, 10, 270, 100);
        Icon icono1 = new ImageIcon(chafazon.getImage().getScaledInstance(etiqueta1.getWidth(), etiqueta1.getHeight(), Image.SCALE_DEFAULT));
        etiqueta1.setIcon(icono1);
        add(etiqueta1);


        titulo = new JLabel("Reporte de Existencias");
        titulo.setBounds(50, 0, 670, 140);
        titulo.setFont(new Font("Calibri Cuerpo", Font.BOLD, 40));
        titulo.setForeground(Color.BLACK);
        add(titulo);

        lista = new JTextArea();
        barralista = new JScrollPane(lista);
        barralista.getVerticalScrollBar().setUnitIncrement(8);
        barralista.setBounds(50, 120, 650, 540);
        lista.setFont(new Font("Calibri Cuerpo", Font.BOLD, 18));
        lista.setForeground(Color.BLACK);
        add(barralista);
        lista.setEditable(false);

        regresar = new JMenuItem("Regresar     ");
        regresar.setFont(new Font("Calibri Cuerpo", Font.BOLD, 20));
        regresar.setBackground(Color.BLACK);
        regresar.setForeground(Color.WHITE);
        barramenu.add(regresar);

        mostrar = new JButton("Mostrar");
        mostrar.setBounds(750, 610, 150, 50);
        mostrar.setBackground( Color.BLACK);
        mostrar.setForeground(Color.WHITE);
        mostrar.setFont(new Font("Calibri Cuerpo", Font.PLAIN, 20));
        add(mostrar);



        mostrar.addActionListener(this);
        regresar.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mostrar) {

        codigo1 = RegistrarProducto.scodproducto1;
        nombre1 = RegistrarProducto.snombre1;
        descripcion1 = RegistrarProducto.sdescripcion1;
        clasificacion1 = RegistrarProducto.sclasificacion1;
        existencia1 = RegistrarProducto.sexistencias1;
        frase1="C??digo: "+codigo1+"\nNombre: "+nombre1+"\nDescripci??n: "+descripcion1+"\nClasificaci??n: "+clasificacion1+"\nN??m.de existencias: "+existencia1;


       codigo2 = RegistrarProducto.scodproducto2;
       nombre2 = RegistrarProducto.snombre2;
       descripcion2 = RegistrarProducto.sdescripcion2;
       clasificacion2 = RegistrarProducto.sclasificacion2;
       existencia2 = RegistrarProducto.sexistencias2;
       frase2="\n\nC??digo: "+codigo2+"\nNombre: "+nombre2+"\nDescripci??n: "+descripcion2+"\nClasificaci??n: "+clasificacion2+"\nN??m.de existencias: "+existencia2;


       codigo3 = RegistrarProducto.scodproducto3;
       nombre3 = RegistrarProducto.snombre3;
       descripcion3 = RegistrarProducto.sdescripcion3;
       clasificacion3 = RegistrarProducto.sclasificacion3;
       existencia3 = RegistrarProducto.sexistencias3;
       frase3="\n\nC??digo: "+codigo3+"\nNombre: "+nombre3+"\nDescripci??n: "+descripcion3+"\nClasificaci??n: "+clasificacion3+"\nN??m.de existencias: "+existencia3;


       codigo4 = RegistrarProducto.scodproducto4;
       nombre4 = RegistrarProducto.snombre4;
       descripcion4 = RegistrarProducto.sdescripcion4;
       clasificacion4 = RegistrarProducto.sclasificacion4;
       existencia4 = RegistrarProducto.sexistencias4;
       frase4="\n\nC??digo: "+codigo4+"\nNombre: "+nombre4+"\nDescripci??n: "+descripcion4+"\nClasificaci??n: "+clasificacion4+"\nN??m.de existencias: "+existencia4;


       codigo5 = RegistrarProducto.scodproducto5;
       nombre5 = RegistrarProducto.snombre5;
       descripcion5 = RegistrarProducto.sdescripcion5;
       clasificacion5 = RegistrarProducto.sclasificacion5;
       existencia5 = RegistrarProducto.sexistencias5;
       frase5="\n\nC??digo: "+codigo5+"\nNombre: "+nombre5+"\nDescripci??n: "+descripcion5+"\nClasificaci??n: "+clasificacion5+"\nN??m.de existencias: "+existencia5;

       codigo6 = RegistrarProducto.scodproducto6;
       nombre6 = RegistrarProducto.snombre6;
       descripcion6 = RegistrarProducto.sdescripcion6;
       clasificacion6 = RegistrarProducto.sclasificacion6;
       existencia6 = RegistrarProducto.sexistencias6;
       frase6="\n\nC??digo: "+codigo6+"\nNombre: "+nombre6+"\nDescripci??n: "+descripcion6+"\nClasificaci??n: "+clasificacion6+"\nN??m.de existencias: "+existencia6;


       codigo7 = RegistrarProducto.scodproducto7;
       nombre7= RegistrarProducto.snombre7;
       descripcion7 = RegistrarProducto.sdescripcion7;
       clasificacion7 = RegistrarProducto.sclasificacion7;
       existencia7 = RegistrarProducto.sexistencias7;
       frase7="\n\nC??digo: "+codigo7+"\nNombre: "+nombre7+"\nDescripci??n: "+descripcion7+"\nClasificaci??n: "+clasificacion7+"\nN??m.de existencias: "+existencia7;


       codigo8 = RegistrarProducto.scodproducto8;
       nombre8 = RegistrarProducto.snombre8;
       descripcion8 = RegistrarProducto.sdescripcion8;
       clasificacion8 = RegistrarProducto.sclasificacion8;
       existencia8 = RegistrarProducto.sexistencias8;
       frase8="\n\nC??digo: "+codigo8+"\nNombre: "+nombre8+"\nDescripci??n: "+descripcion8+"\nClasificaci??n: "+clasificacion8+"\nN??m.de existencias: "+existencia8;


       codigo9 = RegistrarProducto.scodproducto9;
       nombre9 = RegistrarProducto.snombre9;
       descripcion9 = RegistrarProducto.sdescripcion9;
       clasificacion9 = RegistrarProducto.sclasificacion9;
       existencia9 = RegistrarProducto.sexistencias9;
       frase9="\n\n??digo: "+codigo9+"\nNombre: "+nombre9+"\nDescripci??n: "+descripcion9+"\nClasificaci??n: "+codigo9+"\nN??m.de existencias: "+existencia9;



       codigo10 = RegistrarProducto.scodproducto10;
       nombre10 = RegistrarProducto.snombre10;
       descripcion10 = RegistrarProducto.sdescripcion10;
       clasificacion10 = RegistrarProducto.sclasificacion10;
       existencia10 = RegistrarProducto.sexistencias10;
       frase10="\n\nC??digo: "+codigo10+"\nNombre: "+nombre10+"\nDescripci??n: "+descripcion10+"\nClasificaci??n: "+clasificacion10+"\nN??m.de existencias: "+existencia10;
       lista.setText(frase1+frase2+frase3+frase4+frase5+frase6+frase7+frase8+frase9+frase10);
        }

        if (e.getSource() == regresar) {
            dispose();
        }

    }

    public static void main (String args[]) {
        ReporteDeExistencias RDE = new ReporteDeExistencias();
        RDE.setBounds(550,120,1000,780);
        RDE.setVisible(true);
        RDE.setResizable(false);

    }


}
