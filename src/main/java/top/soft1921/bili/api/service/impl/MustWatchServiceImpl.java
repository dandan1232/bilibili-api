package top.soft1921.bili.api.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;
import top.soft1921.bili.api.mapper.MustWatchMapper;
import top.soft1921.bili.api.model.entity.MustWatch;
import top.soft1921.bili.api.service.MustWatchService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MustWatchServiceImpl implements MustWatchService {

    @Resource
    private MustWatchMapper mustWatchMapper;

    @Override
    public List<MustWatch> selectAll(int pageNum, int pageSize) {
        QueryWrapper<MustWatch> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("*")
                .orderByAsc("id")
                .groupBy("pic");
        Page<MustWatch> page = new Page<>(pageNum, pageSize);
        mustWatchMapper.selectPage(page, queryWrapper);
        return page.getRecords();
    }
}
