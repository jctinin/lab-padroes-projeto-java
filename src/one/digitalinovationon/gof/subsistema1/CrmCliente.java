package one.digitalinovationon.gof.subsistema1;

public class CrmCliente {

  private CrmCliente() {
    super();
  }

  public static void salvarCliente(String nome, String cep, String cidade, String estado) {
    System.out.println("Nome: " + nome);
    System.out.println("CEP: " + cep);
    System.out.println("Cidade: " + cidade);
    System.out.println("Estado: " + estado);

    System.out.println("Cliente salvo no sistema de CRM");
  }

}
