package com.jumong.cloud_test.data.repositories;

import com.jumong.cloud_test.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
