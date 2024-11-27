public class Tipo7 extends Articulo{

    public static final double TIPO = 7.0;

    public Tipo7(String Nombre, double Precio) {
        super(Nombre, Precio);
    }

    public double CalculoIVA()
    {
        return (getPrecio() * TIPO)/100;
    }

    public double PrecioIVAIncluido()
    {
        return CalculoIVA() + getPrecio();
    }

}
