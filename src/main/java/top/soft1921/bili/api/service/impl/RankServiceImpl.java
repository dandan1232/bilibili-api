package top.soft1921.bili.api.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;
import top.soft1921.bili.api.mapper.RankMapper;
import top.soft1921.bili.api.model.entity.Rank;
import top.soft1921.bili.api.service.RankService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/12
 * @description :实现类
 */
@Service
public class RankServiceImpl implements RankService {
    @Resource
    private RankMapper rankMapper;

    @Override
    public List<Rank> selectAll(int pageNum, int pageSize) {
        QueryWrapper<Rank> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("*")
                .orderByDesc("score")
                .groupBy("pic");
        Page<Rank> page = new Page<>(pageNum, pageSize);
        rankMapper.selectPage(page, queryWrapper);
        return page.getRecords();
    }
}