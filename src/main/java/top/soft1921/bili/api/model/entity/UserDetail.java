package top.soft1921.bili.api.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Flobby
 */
@TableName(value = "t_user_detail")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDetail {
    /**
    * 主键id
    */
    private Long id;

    /**
    * 用户id
    */
    private Long userId;

    /**
    * 性别
    */
    private Byte gender;

    /**
    * 背景图
    */
    private String banner;

    /**
    * 投稿数
    */
    private Integer sendNumber;

    /**
    * 频道数
    */
    private Integer partitionNumber;

    /**
    * 关注数
    */
    private Integer followNumber;

    /**
    * 粉丝数
    */
    private Integer fans;

    /**
    * 获赞数
    */
    private Long likes;

    /**
    * 播放数
    */
    private Long playNumber;

    /**
    * 阅读数
    */
    private Integer reads;

    /**
    * 收藏数
    */
    private Integer favorites;
}