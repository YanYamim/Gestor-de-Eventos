package eventos.backend.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
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
    @ManyToMany
    @JsonIgnore
    @JoinColumn(name = "id_cid")
    private Long cidId;

    @Id
    @ManyToMany
    @JsonIgnore
    @JoinColumn(name = "id_event")
    private Long idEvento;
}
