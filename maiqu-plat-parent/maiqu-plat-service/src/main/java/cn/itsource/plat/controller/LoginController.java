package cn.itsource.plat.controller;

import cn.itsource.basic.util.AjaxResult;

import cn.itsource.plat.domain.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @PostMapping("/login")
    public AjaxResult login(@RequestBody User user){
        //设定假数据登陆
        System.out.println(123456);
        String username = user.getUsername();
        String password = user.getPassword();
        //判断登陆
        if("admin".equals(username)&&"admin".equals(password)){
            return AjaxResult.me().setSuccess(true).setMessage("登陆成功").setRestObj(user);
        }
        return AjaxResult.me().setSuccess(false).setMessage("登陆失败ssssssssss");
    }
}
