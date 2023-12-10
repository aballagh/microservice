package com.example.voiture.repository;

import com.example.voiture.entity.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
//@Author Aballagh Nezar
public interface VoitureRepo extends JpaRepository<Voiture,Long> {
}
