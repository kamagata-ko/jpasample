package com.jpasample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jpasample.entity.Item;
import com.jpasample.repository.ItemRepository;

@Controller
@RequestMapping(value = "/item")
public class ItemController {
    @Autowired
    ItemRepository repository;

    @GetMapping(value = "/fetchname")
    public void fetchNameByPK() {
        List<Item> items = repository.findAllByOrderByIdAsc(); // idの昇順で取得する。

        for(int i = 0; i<items.size(); i++) {
            System.out.print(items.get(i).getId());
            System.out.print(" : ");
            System.out.print(items.get(i).getName());
            System.out.print(" : ");
            System.out.println(items.get(i).getStartDate());
        }
    }
}
