package org.example.lab8_20223291.dto;


import lombok.Data;

@Data
public class EquipoListDTO {

    private Integer id;
    private String nombreEquipo;
    private String tagEquipo;
    private String nombreCapitan;
    private String juego;
    private String correoContacto;
    private String pais;
    private String telefonoContacto;
    private String estado;
}
