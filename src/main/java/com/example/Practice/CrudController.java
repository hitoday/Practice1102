package com.example.Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;
import java.util.Date;

@Controller
public class CrudController {

    private final CrudService crudService;

    @Autowired
    protected CrudController(CrudService crudService){
        this.crudService = crudService;
    }

    @GetMapping("/Crud/Insert")
    public void insertReview(){
    }

    @PostMapping("/Crud/Insert")
    public String insertReview(CrudEntity crudEntity){
        crudService.insertReview(crudEntity);
        return "Crud/List";
    }

//    @GetMapping("/Curd/List")
//    public void List(Model model){
//        model.addAttribute("List", list)
//    }
}
