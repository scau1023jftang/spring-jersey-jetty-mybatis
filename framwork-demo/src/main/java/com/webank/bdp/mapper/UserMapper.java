package com.webank.bdp.mapper;

import com.webank.bdp.domain.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User seletctUserById(Integer id);

    void updaAgeById(@Param("id") int id, @Param("age") int age);
}
