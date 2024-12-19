package eventos.backend.Entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class PerfEvenId implements Serializable{
    private Long perfilId;
    private Long idEvento;

    public PerfEvenId() {};
}
