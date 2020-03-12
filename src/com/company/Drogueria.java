package com.company;

import com.company.droga.Droga;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;

public class Drogueria {

  private String nombre;
  private ArrayList<Cliente> clientes; //agregado al cuete!!
  private ArrayList<Medicamento> medicamentosEnStock; //agregado al recontra cuete!!

  public Drogueria(String nombre) {
    this.nombre = nombre;
    this.clientes = new ArrayList<Cliente>();
    this.medicamentosEnStock = new ArrayList<Medicamento>();
  }

  //agregado al cuete!!
  public void agregarMedicamentosAlStock(Medicamento unMedicamento){
    medicamentosEnStock.add(unMedicamento);
  }

  //tambien agregado al cuete!!
  public void agregarCliente(Cliente unCliente){
    clientes.add(unCliente);
  }

  public Boolean chequearAlergia(Cliente unCliente, Medicamento unMedicamento){
    Boolean esAlergico = false;
    for (Droga droga : unCliente.getEsAlergicoA()) {
      esAlergico = unMedicamento.contieneDroga(droga);
      if(esAlergico) break;
    }
    return esAlergico;
  }

}
