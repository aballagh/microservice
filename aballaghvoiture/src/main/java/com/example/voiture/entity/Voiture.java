package com.example.voiture.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//@Author Aballagh Nezar
@Entity
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String matricule;
    private String marque;
    private String model;
    @Column(name = "id_client")
    private Long clientId;


}
