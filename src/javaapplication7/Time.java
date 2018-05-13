/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author qwerty
 */
public class Time {
    
    public Time(){
        totalJogos = 0;
        vitoria = 0;
        empate = 0;
        derrota = 0;
        totalPontos = 0;
        golsMarcados = 0;
        golsSofridos = 0;
        SaldoGols = 0;
        
    }
       
    private String nameTeam;
    private  int totalJogos;
    private  int vitoria;
    private  int empate;
    private int derrota;
    private int totalPontos;
    private int golsMarcados;
    private int golsSofridos;
    private int SaldoGols;
    
    
    
    ///=========================Set===========================================
    
    public void setName(String nameTeam){
        this.nameTeam = nameTeam;      
    }

    
    ///==========================Get===========================================

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public void setTotalJogos(int totalJogos) {
        this.totalJogos += totalJogos;
    }

    public void setVitoria(int vitoria) {
        this.vitoria += vitoria;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public void setDerrota(int derrota) {
        this.derrota += derrota;
    }

    public void setTotalPontos(int totalPontos) {
        this.totalPontos += totalPontos;
    }

    public void setGolsMarcados(int golsMarcados) {
        this.golsMarcados += golsMarcados;
    }

    public void setGolsSofridos(int golsSofridos) {
        this.golsSofridos += golsSofridos;
    }

    public void setSaldoGols(int SaldoGols) {
        this.SaldoGols += SaldoGols;
    }

    ////=============================== GET ================================

    public int getTotalJogos() {
        return totalJogos;
    }

    public int getVitoria() {
        return vitoria;
    }

    public int getEmpate() {
        return empate;
    }

    public int getDerrota() {
        return derrota;
    }

    public int getTotalPontos() {
        return totalPontos;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }

    public int getGolsSofridos() {
        return golsSofridos;
    }

    public int getSaldoGols() {
        return SaldoGols;
    }
    
    
}
