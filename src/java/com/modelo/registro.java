/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.modelo;

/**
 *
 * @author josue
 */
public class registro {
    private int id;
    private String rutaJson;
    private String creationDate;
    private String creationTime;
    private int estado;

    public registro() {
    }

    public registro(int id, String rutaJson, String creationDate, String creationTime, int estado) {
        this.id = id;
        this.rutaJson = rutaJson;
        this.creationDate = creationDate;
        this.creationTime = creationTime;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRutaJson() {
        return rutaJson;
    }

    public void setRutaJson(String rutaJson) {
        this.rutaJson = rutaJson;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    

    
}
