package com.webank.bdp.service;

import com.webank.bdp.domain.User;

public interface UserService {
    User getUserById(Integer id);

    void updateAge(int i, int i1);
}
