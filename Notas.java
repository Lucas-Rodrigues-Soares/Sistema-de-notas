import java.util.Scanner;

public class Notas {
    
    public static void main(String[] args) {
        
          System.out.printf("---------- Bem vindo(a) ----------- %n%n");
        
          System.out.printf("  ============ DADOS ============= %n%n%n");
        
        //Perguntar Qual aluno
          System.out.printf(" Nome do aluno:%n%n");
        
        Scanner nomeDoUsuario = new Scanner(System.in);
        String nome = nomeDoUsuario.nextLine();
        System.out.printf("------------------------------------ %n");
        
        
        //Informar a nota de cada bimestre
        //primeiro bimestre
          System.out.println(" Nota do primeiro bimestre do aluno:");
          System.out.println();
        
        //scanner do bimestre1
        Scanner sc = new Scanner(System.in);
        double notabim1 = sc.nextDouble();
        System.out.println();
        
        
        //segundo bimestre
          System.out.println(" Nota do segundo bimestre do aluno:");
          System.out.println();
        
        //scanner do bimestre 2
        double notabim2 = sc.nextDouble();
        System.out.println();
        
        
        //terceiro bimestre
          System.out.println(" Nota do terceiro bimestre do aluno:");
          System.out.println();
        
        //scanner do bimestre 3
        double notabim3 = sc.nextDouble();
        System.out.println();
        
        
        //quarto bimestre
          System.out.println(" Nota do quarto bimestre do aluno:");
          System.out.println();
        
        //scanner do bimestre 4
        double notabim4 = sc.nextDouble();
        System.out.println();
        
        
        //Pergunta sobre as faltas
          System.out.printf(" Total de faltas do aluno:%n");
          System.out.println();
        
        //scanner das faltas
        
        int falt = sc.nextInt();
        System.out.printf("------------------------------------ %n");
        
        
        sc.close();
        
        System.out.println();
        
        
        
        
        //objeto1
        Aluno aluno1 = new Aluno();
        aluno1.nome = nome;
        aluno1.bimestral1 = notabim1;
        aluno1.bimestral2 = notabim2;
        aluno1.bimestral3 = notabim3;
        aluno1.bimestral4 = notabim4;
        aluno1.faltas = falt;
        
        
        aluno1.mostrarRelatorio();
        
    }
}







class Aluno {
    //Atributos
    String nome;
    double bimestral1;
    double bimestral2;
    double bimestral3;
    double bimestral4;
    int faltas;
    
    //Métodos
    double calcularNotaFinal() {
        return (bimestral1 + bimestral2 + bimestral3 + bimestral4) /4;
    }
    
    void mostrarRelatorio() {
    
    double  notaFinal = calcularNotaFinal();
        
        System.out.println(" Conclusão sobre o aluno: " + nome);
        System.out.println();
        
        System.out.printf("--------- Resultado final ----------%n%n " + "Nota Final: " + notaFinal);
        System.out.println();
        System.out.println();
        
        
        System.out.println(" Total de faltas: " + faltas);
        System.out.println();
        
        System.out.println("------------ Conclusão -----------");
        System.out.println();
        
        if (notaFinal >=6.00 && faltas <=100) {
            System.out.printf("           Passou!%n%n%n");
        } else {
            System.out.printf("       Ficou de recuperação!%n%n%n");
        }
        
        System.out.println("===================================");
        
        
    }
    
}