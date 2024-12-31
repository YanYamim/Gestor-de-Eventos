package eventos.backend.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eventos.backend.Entity.Perfil;
import eventos.backend.Interfaces.PerfilRepository;

@Service
public class CadastroService {
    private PerfilRepository perfilRepository;

    @Autowired
    public CadastroService(PerfilRepository perfilRepository) {
        this.perfilRepository = perfilRepository;
    }

    public Perfil cadastrarPerfil(Perfil perfil) {
        return perfilRepository.save(perfil);
    }
}
