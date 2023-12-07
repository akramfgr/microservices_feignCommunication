package org.ENSAJ.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ENSAJ.Client;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Voiture {
    @Id
    @GeneratedValue
    private Long id;
    private String matricule;
    private String marque;
    private String model;
    @Column(name = "client_id")
    private Long client_id;

   /* @Transient
    private Client client;
    public Voiture(Long id, String marque, String matricule, String model, Long id_client) {
        this.id = id;
        this.marque = marque;
        this.matricule = matricule;
        this.model = model;
        this.id_client = id_client;
    }*/


    @JsonIgnore
    public Long getId_client() {
        return client_id;
    }

    public void setId_client(Long id_client) {
        this.client_id = id_client;
    }
}
