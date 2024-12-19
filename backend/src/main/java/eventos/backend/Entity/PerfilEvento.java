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
@Table(name = "perfil_evento")
@IdClass(PerfEvenId.class)
public class PerfilEvento {
    
    @Id
    @ManyToMany
    @JsonIgnore
    @JoinColumn(name = "id_event")
    private Evento idEvento;

    @Id
    @ManyToMany
    @JsonIgnore
    @JoinColumn(name = "id_perf")
    private Perfil perfilId;
}