package org.zb.yeb.service;

import org.zb.yeb.entity.Admin;
import org.zb.yeb.entity.RespBean;

import javax.servlet.http.HttpServletRequest;

public interface IAdminService {

    RespBean login(String username, String password, HttpServletRequest request);

    Admin getAdminByUsername(String username);
}