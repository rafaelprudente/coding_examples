package org.example;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class ParametriList {
    private List<Parametri> lista = new ArrayList<>();

    @XmlElement(name = "parametri")
    public List<Parametri> getLista() {
        return lista;
    }

    public void setLista(List<Parametri> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        final var builder = new StringBuilder();
        for (Parametri p : lista) {
            builder.append(String.format("\t%s%n", p));
        }
        return builder.toString();
    }
}
