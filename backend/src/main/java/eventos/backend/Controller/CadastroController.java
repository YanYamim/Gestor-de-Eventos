package eventos.backend.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eventos.backend.Entity.Perfil;
import eventos.backend.Services.CadastroService;
import lombok.AllArgsConstructor;

@RequestMapping("perfil")
@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class CadastroController {
    private CadastroService cadastroService;

    @PostMapping("cadastrar")
    public ResponseEntity<Perfil> cadastrarPerfil(@RequestBody Perfil perfil) {
        Perfil perfilCadastrado = cadastroService.cadastrarPerfil(perfil);
        return ResponseEntity.ok(perfilCadastrado);
    }
}
