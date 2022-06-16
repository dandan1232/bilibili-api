package top.soft1921.bili.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import top.soft1921.bili.api.model.entity.User;
import top.soft1921.bili.api.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/9
 * @description :用户模块接口
 */

@RestController
@RequestMapping(value = "api/user")
@Api(tags = "用户模块管理接口")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("all")
    @ApiOperation("获取所有用户信息")
    public List<User> getUserList(){
        return userService.selectAll();

    }
    @GetMapping("{id}")
    @ApiOperation("根据id查询信息")
    public User getById(@PathVariable("id") int id){
        return userService.getUserById(id);
    }

    @RequestMapping("update")
    @ApiOperation("根据id修改信息")
    public int updateById(@RequestBody User user){
        return userService.updateUserById(user);
    }

}
