package eventos.backend.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eventos.backend.Entity.Perfil;
import eventos.backend.Interfaces.PerfilRepository;
import jakarta.transaction.Transactional;

@Service
public class CadastroService {
    private PerfilRepository perfilRepository;

    @Autowired
    public CadastroService(PerfilRepository perfilRepository) {
        this.perfilRepository = perfilRepository;
    }

    @Transactional
    public Perfil cadastrarPerfil(Perfil novoPerfil) {
        return perfilRepository.save(novoPerfil);
    }
}
