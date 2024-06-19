package org.example.module.system.controller.admin.user;

import jakarta.annotation.Resource;
import org.example.module.system.dal.dataobject.user.AdminUserDO;
import org.example.module.system.service.user.AdminUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system/user")
public class UserController {

    @Resource
    private AdminUserService userService;

    @GetMapping("/get")
    public AdminUserDO getUser(){
        return userService.getUserByUsername("");
    }

}
