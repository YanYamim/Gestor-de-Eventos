package eventos.backend.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eventos.backend.Entity.Tag;
import eventos.backend.Services.TagService;
import lombok.AllArgsConstructor;

@RequestMapping("/tags")
@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class TagController {
    private TagService tagService;

    @GetMapping("listar")
    public ResponseEntity<List<Tag>> listarTags() {
    List<Tag> tags = tagService.listarTags();

    for(Tag tag : tags) {
        System.out.println("ID: " + tag.getTagId() + "Nome" + tag.getTagNome());
    }

    return ResponseEntity.ok(tags);
    }
}
