package top.soft1921.bili.api.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Flobby
 */
@TableName(value = "t_type")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Type {
    /**
    * 主键id
    */
    private Long id;

    /**
    * 大分区类型
    */
    private Byte type;

    /**
    * 小分区主题
    */
    private String theme;
}