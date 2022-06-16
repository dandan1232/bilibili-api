package top.soft1921.bili.api.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.soft1921.bili.api.model.entity.MustWatch;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class MustWatchServiceTest {

    @Resource
    private MustWatchService mustWatchService;

    @Test
    void selectAll() {
        List<MustWatch> mustWatchList = mustWatchService.selectAll(1,10);
        log.info(String.valueOf(mustWatchList.size()));
        assertEquals(10, mustWatchList.size());
    }
}