package com.han.cloud.repository;

import com.han.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UserRepositorry
 * @Description TODO
 * @Author hanyf
 * @Date 2018\11\4 0004 14:10
 * @Version 1.0
 **/
@Repository
public interface UserRepositorry extends JpaRepository<User, Long> {

}
