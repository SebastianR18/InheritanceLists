abstract class Articulo {

    private String Nombre, Identificador;
    private double Precio;

    //Metodos Modificacion


    public Articulo(String Nombre, double Precio)
    {
        this.Nombre = Nombre;
        this.Precio = Precio;
    }


    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public void setIdentificador(String identificador) {
        Identificador = identificador;
    }
    public void setPrecio(double precio) {
        Precio = precio;
    }

    //Metodos Acceso

    public String getNombre() {
        return Nombre;
    }
    public String getIdentificador() {
        return Identificador;
    }
    public double getPrecio() {
        return Precio;
    }

    public abstract double CalculoIVA(); // usamos abstract para usar el metodo en las demas clases de TipoIVA

    public abstract double PrecioIVAIncluido();

    public String toString() { // METODO Para convertir en String
        return "Nombre: " + Nombre + "\nPrecio original: " + Precio;
    }

}
