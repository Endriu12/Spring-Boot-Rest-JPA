package com.cusbee.repository;

import com.cusbee.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Endriu on 16.11.2016.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
