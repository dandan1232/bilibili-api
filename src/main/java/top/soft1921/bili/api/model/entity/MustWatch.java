package top.soft1921.bili.api.model.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Flobby
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("入站必刷")
@TableName(value = "t_must_watch")
public class MustWatch {
    /**
    * 主键id
    */
    @ApiModelProperty("视频主键")
    private Integer id;

    /**
    * up主id
    */
    @ApiModelProperty("up主id")
    private Integer userId;

    /**
    * 播放量
    */
    @ApiModelProperty("播放量")
    private Integer view;

    /**
    * 弹幕数
    */
    @ApiModelProperty("弹幕数量")
    private Integer danmaku;

    /**
    * 收藏
    */
    @ApiModelProperty("收藏数量")
    private Integer favorite;

    /**
    * 硬币
    */
    @ApiModelProperty("投币数量")
    private Integer conis;

    /**
    * 分享
    */
    @ApiModelProperty("转发数量")
    private Integer share;

    /**
    * 点赞
    */
    @ApiModelProperty("点赞数量")
    private Integer like;

    /**
    * 时长（s）
    */
    @ApiModelProperty("视频总时长")
    private Integer duration;

    /**
    * 发布时间
    */
    @ApiModelProperty("发布时间")
    private Date pubdate;

    /**
    * 标题
    */
    @ApiModelProperty("视频标题")
    private String title;

    /**
    * 视频封面
    */
    @ApiModelProperty("视频封面")
    private String pic;

    /**
    * 成就
    */
    @ApiModelProperty("视频成就")
    private String achievent;
}