package com.trybe.acc.pessoausuaria;

public class PessoaUsuaria extends Pessoa {

  public PessoaUsuaria(String nome, String sobrenome) {
    super(nome, sobrenome);
  }

  /**
   * Método para pegar o nome e sobrenome do usuário.
   * 
   * @return o nome de usuário concatenado com o sobrenome, ou uma mensagem de "Pessoa usuária
   *         inválida" se o nome ou sobrenome forem inválidos
   */
  public String getPessoaUsuaria() {
    if (nome == null || nome.isEmpty() || sobrenome == null || sobrenome.isEmpty()) {
      return "Pessoa usuária inválida";
    } else {
      return nome + "." + sobrenome;
    }
  }

  public static void main(String[] args) {
    PessoaUsuaria pessoaUsuaria = new PessoaUsuaria(null, "wayne");
    System.out.println(pessoaUsuaria.getPessoaUsuaria());
  }
}
