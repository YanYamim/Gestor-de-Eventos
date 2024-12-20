package eventos.backend.Entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Embeddable
@EqualsAndHashCode
@NoArgsConstructor
public class CateTagId implements Serializable {
    private Long tagId;
    private Long catId;

}
