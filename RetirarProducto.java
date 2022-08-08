import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image;

public class RetirarProducto extends JFrame implements ActionListener, FocusListener{
    public JMenuBar barramenu;
    public JMenuItem regresar;
    public JLabel etiqueta1,etiqueta2;
    public JLabel codigopdelproducto,cantidad,fechaingreso,guion1,guion2;
    public JTextField escribcantidad;
    public JComboBox<Integer> listacodigos;
    public JComboBox<String> day,month,year;
    public JButton actualizar;
    public JLabel titulo;
    public int suma1,suma2,suma3,suma4,suma5,suma6,suma7,suma8,suma9,suma10,
            suma11,suma12,suma13,suma14,suma15,suma16,suma17,suma18,suma19,suma20;
    public int res1,res2,res3,res4,res5,res6,res7,res8,res9,res10;
    public String fecha1,fecha2,fecha3;
    public int eleccion;


    public RetirarProducto(){
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("IconChafazon.png")).getImage());
        getContentPane().setBackground(new Color(135, 201, 214));
        setTitle("Retira un producto");

        barramenu = new JMenuBar();
        barramenu.setBackground(Color.BLACK);
        setJMenuBar(barramenu);



        regresar = new JMenuItem("Regresar    ");
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



        titulo = new JLabel("Retira un Producto");
        titulo.setBounds(50, 0, 670, 140);
        titulo.setFont(new Font("Calibri Cuerpo", Font.BOLD, 40));
        titulo.setForeground(Color.BLACK);
        add(titulo);

        codigopdelproducto = new JLabel("Código del Producto");
        codigopdelproducto.setBounds(50, 180, 250, 30);
        codigopdelproducto.setFont(new Font("Calibri Cuerpo", Font.BOLD, 22));
        add(codigopdelproducto);


        cantidad = new JLabel("Cantidad (en unidades)");
        cantidad.setBounds(50, 230, 250, 30);
        cantidad.setFont(new Font("Calibri Cuerpo", Font.BOLD, 22));
        add(cantidad);

        escribcantidad = new JTextField();
        escribcantidad.setBounds(330, 230, 250, 30);
        escribcantidad.setFont(new Font("Calibre Cuerpo", Font.PLAIN, 22));
        add(escribcantidad);
        escribcantidad.addFocusListener(this);

        listacodigos = new JComboBox<>();
        listacodigos.setBounds(330, 180, 250, 30);
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
        listacodigos.setFont(new Font("", Font.PLAIN, 20));
        listacodigos.setEditable(false);

        fechaingreso = new JLabel("Fecha de retiro");
        fechaingreso.setBounds(50, 280, 250, 30);
        fechaingreso.setFont(new Font("Calibri Cuerpo", Font.BOLD, 22));
        add(fechaingreso);

        day = new JComboBox<>();
        day.setBounds(330, 280, 80, 30);
        day.setFont(new Font("Calibre Cuerpo", Font.PLAIN, 20));
        add(day);
        day.addItem("01");
        day.addItem("02");
        day.addItem("03");
        day.addItem("04");
        day.addItem("05");
        day.addItem("06");
        day.addItem("07");
        day.addItem("08");
        day.addItem("09");
        day.addItem("10");
        day.addItem("11");
        day.addItem("12");
        day.addItem("13");
        day.addItem("14");
        day.addItem("15");
        day.addItem("16");
        day.addItem("17");
        day.addItem("18");
        day.addItem("19");
        day.addItem("20");
        day.addItem("21");
        day.addItem("22");
        day.addItem("23");
        day.addItem("24");
        day.addItem("25");
        day.addItem("26");
        day.addItem("27");
        day.addItem("28");
        day.addItem("29");
        day.addItem("30");
        day.addItem("31");
        day.setEditable(true);
        day.setSelectedItem("dd");
        day.setEditable(false);
        day.addFocusListener(this);

        guion1 = new JLabel("  -  ");
        guion1.setBounds(410, 280, 250, 30);
        guion1.setFont(new Font("Calibri Cuerpo", Font.BOLD, 24));
        add(guion1);

        guion2 = new JLabel("  -  ");
        guion2.setBounds(530, 280, 250, 30);
        guion2.setFont(new Font("Calibri Cuerpo", Font.BOLD, 24));
        add(guion2);


        month = new JComboBox<>();
        month.setBounds(450, 280, 80, 30);
        month.setFont(new Font("Calibre Cuerpo", Font.PLAIN, 20));
        add(month);
        month.addItem("01");
        month.addItem("02");
        month.addItem("03");
        month.addItem("04");
        month.addItem("05");
        month.addItem("06");
        month.addItem("07");
        month.addItem("08");
        month.addItem("09");
        month.addItem("10");
        month.addItem("11");
        month.addItem("12");
        month.setEditable(true);
        month.setSelectedItem("mm");
        month.setEditable(false);
        month.addFocusListener(this);

        year = new JComboBox<>();
        year.setBounds(570, 280, 80, 30);
        year.setFont(new Font("Calibre Cuerpo", Font.PLAIN, 20));
        add(year);
        year.addItem("2020");
        year.addItem("2021");
        year.addItem("2022");
        year.addItem("2023");
        year.addItem("2024");
        year.addItem("2025");
        year.addItem("2026");
        year.addItem("2027");
        year.addItem("2028");
        year.addItem("2029");
        year.addItem("2030");
        year.addItem("2031");
        year.addItem("2032");
        year.addItem("2033");
        year.addItem("2034");
        year.addItem("2035");
        year.addItem("2036");
        year.addItem("2037");
        year.addItem("2038");
        year.addItem("2039");
        year.addItem("2040");
        year.setEditable(true);
        year.setSelectedItem("yyyy");
        year.setEditable(false);
        year.addFocusListener(this);

        ImageIcon cajasacar = new ImageIcon("cajasacar.png");
        etiqueta2 = new JLabel(cajasacar);
        etiqueta2.setBounds(650, 400, 280, 280);
        Icon icono2 = new ImageIcon(cajasacar.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_DEFAULT));
        etiqueta2.setIcon(icono2);
        add(etiqueta2);

        actualizar = new JButton("Retirar");
        actualizar.setBounds(80, 580, 200, 70);
        actualizar.setBackground( Color.BLACK);
        actualizar.setForeground(Color.WHITE);
        actualizar.setFont(new Font("Calibri Cuerpo", Font.PLAIN, 20));
        add(actualizar);

        actualizar.addActionListener(this);
        regresar.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == actualizar) {
            eleccion = (int) listacodigos.getSelectedItem();

            if (eleccion == 1) {
                suma1 = RegistrarProducto.sexistencias1;
                suma2 = Integer.parseInt(escribcantidad.getText());
                if (suma1 != 0) {
                    res1 = suma1 - suma2;
                    fecha1 = (String) day.getSelectedItem();
                    fecha2 = (String) month.getSelectedItem();
                    fecha3 = (String) year.getSelectedItem();
                    RegistrarProducto.sexistencias1 = res1;
                    JOptionPane.showMessageDialog(null, "Nuevo total de existencias: " + RegistrarProducto.sexistencias1 + "\nFecha de operación: " + fecha1 + "-" + fecha2 + "-" + fecha3);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Accion inválida:\n" + "El número de existencias es inferior a la cantidad a retirar",
                            "Acceso denegado",
                            JOptionPane.ERROR_MESSAGE);
                }
            }

            if (eleccion == 2) {
                suma3 = RegistrarProducto.sexistencias2;
                suma4 = Integer.parseInt(escribcantidad.getText());
                if (suma3 != 0) {
                    res2 = suma3 - suma4;
                    fecha1 = (String) day.getSelectedItem();
                    fecha2 = (String) month.getSelectedItem();
                    fecha3 = (String) year.getSelectedItem();
                    RegistrarProducto.sexistencias2 = res2;
                    JOptionPane.showMessageDialog(null, "Nuevo total de existencias: " + RegistrarProducto.sexistencias2 + "\nFecha de operación: " + fecha1 + "-" + fecha2 + "-" + fecha3);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Accion inválida:\n" + "El número de existencias es inferior a la cantidad a retirar",
                            "Acceso denegado",
                            JOptionPane.ERROR_MESSAGE);
                }
            }

            if (eleccion == 3) {
                suma5 = RegistrarProducto.sexistencias3;
                suma6 = Integer.parseInt(escribcantidad.getText());
                if (suma5 != 0) {
                    res3 = suma5 - suma6;
                    fecha1 = (String) day.getSelectedItem();
                    fecha2 = (String) month.getSelectedItem();
                    fecha3 = (String) year.getSelectedItem();
                    RegistrarProducto.sexistencias3 = res3;
                    JOptionPane.showMessageDialog(null, "Nuevo total de existencias: " + RegistrarProducto.sexistencias3 + "\nFecha de operación: " + fecha1 + "-" + fecha2 + "-" + fecha3);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Accion inválida:\n" + "El número de existencias es inferior a la cantidad a retirar",
                            "Acceso denegado",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
            if (eleccion == 4) {
                suma7 = RegistrarProducto.sexistencias4;
                suma8 = Integer.parseInt(escribcantidad.getText());
                if (suma7 != 0) {
                    res4 = suma7 - suma8;
                    fecha1 = (String) day.getSelectedItem();
                    fecha2 = (String) month.getSelectedItem();
                    fecha3 = (String) year.getSelectedItem();
                    RegistrarProducto.sexistencias4 = res4;
                    JOptionPane.showMessageDialog(null, "Nuevo total de existencias: " + RegistrarProducto.sexistencias4 + "\nFecha de operación: " + fecha1 + "-" + fecha2 + "-" + fecha3);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Accion inválida:\n" + "El número de existencias es inferior a la cantidad a retirar",
                            "Acceso denegado",
                            JOptionPane.ERROR_MESSAGE);
                }
            }


            if (eleccion == 5) {
                suma9 = RegistrarProducto.sexistencias5;
                suma10 = Integer.parseInt(escribcantidad.getText());
                if (suma9 != 0) {
                    res5 = suma9 - suma10;
                    fecha1 = (String) day.getSelectedItem();
                    fecha2 = (String) month.getSelectedItem();
                    fecha3 = (String) year.getSelectedItem();
                    RegistrarProducto.sexistencias5 = res5;
                    JOptionPane.showMessageDialog(null, "Nuevo total de existencias: " + RegistrarProducto.sexistencias5 + "\nFecha de operación: " + fecha1 + "-" + fecha2 + "-" + fecha3);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Accion inválida:\n" + "El número de existencias es inferior a la cantidad a retirar",
                            "Acceso denegado",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
            if (eleccion == 6) {
                suma11 = RegistrarProducto.sexistencias6;
                suma12 = Integer.parseInt(escribcantidad.getText());
                if (suma11 != 0) {
                    res6 = suma11 - suma12;
                    fecha1 = (String) day.getSelectedItem();
                    fecha2 = (String) month.getSelectedItem();
                    fecha3 = (String) year.getSelectedItem();
                    RegistrarProducto.sexistencias6 = res6;
                    JOptionPane.showMessageDialog(null, "Nuevo total de existencias: " + RegistrarProducto.sexistencias6 + "\nFecha de operación: " + fecha1 + "-" + fecha2 + "-" + fecha3);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Accion inválida:\n" + "El número de existencias es inferior a la cantidad a retirar",
                            "Acceso denegado",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
            if (eleccion == 7) {
                suma13 = RegistrarProducto.sexistencias7;
                suma14 = Integer.parseInt(escribcantidad.getText());
                if (suma13 != 0) {
                    res7 = suma13 - suma14;
                    fecha1 = (String) day.getSelectedItem();
                    fecha2 = (String) month.getSelectedItem();
                    fecha3 = (String) year.getSelectedItem();
                    RegistrarProducto.sexistencias7 = res7;
                    JOptionPane.showMessageDialog(null, "Nuevo total de existencias: " + RegistrarProducto.sexistencias7 + "\nFecha de operación: " + fecha1 + "-" + fecha2 + "-" + fecha3);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Accion inválida:\n" + "El número de existencias es inferior a la cantidad a retirar",
                            "Acceso denegado",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
            if (eleccion == 8) {
                suma15 = RegistrarProducto.sexistencias8;
                suma16 = Integer.parseInt(escribcantidad.getText());
                if (suma15 != 0) {
                    res8 = suma15 - suma16;
                    fecha1 = (String) day.getSelectedItem();
                    fecha2 = (String) month.getSelectedItem();
                    fecha3 = (String) year.getSelectedItem();
                    RegistrarProducto.sexistencias8 = res8;
                    JOptionPane.showMessageDialog(null, "Nuevo total de existencias: " + RegistrarProducto.sexistencias8 + "\nFecha de operación: " + fecha1 + "-" + fecha2 + "-" + fecha3);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Accion inválida:\n" + "El número de existencias es inferior a la cantidad a retirar",
                            "Acceso denegado",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
            if (eleccion == 9) {
                suma17 = RegistrarProducto.sexistencias9;
                suma18 = Integer.parseInt(escribcantidad.getText());
                if (suma17 != 0) {
                    res9 = suma17 - suma18;
                    fecha1 = (String) day.getSelectedItem();
                    fecha2 = (String) month.getSelectedItem();
                    fecha3 = (String) year.getSelectedItem();
                    RegistrarProducto.sexistencias9 = res9;
                    JOptionPane.showMessageDialog(null, "Nuevo total de existencias: " + RegistrarProducto.sexistencias9 + "\nFecha de operación: " + fecha1 + "-" + fecha2 + "-" + fecha3);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Accion inválida:\n" + "El número de existencias es inferior a la cantidad a retirar",
                            "Acceso denegado",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
            if (eleccion == 10) {
                suma19 = RegistrarProducto.sexistencias10;
                suma20 = Integer.parseInt(escribcantidad.getText());
                if (suma19 != 0) {
                    res10 = suma19 - suma20;
                    fecha1 = (String) day.getSelectedItem();
                    fecha2 = (String) month.getSelectedItem();
                    fecha3 = (String) year.getSelectedItem();
                    RegistrarProducto.sexistencias10 = res10;
                    JOptionPane.showMessageDialog(null, "Nuevo total de existencias: " + RegistrarProducto.sexistencias10 + "\nFecha de operación: " + fecha1 + "-" + fecha2 + "-" + fecha3);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Accion inválida:\n" + "El número de existencias es inferior a la cantidad a retirar",
                            "Acceso denegado",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
        }
        if (e.getSource() == regresar) {
            dispose();
        }

    }

    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {

    }

    public static void main (String args[]) {
        RetirarProducto RP = new RetirarProducto();
        RP.setBounds(550,120,1000,780);
        RP.setVisible(true);
        RP.setResizable(false);

    }


}