package org.example.module.system.dal.dataobject.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminUserDO {

    private String id;

    private String username;

    private String password;
}
