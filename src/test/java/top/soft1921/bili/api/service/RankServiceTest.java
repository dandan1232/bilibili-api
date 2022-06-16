package top.soft1921.bili.api.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.soft1921.bili.api.model.entity.Rank;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class RankServiceTest {
    @Resource
    private RankService rankService;

    @Test
    void selectAll() {
        List<Rank> rankList = rankService.selectAll(1, 10);
        log.info(String.valueOf(rankList.size()));
        assertEquals(10, rankList.size());
    }
}