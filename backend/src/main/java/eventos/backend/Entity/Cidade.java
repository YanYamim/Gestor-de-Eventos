package eventos.backend.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cidade")
@NoArgsConstructor
@AllArgsConstructor
public class Cidade {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cid")
    private Long cidId;

    @Column(name = "nome_cid")
    private String nomeCid;

    @Column(name = "estado")
    private String estado;
}
