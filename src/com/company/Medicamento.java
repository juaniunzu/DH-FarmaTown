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
    componentes.add(unaDroga);
  }
  
  public void informarComponentes(){
    for (Droga componente : componentes) {
      System.out.println(componente.getNombre());
    }
  }

  public Boolean contieneDroga(Droga unaDroga){
    return(this.componentes.contains(unaDroga));
  }


  public String getNombre() {
    return nombre;
  }

}
