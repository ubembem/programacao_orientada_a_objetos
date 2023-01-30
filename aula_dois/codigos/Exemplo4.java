public class Exemplo {
    public static void main(String[] args) {
       int n1 = 15, n2 = 30, n3 =20;
       if(n1>n2 && n1>n3){
           System.out.println(n1);
       }else if(n2>n1 && n2>n3){
            System.out.println(n2);
        }else {
            System.out.println(n3);
        }
    }
}
