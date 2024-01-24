/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Aluno
 */
public enum Genero {
    
    MASCULINO("Masculino",'M'),
    FEMININO("Feminino",'F');
    
    private String texto;
    private char caractere;

    private Genero(String texto, char caractere) {
        this.texto = texto;
        this.caractere = caractere;
    }

    public String getTexto() {
        return texto;
    }

    public char getCaractere() {
        return caractere;
    }
    
    
    
}
