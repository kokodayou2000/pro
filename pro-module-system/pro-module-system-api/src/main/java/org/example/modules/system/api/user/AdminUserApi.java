package org.example.modules.system.api.user;

import org.example.modules.system.api.user.dto.AdminUserRespDTO;

public interface AdminUserApi {
    AdminUserRespDTO getUser(String userId);
}
