-- Script de creación de Base de Datos
-- Lab 8 - Gestión de Servicios de TICS

CREATE DATABASE IF NOT EXISTS lab8_20223291
    CHARACTER SET utf8mb4
    COLLATE utf8mb4_unicode_ci;

USE lab8_20223291;

CREATE TABLE IF NOT EXISTS equipo (

    id                      INT AUTO_INCREMENT PRIMARY KEY,
    nombre_Equipo      VARCHAR(100)   NOT NULL,
    tag_Equipo        		VARCHAR(100)   NOT NULL,
    nombre_Capitan        		VARCHAR(100)   NOT NULL,
    cantidad_Jugadores                     VARCHAR(11)    NOT NULL UNIQUE,
    Juego                VARCHAR(20)    NOT NULL,
    correo_contacto      VARCHAR(150)   NOT NULL,
    Pais               VARCHAR(255),
    sitio_web        VARCHAR(150),
	telefono_Contacto      VARCHAR(150)   NOT NULL,
    estado                  TINYINT(1)     NOT NULL DEFAULT 1
    
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
