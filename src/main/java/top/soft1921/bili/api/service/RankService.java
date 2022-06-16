package top.soft1921.bili.api.service;

import top.soft1921.bili.api.model.entity.Rank;

import java.util.List;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/12
 * @description :排行榜服务接口
 */

public interface RankService {
    /**
     * 全站排行榜
     *
     * @param pageNum 当前页数
     * @param pageSize 一页显示几条
     * @return list
     */
    List<Rank> selectAll(int pageNum, int pageSize);
}
