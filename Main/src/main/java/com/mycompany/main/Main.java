/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        
        Motoboy moto = new Motoboy("53276278", "Luis", "72892012", "827263", 
        new Endereco("527267", "89", "casa", "7228612", "Salvador", UnidadeFederativa.BAHIA), Setor.OPERACOES, Genero.MASCULINO, 1.500, EstadoCivil.CASADO, LocalDate.of(2000, Month.MARCH, 5));
        
        Engenheiro engenheiro = new Engenheiro("52671", "Maria", "928972", "8329020", 
        new Endereco("62763", "67", "apartamento", "7638262", "São Paulo", UnidadeFederativa.SAO_PAULO), Setor.ENGENHARIA, Genero.FEMININO, 1.500, EstadoCivil.DIVORCIADO, LocalDate.of(2001, Month.AUGUST, 7));
        
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "João", "8272899", "57162178", 
        new Endereco("7287829", "82", "casa", "627611", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO), Setor.RECURSOS_HUMANOS, Genero.MASCULINO, 1.500, EstadoCivil.CASADO, LocalDate.of(2002, Month.JULY, 24));
        
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Luisa", "267627", "7236872", 
        new Endereco("6262571", "87", "casa", "8727851", "Lauro de Freitas", UnidadeFederativa.BAHIA), Setor.RECURSOS_HUMANOS, Genero.FEMININO, 1.500, EstadoCivil.SOLTEIRO, LocalDate.of(2003, Month.OCTOBER, 13));
        
        diretor.admitir(engenheiro);
        diretor.demitir(moto);
        diretor.admitir(gerente);
        System.out.println(diretor.toString());
        
        
    }
}
