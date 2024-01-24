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
public class Motoboy extends Funcionario{
    
    private String carteiradeHabilitacao;

    public Motoboy(String carteiradeHabilitacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNasc) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNasc);
        this.carteiradeHabilitacao = carteiradeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        double SalarioFinal = 0;
        SalarioFinal += salario;
        return SalarioFinal;
    }

    public String getCarteiradeHabilitacao() {
        return carteiradeHabilitacao;
    }

    public void setCarteiradeHabilitacao(String carteiradeHabilitacao) {
        this.carteiradeHabilitacao = carteiradeHabilitacao;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncarteiradeHabilitacao:" + carteiradeHabilitacao;
    }
    
    
    
    
    
}
