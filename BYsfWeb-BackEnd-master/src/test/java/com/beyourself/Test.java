package com.beyourself;

import com.beyourself.mapper.TestMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SpringBootTest
class SbvApplicationTests {
    @Autowired
    private TestMapper testMapper;
    @Test
    public void test(){
        for (com.beyourself.model.Test test : testMapper.selectList(null)) {
            System.out.println(test.toString());
        }
    }
}
