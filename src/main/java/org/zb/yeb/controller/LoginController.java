package org.zb.yeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zb.yeb.VO.AdminLoginParam;
import org.zb.yeb.entity.Admin;
import org.zb.yeb.entity.RespBean;
import org.zb.yeb.service.IAdminService;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@RestController
public class LoginController {
    @Autowired
    private IAdminService adminService;
    @PostMapping("/login")
    public RespBean login(AdminLoginParam adminLoginParam, HttpServletRequest request){
        return adminService.login(adminLoginParam.getUsername(),adminLoginParam.getPassword(),request);
    }
    @PostMapping("/logout")
    public RespBean logout(){
        return RespBean.success("注销成功");
    }
    @GetMapping("/admin/info")
    public Admin getAdminInfo(Principal principal){
        if(null==principal){
            return null;
        }
        String username = principal.getName();
        Admin admin =adminService.getAdminByUsername(username);
        admin.setPassword(null);
        return admin;
    }
}
