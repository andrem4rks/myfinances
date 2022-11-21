package com.marks.myfinances.models;

import com.sun.istack.NotNull;
import org.hibernate.annotations.Check;

import javax.persistence.*;

@Entity
public class Lancamento {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @NotNull
  @Column(length = 100)
  private String descricao;

  @NotNull
  private Integer mes;

  @NotNull
  private Integer ano;

  @NotNull
  @Column(scale = 2)
  private Double valor;

  @NotNull
  @Column(length = 20)
  private String tipo;

  @NotNull
  @Column(length = 20)
  private String status;

  @OneToOne
  private Usuario usuario;

}
