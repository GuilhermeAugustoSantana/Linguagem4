package com.mycompany.ex02_componentes;

import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "ct")
@SessionScoped
public class Bean implements Serializable {

    private String cpNome;
    private String cpCurso;
    private String cpSexo;
    private Boolean cpInfo;
    private String cpSenha;

    public Bean() {
        limpar();
    }//builder

    public void btLimpar(ActionEvent ae) {
        limpar();
    }

    public void limpar() {
        setCpNome("");
        setCpCurso("");
        setCpSexo("");
        setCpInfo(false);
        setCpSenha("");
    }
    
    public String btNavegaEx01(ActionEvent ae){
        limpar();
        return "ex01";
    }

    public String btSubmit(ActionEvent ae) {
        submit();
        return "ex01res";
    }
    
    public void submit() {
        setCpNome(getCpNome()+"XXX");
    }

    ///////////////Get Set
    public String getCpNome() {
        return cpNome;
    }

    public void setCpNome(String cpNome) {
        this.cpNome = cpNome;
    }

    public String getCpCurso() {
        return cpCurso;
    }

    public void setCpCurso(String cpCurso) {
        this.cpCurso = cpCurso;
    }

    public String getCpSexo() {
        return cpSexo;
    }

    public void setCpSexo(String cpSexo) {
        this.cpSexo = cpSexo;
    }

    public Boolean getCpInfo() {
        return cpInfo;
    }

    public void setCpInfo(Boolean cpInfo) {
        this.cpInfo = cpInfo;
    }

    public String getCpSenha() {
        return cpSenha;
    }

    public void setCpSenha(String cpSenha) {
        this.cpSenha = cpSenha;
    }

}//class
