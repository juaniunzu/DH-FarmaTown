package com.company;

import com.company.droga.*;
import com.sun.tools.javac.jvm.Code;

public class Main {

    public static void main(String[] args) {

        Drogueria farmaciaPepe = new Drogueria("Farmacia Pepe");

        Amoxicilina amoxicilina = new Amoxicilina("amoxicilina");
        Cafeina cafeina = new Cafeina("cafeina");
        Chiquitolina chiquitolina = new Chiquitolina("chiquitolina");
        Codeina codeina = new Codeina("codeina");
        Estornudina estornudina = new Estornudina("estornudina");
        Gigantolina gigantolina = new Gigantolina("gigantolina");
        Mateina mateina = new Mateina("mateina");
        Teina teina = new Teina("teina");
        Tosina tosina = new Tosina("tosina");

        Medicamento amocafchi = new Medicamento("amocafchi");
        amocafchi.agregarComponente(amoxicilina);
        amocafchi.agregarComponente(chiquitolina);
        amocafchi.agregarComponente(cafeina);

        Medicamento codestogiga = new Medicamento("codestogiga");
        codestogiga.agregarComponente(codeina);
        codestogiga.agregarComponente(estornudina);
        codestogiga.agregarComponente(gigantolina);

        Medicamento matetosite = new Medicamento("matetosite");
        matetosite.agregarComponente(mateina);
        matetosite.agregarComponente(teina);
        matetosite.agregarComponente(tosina);

        Cliente pipo = new Cliente("pipo");
        pipo.agregarAlergia(teina);


        System.out.println(farmaciaPepe.chequearAlergia(pipo, codestogiga));
        System.out.println(farmaciaPepe.chequearAlergia(pipo, amocafchi));
        System.out.println(farmaciaPepe.chequearAlergia(pipo, matetosite));





    }
}
