package com.pactera.sys.service;

import com.pactera.sys.model.SysUser;
import com.pactera.util.Result;

public interface SysUserService {
    Result exists(SysUser sysUser);

    Result signIn(SysUser sysUser);
}
