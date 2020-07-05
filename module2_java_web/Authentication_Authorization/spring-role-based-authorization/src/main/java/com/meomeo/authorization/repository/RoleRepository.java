package com.meomeo.authorization.repository;

import com.meomeo.authorization.domain.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Integer> {

	Role findByName(String name);
	
}
