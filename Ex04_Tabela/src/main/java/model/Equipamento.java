package model;

public class Equipamento {
    private int id;
    private String nomeEquipamento;
    private double potencia;
    private double tempo;
    private String medidaTempo;
    private double kwh;
    private double valorGasto;
    
    
    
    ////////////////////

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeEquipamento() {
        return nomeEquipamento;
    }

    public void setNomeEquipamento(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public String getMedidaTempo() {
        return medidaTempo;
    }

    public void setMedidaTempo(String medidaTempo) {
        this.medidaTempo = medidaTempo;
    }

    public double getKwh() {
        return kwh;
    }

    public void setKwh(double kwh) {
        this.kwh = kwh;
    }

    public double getValorGasto() {
        return valorGasto;
    }

    public void setValorGasto(double valorGasto) {
        this.valorGasto = valorGasto;
    }
}
