import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // crear un arrayList
        ArrayList<String> lista = new ArrayList<>();

        // Agregando Elementos
        lista.add("elemento 1");// 0
        lista.add("elemento 2");// 1
        lista.add("elemento 3");// 2

        // Acceder a elementos
        String elemento = lista.get(1);

        // eliminar elemento de la lista
        lista.remove(1);

        // buscar y retorna la posicion o -1 de no encontrar
        System.out.println("Busqueda " + lista.indexOf("elemento 3"));

        // rrecorrer
        for (String elementos : lista) {
            System.out.println(elementos);
        }

        // tamaño del lista
        System.out.println("Tamaño del Arraylist " + lista.size());

        // Sasber si esta vacio
        System.out.println("Esta vacio? " + lista.isEmpty());

        // Limpiar
        lista.clear();

        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

        Empleado empleado1 = new Empleado("Cristopher1", 10000, "Docente");
        Empleado empleado2 = new Empleado("Cristopher2", 10000, "Alumno");
        Empleado empleado3 = new Empleado("Cristopher3", 10000, "Gerente");

        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
        listaEmpleados.add(empleado3);

        for (Empleado empleado : listaEmpleados) {

            if (empleado.cargo.equals("Gerente")) {
                System.out.println("Datos del empleado que es gerente");
                System.out.println("Nombre => " + empleado.name);
                System.out.println("Salario => " + empleado.getSalario());
            }

        }

    }
}
