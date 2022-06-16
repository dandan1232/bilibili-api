package top.soft1921.bili.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.soft1921.bili.api.model.entity.Rank;
import top.soft1921.bili.api.service.RankService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/12
 * @description :排行榜接口类
 */
@RestController
@RequestMapping(value = "api/rank")
@Api("排行榜相关接口")
public class RankController {
    @Resource
    private RankService rankService;

    @GetMapping("all")
    @ApiOperation("分页获取全站排行榜数据")
    public List<Rank> rankAll(
            @ApiParam("页码(默认第一页)")
            @RequestParam(name = "pageNum", defaultValue = "1", required = false) int pageNum,
            @ApiParam("每页数量(默认十条)")
            @RequestParam(name = "pageSize",defaultValue = "10", required = false) int pageSize){
        System.out.println(pageNum);
        return rankService.selectAll(pageNum, pageSize);
    }
}
