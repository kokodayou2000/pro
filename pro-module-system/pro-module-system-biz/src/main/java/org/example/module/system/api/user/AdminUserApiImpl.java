package org.example.module.system.api.user;

import jakarta.annotation.Resource;
import org.example.module.system.dal.dataobject.user.AdminUserDO;
import org.example.module.system.service.user.AdminUserService;
import org.example.modules.system.api.user.AdminUserApi;
import org.example.modules.system.api.user.dto.AdminUserRespDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;


@Service
public class AdminUserApiImpl implements AdminUserApi {

    @Resource
    private AdminUserService userService;

    @Override
    public AdminUserRespDTO getUser(String userId) {
        AdminUserDO userDO = userService.getUserByUsername("test");
        AdminUserRespDTO adminUserRespDTO = new AdminUserRespDTO();
        BeanUtils.copyProperties(userDO,adminUserRespDTO);
        return adminUserRespDTO;
    }
}
