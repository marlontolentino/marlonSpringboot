package com.portfolio.marlonSpringboot.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.portfolio.marlonSpringboot.entities.UserData;

@Repository
public interface UserRepository extends JpaRepository<UserData, Integer> {

	public UserData findByUsername(String username);

	public UserData findByEmail(String email);

	public List<UserData> findAll();

}
