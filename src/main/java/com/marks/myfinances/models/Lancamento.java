package com.marks.myfinances.models;

import com.sun.istack.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Check;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
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


  @ManyToOne
  private Usuario usuario;

  @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
  private LocalDate dataCadastro;

  @Column(length = 20)
  @Enumerated(value = EnumType.STRING)
  private TipoLancamento tipo;

  @Column(length = 20)
  @Enumerated(value = EnumType.STRING)
  private StatusLancamento status;

}
