package top.soft1921.bili.api.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**

@author 231
@description ${description}
@date 2021-04-11 23:25

*/
@TableName(value = "t_other_rank")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OtherRank {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 标志
    */
    private String badge;

    /**
    * 封面
    */
    private String cover;

    /**
    * 手机端描述
    */
    private String desc;

    /**
    * 电脑端描述
    */
    private String indexShow;

    /**
    * 综合评分
    */
    private Integer score;

    /**
    * 排名
    */
    private Integer rank;

    /**
    * 弹幕量
    */
    private Integer danmaku;

    /**
    * 收藏量
    */
    private Integer follow;

    /**
    * 追番人数
    */
    private Integer seriesFollow;

    /**
    * 观看数量
    */
    private Integer view;

    /**
    * 标题
    */
    private String title;

    /**
    * 分区
    */
    private Byte type;
}