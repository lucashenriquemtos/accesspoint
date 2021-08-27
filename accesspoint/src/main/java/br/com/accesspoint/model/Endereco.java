package br.com.accesspoint.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String enderecoId;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;

}
