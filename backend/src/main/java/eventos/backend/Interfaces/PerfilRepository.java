package eventos.backend.Interfaces;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import eventos.backend.Entity.Perfil;
import jakarta.persistence.LockModeType;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long> {
    @Lock(LockModeType.OPTIMISTIC)
    @Query("SELECT p FROM Perfil p WHERE p.id = :id")
    Optional<Perfil> findByIdWithLock(@Param("id") Long id);
    
}
