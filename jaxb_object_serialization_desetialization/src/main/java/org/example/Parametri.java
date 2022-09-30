package org.example;

public class Parametri {
    private String parametro;
    private int maggiore;
    private int minore;
    private int risultato;

    public String getParametro() {
        return parametro;
    }

    public void setParametro(String parametro) {
        this.parametro = parametro;
    }

    public int getMaggiore() {
        return maggiore;
    }

    public void setMaggiore(int maggiore) {
        this.maggiore = maggiore;
    }

    public int getMinore() {
        return minore;
    }

    public void setMinore(int minore) {
        this.minore = minore;
    }

    public int getRisultato() {
        return risultato;
    }

    public void setRisultato(int risultato) {
        this.risultato = risultato;
    }

    @Override
    public String toString() {
        final var builder = new StringBuilder();
        builder.append(String.format("%s:%s%n", "parametro", parametro));
        builder.append(String.format("%s:%s%n", "maggiore", maggiore));
        builder.append(String.format("%s:%s%n", "minore", minore));
        builder.append(String.format("%s:%s%n", "risultato", risultato));
        return builder.toString();
    }
}
