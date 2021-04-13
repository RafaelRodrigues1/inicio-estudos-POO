package poo;

public class Estudo { //Classe Estudo
        
        //ATRIBUTOS
    private boolean pcLigado;
    public int tempoEstudo;
    private String qualidadeMaterial = "Ruim";
    public String estudante;
    
        //MÉTODOS
    public void estudar(){
        if(this.pcLigado==true && this.tempoEstudo>0 && this.qualidadeMaterial.equals("Bom")){
            System.out.println(this.estudante + " estudou " + this.tempoEstudo + " horas");            
        }else{
            System.out.println(this.estudante + " não vai estudar!");
        }   
    }
    
    public void pesquisaMaterial(){
        for(int i=0; i<2; i++){
        if(this.pcLigado==true){
            System.out.println(this.estudante + " pesquisou um material bom!");
            this.qualidadeMaterial="Bom";
            i++;
        }else{System.out.println("Ligando PC antes de pesquisar");
        this.ligarPc();}
        }
    }
    
    private void ligarPc(){
            this.pcLigado=true;
            System.out.println(this.estudante + " ligou o PC");       
    }
    
    public void status(){
        System.out.println("Nome do estudante: " + this.estudante);
        if(this.pcLigado){
        System.out.println("PC está ligado");}
        else{System.out.println("PC está desligado");}
        System.out.println("Tempo de estudo: " + this.tempoEstudo);
        System.out.println("Qualidade do material " + this.qualidadeMaterial);
    }
}
