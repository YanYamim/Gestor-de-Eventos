package eventos.backend.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "evento")
@NoArgsConstructor
@AllArgsConstructor
public class Evento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_event")
    private Long idEvento;

    @ManyToMany
    @JoinColumn(name = "id_tag", referencedColumnName = "id_tag")
    private Tag idTag;

    @Column(name = "nome_event")
    private String nomeEvento;

    @Column(name = "data")
    private Date data;

    @Column(name = "preco")
    private double precoEvento;
}
