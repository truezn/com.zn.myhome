package com.zn.myhome.srv.profile.repository;

import com.zn.myhome.srv.profile.db.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{
    
}
