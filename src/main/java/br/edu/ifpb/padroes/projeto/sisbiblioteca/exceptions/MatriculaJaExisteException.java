/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.projeto.sisbiblioteca.exceptions;

/**
 *
 * @author kieckegard
 */
public class MatriculaJaExisteException extends Exception
{
    public MatriculaJaExisteException(String msg){
        super(msg);
    }
}
