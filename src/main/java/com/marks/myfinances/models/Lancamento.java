package com.marks.myfinances.models;

import com.sun.istack.NotNull;
import org.hibernate.annotations.Check;

import javax.persistence.*;
import java.util.Objects;

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

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Integer getMes() {
    return mes;
  }

  public void setMes(Integer mes) {
    this.mes = mes;
  }

  public Integer getAno() {
    return ano;
  }

  public void setAno(Integer ano) {
    this.ano = ano;
  }

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Lancamento that = (Lancamento) o;
    return id == that.id && descricao.equals(that.descricao) && mes.equals(that.mes) && ano.equals(that.ano) && valor.equals(that.valor) && tipo.equals(that.tipo) && status.equals(that.status) && usuario.equals(that.usuario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descricao, mes, ano, valor, tipo, status, usuario);
  }

}
