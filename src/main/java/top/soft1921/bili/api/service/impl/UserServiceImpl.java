package top.soft1921.bili.api.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.springframework.stereotype.Service;
import top.soft1921.bili.api.mapper.UserMapper;
import top.soft1921.bili.api.model.entity.User;
import top.soft1921.bili.api.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/9
 * @description :接口实现类
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    private UserMapper updateWrapper;

    @Override
    public List<User> selectAll() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("*");
        return userMapper.selectList(queryWrapper);

    }
    @Override
    public User getUserById(int userId) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",userId);
        User user = userMapper.selectOne(queryWrapper);
        return  user;
    }


        @Override
    public int updateUserById(User user) {

        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id", user.getId());
        updateWrapper.set("nickname",user.getNickname());
        return  userMapper.update(null,updateWrapper);
    }


}
