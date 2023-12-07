package org.ENSAJ.ClientService.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ENSAJ.ClientService.Model.Client;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Voiture {

    private Long id;
    private String matricule;
    private String marque;
    private String model;
    private Long client_id;

}
