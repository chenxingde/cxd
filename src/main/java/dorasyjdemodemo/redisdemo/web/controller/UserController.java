package dorasyjdemodemo.redisdemo.web.controller;

import dorasyjdemodemo.redisdemo.biz.entity.SuUser;
import dorasyjdemodemo.redisdemo.biz.util.Assert;
import dorasyjdemodemo.redisdemo.dao.SuUserDao;
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
    @Resource
    SuUserDao suUserDao;
    @RequestMapping("/insertSuUser")
    public int insertSuUser(){
        SuUser user=  new SuUser();
        user.setMobile("18257195118");
        user.setCardNumber("1234567890");
        user.setVipType((byte)1);
        log.info("执行insertSuUser");
        return suUserDao.insert(user);
    }
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
