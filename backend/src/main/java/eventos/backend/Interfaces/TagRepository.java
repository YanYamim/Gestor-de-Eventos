package eventos.backend.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eventos.backend.Entity.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long>{
    
}
