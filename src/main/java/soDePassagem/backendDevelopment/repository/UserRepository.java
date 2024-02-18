package soDePassagem.backendDevelopment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import soDePassagem.backendDevelopment.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {}
