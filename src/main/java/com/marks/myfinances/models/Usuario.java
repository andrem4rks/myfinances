package com.marks.myfinances.models;

import net.bytebuddy.implementation.bind.annotation.Default;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

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

  @CreationTimestamp
  private Date data_cadastro;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public Date getData_cadastro() {
    return data_cadastro;
  }

  public void setData_cadastro(Date data_cadastro) {
    this.data_cadastro = data_cadastro;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Usuario usuario = (Usuario) o;
    return id.equals(usuario.id) && nome.equals(usuario.nome) && email.equals(usuario.email) && senha.equals(usuario.senha) && data_cadastro.equals(usuario.data_cadastro);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, email, senha, data_cadastro);
  }
}
