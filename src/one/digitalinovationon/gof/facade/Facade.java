package one.digitalinovationon.gof.facade;

import one.digitalinovationon.gof.subsistema1.CrmCliente;
import one.digitalinovationon.gof.subsistema2.CepApi;

public class Facade {
  public static void migrarCliente(String nome, String cep) {

    // Sub-sistema 2
    CepApi cepApi = CepApi.getInstance();
    String cidade = cepApi.recuperarCidade(cep);
    String estado = cepApi.recuperarEstado(cep);

    // Sub-sistema 1
    CrmCliente.salvarCliente(nome, cep, cidade, estado);

  }
}