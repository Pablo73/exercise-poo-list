package com.trybe.acc.contapoupanca;

public class ContaPoupanca {
  private double saldo;
  private String titularConta;

  /**
   * Cria uma nova instância da classe ContaPoupanca.
   *
   * @param titularConta o nome do titular da conta
   * @param saldo o saldo inicial da conta
   */
  public ContaPoupanca(String titularConta, double saldo) {
    this.titularConta = titularConta;
    this.saldo = saldo;
  }

  /**
   * Deposita um determinado valor na conta.
   *
   * @param value o valor a ser depositado
   */
  public void depositar(double value) {
    saldo += value;
  }

  /**
   * Realiza um saque na conta.
   *
   * @param value o valor a ser sacado
   */
  public void sacar(double value) {
    if (saldo < value) {
      System.out.println("Saldo insuficiente");
    } else {
      this.saldo -= value;
    }
  }

  /**
   * Mostra o saldo atual da conta.
   */
  public double mostrarSaldo() {
    return saldo;
  }

  /**
   * Mostra o nome do titular da conta.
   */
  public String mostrarTitularConta() {
    return titularConta;
  }

  public static void main(String[] args) {
    ContaPoupanca contaPoupanca = new ContaPoupanca("Maria da Silva", 20);
    System.out.println(contaPoupanca.mostrarSaldo());
  }
}
