/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.leticia;

import java.util.HashSet;
import java.util.Set;

public class Turma {

private String nome;

// "Responsável" pela turma (igual ao líder no exemplo)
private Professor professorResponsavel;

// Conjuntos (igual ao HashSet do quadro)
private Set<Estudante> discentes;
private Set<Disciplina> disciplinas;
private Set<Professor> professores;

// Construtor
public Turma(String nome) {
this.nome = nome;
this.discentes = new HashSet<>(); // size = 0
this.disciplinas = new HashSet<>(); // size = 0
this.professores = new HashSet<>(); // size = 0
}

// Associações
public void setProfessorResponsavel(Professor p) {
this.professorResponsavel = p;
}

public void adicionarDiscente(Estudante d) {
discentes.add(d);
}

public void adicionarDisciplina(Disciplina d) {
disciplinas.add(d);
}

public void adicionarProfessor(Professor p) {
professores.add(p);

}
}
