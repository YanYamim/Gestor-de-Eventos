package eventos.backend.Entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class EvenCidId implements Serializable{
    private Long idEvento;
    private Long cidId;

    public EvenCidId() {}

    
}
