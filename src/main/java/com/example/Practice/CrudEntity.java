package com.example.Practice;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class CrudEntity extends Basetime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long seq;

    @Column
    private String title;

    @Column
    private String contents;

    @Column
    private String writer;

}
