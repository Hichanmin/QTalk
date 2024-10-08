package org.example.qtalk.Repository;

import org.example.qtalk.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository  extends JpaRepository<UserEntity, Long> {

}
