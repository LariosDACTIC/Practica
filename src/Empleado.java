public class Empleado {

    public String name;
    private double salario;
    public String cargo;

    public Empleado(String name, double salario, String cargo) {
        this.name = name;
        this.salario = salario;
        this.cargo = cargo;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double Nsalario) {
        this.salario = Nsalario;
    }

}
