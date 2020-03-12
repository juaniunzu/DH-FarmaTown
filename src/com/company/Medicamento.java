package com.company;

import com.company.droga.Droga;

import java.util.ArrayList;

public class Medicamento {

  private String nombre;
  private ArrayList<Droga> componentes;

  public Medicamento(String nombre) {
    this.nombre = nombre;
    this.componentes = new ArrayList<Droga>();
  }

  public void agregarComponente(Droga unaDroga){
    // TODO: 12/03/2020
  }
  
  public void informarComponentes(){
    //todo
  }

  public String getNombre() {
    return nombre;
  }

}
