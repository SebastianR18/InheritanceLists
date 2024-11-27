public class Tipo4 extends Articulo{

    public static final double TIPO = 4.0;

    public Tipo4(String Nombre, double Precio) {
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
