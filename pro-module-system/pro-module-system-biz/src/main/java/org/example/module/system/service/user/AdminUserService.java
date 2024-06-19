package org.example.module.system.service.user;


import org.example.module.system.dal.dataobject.user.AdminUserDO;

public interface AdminUserService {

    AdminUserDO getUserByUsername(String username);
}
