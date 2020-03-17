package dorasyjdemodemo.redisdemo.web.controller;

import dorasyjdemodemo.redisdemo.biz.RedisUtil;
import dorasyjdemodemo.redisdemo.biz.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RedisDemoController {
    //第一：在pom.xml文件配置springBoot-redis
    //第二：在配置文件：allpication.peiperties里面配置redis的地址链接账号与密码
    //第三：配置RedisConfig与redisService（redisUtil）
    //第四：测试：
    @Autowired
    private RedisUtil redisUtil;
    @RequestMapping("gteModel")
    public Result modelAndView(){
        redisUtil.set("祝", "陈");//设置
        System.out.println(redisUtil.get("祝"));//获取
        redisUtil.del("zhaoTest");//删除
        System.out.println(redisUtil.get("zhaoTest"));
        return new Result();

    }
}

