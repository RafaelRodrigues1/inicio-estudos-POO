package poo;

public class Poo {
    
    public static void pulaLinha(){
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        
        Estudo redes = new Estudo(); //Instanciando um objeto da classe Estudo
        redes.estudante = "Rafael";
        redes.tempoEstudo = 4;
        redes.status();
        pulaLinha();
        redes.estudar();
        pulaLinha();
        redes.pesquisaMaterial();
        pulaLinha();
        redes.status();
        pulaLinha();
        redes.estudar();        
    }


    
}
