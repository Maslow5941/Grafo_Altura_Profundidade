
import java.util.ArrayList;

public class Grafo {

  public int[][] Ma = {
      { 0, 1, 1, 0, 0, 0, 0, 0 },
      { 1, 0, 0, 0, 0, 0, 0, 0 },
      { 1, 0, 0, 0, 1, 1, 0, 0 },
      { 1, 0, 0, 0, 1, 0, 0, 0 },
      { 0, 0, 1, 0, 1, 0, 1, 0 },
      { 0, 0, 0, 0, 0, 1, 0, 1 },
      { 0, 0, 0, 0, 0, 0, 1, 0 }
  };
  private boolean[] visitaAltura = new boolean[8];
  private boolean[] visitaProfundidade = new boolean[8];

  public Grafo() {

  }

  public int[][] getG() {
    return Ma;
  }// fim do gerG

  public ArrayList<Integer> percorridoAltura(int noI) {
    // lista que vai ir quando o no percorrido em altura no grafo
    ArrayList<Integer> percorrido = new ArrayList<Integer>();
    // o no inicial ja visitado
    visitaAltura[noI] = true;
    // visita no adijacente
    ArrayList<Integer> cola = new ArrayList<Integer>();
    // marca o no como percorrido
    percorrido.add(noI);
    // agrega o no marcado a cola de visita
    cola.add(noI);

    while (!cola.isEmpty()) {
      // remove o primeiro nó
      int j = cola.remove(0);
      // busca na matriz o representante do grafo os nos adjacentes
      for (int i = 0; i < Ma.length; i++) {
        // se o no adjacente nao visitado segue em frente
        if (Ma[j][i] == 1 && visitaAltura[i]) {
          cola.add(i);
          percorrido.add(i); // marca como visitado
          visitaAltura[i] = true;

        } // fim do if

      } // fim do for
    } // fim do while

    return percorrido;

  }// fim do percorridoAltura

  public ArrayList<Integer> percorridoProfundidade(int noI) {
    ArrayList<Integer> percorrido = new ArrayList<Integer>();
    // marca como visitado
    visitaProfundidade[noI] = true;

    ArrayList<Integer> cola = new ArrayList<Integer>();
    // marca como percorrido
    percorrido.add(noI);
    cola.add(noI);

    while (!cola.isEmpty()) {
      int j = cola.remove(0);
      for (int i = 0; i < Ma.length; i++) {

        if (Ma[j][i] == 1 && visitaProfundidade[i]) {
          cola.add(i);
          percorrido.addAll(percorridoProfundidade(i));
          //marca o visitado
          visitaProfundidade[i] = true;
        }//fim if
      }//fim do for
    }//fim do while
    return percorrido;

  }//fim do percorridoProfund

}// fim da classe grafo
