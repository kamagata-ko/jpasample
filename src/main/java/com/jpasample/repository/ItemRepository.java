package com.jpasample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpasample.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{
    List<Item> findAllByOrderByIdAsc();
}
