package br.com.indiotec.reservestudioapi.model;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

public class ClientContact extends AbstractEntity {
    
    @ManyToOne
    private Client client;

    @Column(name = "name")
    private String name;
    
    @Column(name = "contact")
    private String contact;
}
