package org.example.lab8_20223291.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "equipo")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre_Equipo", nullable = false, length = 100)
    private String nombreEquipo;

    @Column(name = "tag_Equipo", nullable = false, length = 100)
    private String tagEquipo;

    @Column(name = "nombre_Capitan", nullable = false, length = 100)
    private String nombreCapitan;

    @Min(value = 5 , message = "La cantidad de jugadores debe ser mayor o igual a 5")
    @Max(value = 10 , message = "La cantidad de jugadores debe ser menor o igual a 10")
    @Column(name = "cantidad_Jugadores", nullable = false , length = 3)
    private Integer cantidad_Jugadores;

    @Column(name = "Juego", nullable = false, unique = true, length = 100)
    private String juego;

    @Column(name = "Pais", nullable = false)
    private String pais;

    @Column(name = "correo_contacto", nullable = false)
    private String correoContacto;

    @Digits(integer = 9 ,fraction= 0 ,message = "El telefono debe tener 9 digitos")
    @Column(name = "telefono_Contacto", nullable = false , length = 10)
    private Integer telefonoContacto;

    @Column(name = "estado", nullable = false)
    private Boolean estado;

}
