package org.example.module.system.service.user;

import lombok.extern.slf4j.Slf4j;
import org.example.module.system.dal.dataobject.user.AdminUserDO;
import org.springframework.stereotype.Service;

@Service("adminUserService")
@Slf4j
public class AdminUserServiceImpl implements AdminUserService {

    @Override
    public AdminUserDO getUserByUsername(String username) {
        return new AdminUserDO("1","1","1");
    }
}
