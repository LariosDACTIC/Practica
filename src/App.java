import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static String CodProducto;
    public static String name;
    public static double precio;
    private static double costo;
    public static String Desc;

    public static Producto newproducto;
    public static ArrayList<Producto> productos = new ArrayList<Producto>();
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        boolean salir = true;

        do {

            System.out.println("Ingrese una opcion");
            System.out.println("1-Agregar");
            System.out.println("2-Mostrar Catalogo");
            System.out.println("3- Modificar");
            System.out.println("4 - Eliminar");
            System.out.println("5- Salir");
            int op = leer.nextInt();
            leer.nextLine();

            switch (op) {
                case 1:
                    AddProduct();
                    break;
                case 2:
                    MostrarCatalogo();
                    break;
                case 3:
                
                    break;
                case 4:
                    break;
                case 5:
                    salir = false;
                    break;

                default:
                    break;
            }
        } while (salir);

    }

    public static void AddProduct() {
        System.out.println("Ingrese los datos de un producto");
        System.out.println("Cod ");
        CodProducto = leer.nextLine();
        System.out.println("name");
        name = leer.nextLine();
        System.out.println("costo");
        precio = leer.nextDouble();
        System.out.println("precio");
        costo = leer.nextDouble();
        leer.nextLine();
        System.out.println("Desc");
        Desc = leer.nextLine();
        newproducto = new Producto(CodProducto, name, costo, precio, Desc);
        productos.add(newproducto);
        // return newproducto;
    }

    public static void MostrarCatalogo() {
        for (Producto producto : productos) {
            System.out.println("Cod " + producto.CodProducto);
            System.out.println("name" + producto.name);
            System.out.println("costo" + producto.getCosto());
            System.out.println("precio" + producto.precio);
            System.out.println("Desc" + producto.Desc);
            System.out.println("=========================");
        }
    }

    public static Producto BuscarProducto(String codProducto) {
        Producto PSearch = null;
        
        for (Producto producto : productos) {

            if (producto.CodProducto.equals(codProducto)) {
                PSearch = producto;
                break;
            }
        }
        return PSearch;
    }





}
