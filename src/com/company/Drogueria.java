package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;

public class Drogueria {

  private String nombre;
  private ArrayList<Cliente> clientes;
  private ArrayList<Medicamento> medicamentosEnStock;

  public Drogueria(String nombre) {
    this.nombre = nombre;
    this.clientes = new ArrayList<Cliente>();
    this.medicamentosEnStock = new ArrayList<Medicamento>();
  }

  public void agregarMedicamentosAlStock(Medicamento unMedicamento){
    //todo
  }

  public void agregarCliente(Cliente unCliente){
    //todo
  }

  public Boolean chequearAlergia(Cliente unCliente, Medicamento unMedicamento){
    return true;
    //todo
  }


}
