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
public class Diretor extends CargoDeConfianca implements Contratacao{
    
    private double PREMIO = (0.3);

   
    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNasc) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNasc);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }

    @Override
    public double getSalarioFinal() {
      double SalarioFinal = 0;
      SalarioFinal += salario * PREMIO;
      SalarioFinal += salario + bonificacao.getValor();
      return SalarioFinal;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("\nInformações do funcionario Admitido" + funcionario);
    }

    @Override
    public void demitir(Funcionario fucionario) {
        System.out.println("\nInformações do Funcionario demitido" + fucionario);
    }
    
     @Override
    public String toString() {
        return "\nDiretor\n" + super.toString() + "\nPREMIO:" + PREMIO;
    }

    
    
}
