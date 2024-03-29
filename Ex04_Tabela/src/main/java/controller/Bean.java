package controller;

import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "ct")
@SessionScoped
public class Bean implements Serializable{
    private String cpEquipamento;
    private double cpPotencia;
    private double cpTempo;
    private String cpUnidadeTempo;
    private String cpValorkWh;
    private String cpTotal;

    public Bean() {
    }
    
    public void submit(){
        
    }
    
    
    /////////////////Get Set

    public String getCpEquipamento() {
        return cpEquipamento;
    }

    public void setCpEquipamento(String cpEquipamento) {
        this.cpEquipamento = cpEquipamento;
    }

    public double getCpPotencia() {
        return cpPotencia;
    }

    public void setCpPotencia(double cpPotencia) {
        this.cpPotencia = cpPotencia;
    }

    public double getCpTempo() {
        return cpTempo;
    }

    public void setCpTempo(double cpTempo) {
        this.cpTempo = cpTempo;
    }

    public String getCpUnidadeTempo() {
        return cpUnidadeTempo;
    }

    public void setCpUnidadeTempo(String cpUnidadeTempo) {
        this.cpUnidadeTempo = cpUnidadeTempo;
    }

    public String getCpValorkWh() {
        return cpValorkWh;
    }

    public void setCpValorkWh(String cpValorkWh) {
        this.cpValorkWh = cpValorkWh;
    }

    public String getCpTotal() {
        return cpTotal;
    }

    public void setCpTotal(String cpTotal) {
        this.cpTotal = cpTotal;
    }
    
    
}
