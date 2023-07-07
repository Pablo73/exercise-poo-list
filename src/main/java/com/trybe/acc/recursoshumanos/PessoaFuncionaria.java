package com.trybe.acc.recursoshumanos;

/**
 * Classe que representa uma pessoa funcionária no sistema de recursos humanos.
 */
public class PessoaFuncionaria {

  private String nomeCompleto;
  private String cpf;
  private String endereco;
  private double salario;

  PessoaFuncionaria(String nomeCompleto, String cpf, String endereco, double salario) {
    this.nomeCompleto = nomeCompleto;
    this.cpf = cpf;
    this.endereco = endereco;
    this.salario = salario;
  }

  public void setNomeCompleto(String nomeCompleto) {
    this.nomeCompleto = nomeCompleto;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public String getNomeCompleto() {
    return nomeCompleto;
  }

  public String getCpf() {
    return cpf;
  }

  public String getEndereco() {
    return endereco;
  }

  public double getSalario() {
    return salario;
  }

  public static void main(String[] args) {
    PessoaFuncionaria pessoaFuncionaria =
        new PessoaFuncionaria("Maria da Silva", "158.699.457-31", "Rua da Aurora, 118", 15000);
  }


}
