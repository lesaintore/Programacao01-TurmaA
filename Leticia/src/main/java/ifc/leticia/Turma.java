/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.leticia;

import java.util.HashSet;
import java.util.Set;

/*
    Feito por VineC4rr91
 */
public class Turma {
    private String nome;
    private String ano;
    private String curso;
    ///////////////////
    public Turma(){
    }
   
    public String getNome (){
        return this.nome;
    }
           
    public void setNome (String _nome){
        this.nome = _nome;
    }
   
    public String getAno (){
    return this.ano;
    }
           
    public void setAno (String _ano){
        this.ano = _ano;    
    }
   
    public String getCurso (){
        return this.curso;
    }
           
    public void setCurso (String _curso){
        this.curso = _curso;
    }

    Set<Estudante> discentes = new HashSet<Estudante>();
    Set<Disciplina> discipina = new HashSet<Disciplina>();
    Turma professor = new Turma();
}
