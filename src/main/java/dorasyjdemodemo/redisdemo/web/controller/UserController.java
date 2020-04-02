package dorasyjdemodemo.redisdemo.web.controller;

import dorasyjdemodemo.redisdemo.biz.entity.SuUser;
import dorasyjdemodemo.redisdemo.biz.util.Assert;
import dorasyjdemodemo.redisdemo.enums.ResultCodeEnum;
import dorasyjdemodemo.redisdemo.service.suUserService.SuUserService;
import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.xml.ws.RespectBinding;

/**
 * @Author: 陈兴德
 * @Date: 2020-03-17 15:11
 */
@RestController
@Slf4j
@RequestMapping("/suUser")
public class UserController {
    @Resource
    SuUserService suUserService;
    @RequestMapping("/getUserByMybatisPlus")
    public SuUser getUserByMybatisPlus(Integer id){
        Assert.isNull(id, ResultCodeEnum.CLIENT_PARAM_ERROR);
        log.info("执行getUserByMybatisPlus成功");
        return suUserService.selectById(id);
    }
    @RequestMapping("/getUserBysql")
    public SuUser getUsgetUserBysqler(Integer id){
        return suUserService.selectUserById(id);
    }

}
