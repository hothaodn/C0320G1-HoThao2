package com.meomeo.authorization.repository;

import com.meomeo.authorization.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

	User findByEmail(String email);

}
