/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Prefeitura {
    private Integer codigo;
    private String nome;
    private String endereco;
    private Integer nrdefuncionarios;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getNrdefuncionarios() {
        return nrdefuncionarios;
    }

    public void setNrdefuncionarios(Integer nrdefuncionarios) {
        this.nrdefuncionarios = nrdefuncionarios;
    }

    @Override
    public String toString() {
        return "Prefeitura{" + "endereco=" + endereco + '}';
    }
    
    
    
}
