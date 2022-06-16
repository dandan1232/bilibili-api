package top.soft1921.bili.api.service;

import top.soft1921.bili.api.model.entity.MustWatch;

import java.util.List;

/**
 * @author :LS
 * @version :1.0
 * @date :2021/4/12
 * @description :入站必看接口
 */
public interface MustWatchService {
    /**
     * 全站排行榜
     *
     * @param pageNum 页数
     * @param pageSize 一页显示几条
     * @return list
     */
    List<MustWatch> selectAll(int pageNum, int pageSize);
}
