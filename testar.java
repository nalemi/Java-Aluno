
import aluno.Aluno;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class testar {
    public static void main(String []args){
    
    //construtor
    Aluno aluno1= new Aluno();
   // Aluno1.nome= "Milena";
    
    aluno1.setNome("Milena");
    aluno1.setIdade(22);    

        System.out.println("Nome: "+aluno1.getNome());
        
        System.out.println("Idade: "+aluno1.getIdade());
        
        
        
    }

    
}