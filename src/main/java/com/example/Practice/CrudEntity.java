package com.example.Practice;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class CrudEntity extends Basetime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long crudSeq;


    private String crudtitle;


    private String crudcontents;


    private String crudwriter;

}
