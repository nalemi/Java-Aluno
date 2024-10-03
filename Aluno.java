/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aluno;

/**
 *
 * @author User
 */
public class Aluno {
    //Atributo privado
    
    private  String nome;
    private int idade; 
    
    public void setNome(String nome){
        this.nome= nome;
    }
  
   
    public String getNome(){
    return nome;
    }
    
    public void intIdade(){
       
        
        if(getIdade()>0 && getIdade()< 130){
            this.setIdade(getIdade());
        System.out.println("Idade cadastrada");
    
    }else{
            System.out.println("ERRO! Idade invalida");

}
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
    