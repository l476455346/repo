package cn.itcast;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes =SpringbootRedisApplication.class )
public class SpringbootRedisApplicationTests {



    private RedisTemplate<String,String> redisTemplate;

    @Test
    public void contextLoads() {
    }

}

