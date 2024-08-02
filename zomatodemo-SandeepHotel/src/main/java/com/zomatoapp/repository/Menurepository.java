package com.zomatoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zomatoapp.model.Menu;

@Repository
public interface Menurepository extends JpaRepository<Menu, Integer> {

}
