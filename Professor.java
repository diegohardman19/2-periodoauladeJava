public class Professor extends Pessoa {
    private int ht;
    private double salario;

    public int getHt() {
        return ht;
    }

    public void setHt(int ht) {
        this.ht = ht;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcularSalario(){
        salario = (ht *40);
    }
}
