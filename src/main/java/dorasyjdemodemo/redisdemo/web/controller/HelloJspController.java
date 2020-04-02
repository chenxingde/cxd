package dorasyjdemodemo.redisdemo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 陈兴德
 * @Date: 2020-04-02 20:57
 */
@Controller
@RequestMapping("/chen")
//如果是SpringBoot项目想要跳转到jsp页面必须使用@Controller注解，不能使用@RestController注解
//详情参考：https://blog.csdn.net/weixin_41086086/article/details/99593646博客
public class HelloJspController {
    @RequestMapping("/loveyujiao")
    public String getJsp(){
        return "login";
    }
}
