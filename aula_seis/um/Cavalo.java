ublic class Cavalo {

   String nome;

   float peso;

   int idade;


   public Cavalo(String nome, float peso, int idade) {   //construtor 

       this.nome = nome;

       this.peso = peso;

       this.idade = idade;

   }

} //class


public class Principal {

   public static void main(String[] args) {

       Cavalo c1 = new Cavalo("Pé de Pano", 100, 5);  //o objeto do tipo Cavalo é criado já com valores atribuídos.

   }

}//class
