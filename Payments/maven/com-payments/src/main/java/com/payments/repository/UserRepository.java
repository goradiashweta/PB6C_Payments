package com.payments.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.payments.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
//	Optional<User> findByUserIdAndPassword(int id, String password);
//	findById 
//	findAll
//	insert 
//	update 
//	delete

//	public abstract List<User> findByFirstName(String firstName);

}
