
/*

Taller Herencias y listas

Camila Sliva - Sebastian Rubio

*/


import javax.swing.*;
import java.util.ArrayList;
import java.util.Formattable;

public class Main {

    public static void main(String[] args) {

        // ingresar nombre, identificar y precio original
        //incluir cada uno de estos atributos a un list especifico de un tipo
        // mostrar precio final y original mas la info

        ArrayList<Articulo> List_articulos = new ArrayList<>();


        int loop = Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos desea ingresar?"));

        for (int i = 0; i < loop; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del articulo");
            String ID = JOptionPane.showInputDialog("Ingrese el identificador del articulo");
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del articulo"));

            int userOpt = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el tipo de Iva que tiene el producto\n\n1. Iva del 4%\n2. Iva del 7%\n3. Iva del 16%"));

            String Mensaje = "Detalles de los productos ingresados:\n\n";

            switch (userOpt) {
                case 1:
                    List_articulos.add(new Tipo4(nombre, precio));
                    break;
                case 2:
                    List_articulos.add(new Tipo7(nombre, precio));
                    break;
                case 3:
                    List_articulos.add(new Tipo16(nombre, precio));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "El tipo de IVA no es valido.");
                    i--;
                    continue;

            }
        }
        String mensaje = "Detalles de los productos ingresados:\n\n";
        for (Articulo articulo : List_articulos) {//for each
            mensaje += articulo.toString()
                    + "\nPrecio con IVA: " + articulo.PrecioIVAIncluido()
                    + "\n\n";
        }

        JOptionPane.showMessageDialog(null, mensaje);

    }
}
