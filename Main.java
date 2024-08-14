import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
 
        Academia academia1 = new Academia("Academia do Sul","Rua das peras N°1000", "+55 41 99109-4358");
       
        System.out.println(academia1.toString());
         academia1.setNome("Academia do Sul");
         academia1.setEndereço("Rua das peras N°1000");
         academia1.setTelefone("+55 41 99109-4358");


        Aluno aluno1 = new Aluno("Davi", "Médio","12/07/2007");
        academia1.alunos.add(aluno1);

        Aluno aluno2 = new Aluno("Davi", "Médio", "12/07/2007");
        academia1.alunos.add(aluno2);

        
        academia1.alunos.add(new Aluno("Davi", "Médio", ("12/07/2007")));

        for (Aluno aluno : academia1.getAlunos()) {

            System.out.println(aluno.toString());
            
        }

         Academia academia2=null;
         academia2 = new Academia("Academia do Norte","Rua das Rosas N°4560", "+55 41 99109-4358");

         System.out.println(academia2.toString());
         academia2.setNome("Academia do Norte");
         academia2.setEndereço("Rua das Rosas N°4560");
         academia2.setTelefone("+55 41 99109-4358");

         academia2.alunos.add(new Aluno("Davi", "Médio","12/07/2007"));
 
         academia2.alunos.add(new Aluno("Davi", "Médio", ("12/07/2007")));
         
         academia2.alunos.add(new Aluno("Davi", "Médio", ("12/07/2007")));
 
         for (Aluno aluno : academia2.getAlunos()) {
 
             System.out.println(aluno.toString());
             
         }
    }


    public static Date Data(String nascimento) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.parse(nascimento);
        


    }

 }