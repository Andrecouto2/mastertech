package br.com.couto.mastertech.api.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.couto.mastertech.api.user.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}