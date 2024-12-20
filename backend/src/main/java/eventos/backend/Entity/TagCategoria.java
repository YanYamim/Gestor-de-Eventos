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
@Table(name = "tag_categoria")
@IdClass(CateTagId.class)
public class TagCategoria {
    
    @Id
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_tag")
    private Tag tagId;

    @Id
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_cat")
    private Categoria catId;

}
