package com.examplee.demoo.repositories;

import com.examplee.demoo.models.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {
}