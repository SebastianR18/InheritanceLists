public class Tipo16 extends Articulo{

    public static final double TIPO = 16.0;

    public Tipo16(String Nombre, double Precio) {
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
