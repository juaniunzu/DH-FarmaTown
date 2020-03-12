package com.company;

import com.company.droga.Droga;

import java.util.ArrayList;

public class Cliente {

  private String nombre;
  private ArrayList<Droga> esAlergicoA;

  public Cliente(String nombre) {
    this.nombre = nombre;
    this.esAlergicoA = new ArrayList<Droga>();
  }

  public String getNombre() {
    return nombre;
  }

  public void agregarAlergia(Droga unaDroga){
    esAlergicoA.add(unaDroga);
  }

  public ArrayList<Droga> getEsAlergicoA() {
    return esAlergicoA;
  }
}
