package top.soft1921.bili.api.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Flobby
 */
@TableName(value = "t_swiper")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Swiper {
    /**
    * 主键id
    */
    private Long id;

    /**
    * 图片地址
    */
    private String url;

    /**
    * 图片描述
    */
    private String description;
}