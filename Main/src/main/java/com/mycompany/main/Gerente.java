/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Gerente extends CargoDeConfianca{

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNasc) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNasc);
    }

@Override
    public double getSalarioFinal() {
      double SalarioFinal = 0;
      SalarioFinal += salario + bonificacao.getValor();
      return SalarioFinal;
    }    

    @Override
    public String toString() {
        return "\nGerente\n" + super.toString() ;
    }
    
    
    
}
