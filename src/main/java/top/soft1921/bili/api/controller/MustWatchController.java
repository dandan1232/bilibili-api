package top.soft1921.bili.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.soft1921.bili.api.model.entity.MustWatch;
import top.soft1921.bili.api.service.MustWatchService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author :LS
 * @version :1.0
 * @date :2021/4/12
 * @description :入站必刷接口类
 */

@RestController
@RequestMapping(value = "api/mustwatch")
@Api("入站必刷相关接口")
public class MustWatchController {
    @Resource
    private MustWatchService mustWatchService;

    @GetMapping("all")
    @ApiOperation("分页获取入站必刷数据")
    public List<MustWatch> mustWatchesAll(
            @ApiParam("页码(默认第一页)")
            @RequestParam(name = "pageNum", defaultValue = "1", required = false) int pageNum,
            @ApiParam("每页数量(默认十条)")
            @RequestParam(name = "pageSize",defaultValue = "10", required = false) int pageSize){
        System.out.println(pageNum);
        return mustWatchService.selectAll(pageNum, pageSize);
    }
}
