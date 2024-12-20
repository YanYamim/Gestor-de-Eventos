package eventos.backend.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "evento")
@IdClass(EvenCidId.class)
public class CidadeEvento {
    
    @Id
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_cid")
    private Cidade cidId;

    @Id
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_event")
    private Evento idEvento;
}
