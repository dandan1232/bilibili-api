package top.soft1921.bili.api.service;

import top.soft1921.bili.api.model.entity.User;

import java.util.List;

/**
 * @author :Flobby
 * @date :2021/4/9
 */
public interface UserService {
    /**
     * 查询全部用户信息
     * @return
     */
    List<User> selectAll();
    /**
     * 根据id查询用户信息
     */
    User getUserById(int userId);
    /**
     * 根据id修改用户信息
     *
     *
     */
    int updateUserById(User user);

}
