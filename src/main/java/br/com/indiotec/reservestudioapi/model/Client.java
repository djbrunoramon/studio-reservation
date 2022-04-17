package br.com.indiotec.reservestudioapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "client")
public class Client extends AbstractEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;
    
    @Column(name = "create_at")
    private LocalDateTime createAt;
    
    @Column(name = "active")
    private boolean active;
    
    @Column(name = "inactive_in")
    private LocalDateTime inactiveIn;
    
    @OneToMany(mappedBy = "client")
    private List<ClientContact> contacts;
}
