import java.util.ArrayList;
public class App {

    public static String CodProducto;
    public static String name;
    public static double precio;
    private static  double costo;
    public  static String Desc;

    public static Producto newproducto;
    public static ArrayList<Producto> productos = new ArrayList<Producto>();

    

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


       

        CodProducto ="001";
        name ="Celular";
        precio =100;
        costo =50;
        Desc ="A51";

        for (int i = 0; i < 5; i++) {
             newproducto = new Producto(CodProducto, name, precio, costo, Desc);
             productos.add(newproducto);
        }


        for (Producto producto : productos) {
            System.out.println("Cod "+producto.CodProducto);
            System.out.println("name"+producto.name);
            System.out.println("costo"+producto.getCosto());
            System.out.println("precio"+producto.precio);
            System.out.println("Desc"+producto.Desc);
            System.out.println("=========================");
        }

        
    }

    



}
