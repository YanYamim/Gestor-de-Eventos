package eventos.backend.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eventos.backend.Entity.Tag;
import eventos.backend.Interfaces.TagRepository;

@Service
public class TagService {
    private TagRepository tagRepository;

    @Autowired
    public TagService(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    public Tag preCadastradasags(Long tagId, String tagNome) {
        Tag novaTag = new Tag();
        novaTag.setTagNome("Festa");
        novaTag.setTagNome("Rock");
        novaTag.setTagNome("Show");
        novaTag.setTagNome("Pagode");
        Tag tagSalva = tagRepository.save(novaTag);
        return tagSalva;
    }

    public List<Tag> listarTags() {
        List<Tag> tags = tagRepository.findAll();
        return tags;
    }
}
