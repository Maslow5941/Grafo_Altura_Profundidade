import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    
      Grafo g = new Grafo();
      //inicia todo os nos

      ArrayList<Integer> emAltura=g.percorridoAltura(4);
      System.out.println("");
      System.out.println(" Bem vindo");
      System.out.println("");
      System.out.println("Percorrido altura - grafo representando a matriz pardindo de D: ");
      for(int i=0;i<emAltura.size();i++) {
        System.out.println(" " + emAltura.get(i)+"");
      }//fim do for

      //inicio do no

      ArrayList<Integer> emProfundidade=g.percorridoProfundidade(3);
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("Percorrido profundidade - grafo representando a matriz de C");
      for(int i=0;i<emProfundidade.size();i++){
        System.out.println(" " + emProfundidade.get(i)+ "");
      }


    
    
  }//fim do void main
  
}//fim da class Main
