package com.marks.myfinances.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 150)
  private String nome;

  @Column(length = 100)
  private String email;

  @Column(length = 20)
  private String senha;

  private Date date;
}
