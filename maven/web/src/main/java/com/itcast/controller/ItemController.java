package com.itcast.controller;


import com.itcast.domain.Item;
import com.itcast.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;


    @RequestMapping(path = "itemlist")
    public String list(Model model){

        List<Item> list = itemService.findAll();

        model.addAttribute("list",list);

        return "list";
    }
}
