public class Exemplo {
    public static void main(String[] args) {

      int valor = 10;
      int vetor[] = new int[4];
      for(int i=0;i<4;i++){
          vetor[i] = valor;
          valor = valor+100;
          System.out.println(vetor[i]);
      }

    }
}
