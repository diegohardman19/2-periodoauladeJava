public class Main{
   public static void main(String[] args){

       Aluno a = new Aluno();
       Professor pr = new Professor();

       //Professor

       pr.setIdade(36);
       System.out.println("Idade:"+ pr.getIdade());
       pr.setNome("Geraldo");
       System.out.println("Nome:"+ pr.getNome());
       pr.setHt(280);
       pr.calcularSalario();
       System.out.println("Salario:"+ pr.getSalario());

       //Aluno:

       a.setIdade(18);
       System.out.println("Idade:"+ a.getIdade());
       a.setNome("ilidio");
       System.out.println("Nome:"+ a.getNome());
       a.setNota1(7.4);
       a.setNota2(5.5);
       a.setNota3(7.8);
       a.calcularMedia();
       System.out.println(a.getMedia());
   }
}
