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
@Table(name = "perfil")
@NoArgsConstructor
@AllArgsConstructor
public class Perfil {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_perf")
    private Long perfilId;

    @Column(name = "nome_perf")
    private String nomePerfil;

    @Column(name = "email")
    private String email;

    @Column(name = "senha", nullable = false)
    private String senha;
}
