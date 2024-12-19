package eventos.backend.Entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class CateTagId implements Serializable {
    private Long tagId;
    private Long catId;

    public CateTagId() {};

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        CateTagId that = (CateTagId) o;
        return Objects.equals(tagId, that.tagId) && Objects.equals(catId, that.catId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagId, catId);
    }
}
