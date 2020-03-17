package dorasyjdemodemo.redisdemo.service.suUserService;

import dorasyjdemodemo.redisdemo.biz.entity.SuUser;
import dorasyjdemodemo.redisdemo.dao.SuUserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: 陈兴德
 * @Date: 2020-03-17 15:22
 */
@Service
public class SuUserServiceImpl implements SuUserService{
    @Resource
    SuUserDao suUserDao;
    @Override
    public SuUser selectById(int id) {//是呀mybatis查询。
        return suUserDao.selectById(id);
    }

    @Override
    public SuUser selectUserById(int id) {//自定义方法查询
        return suUserDao.selectUserById(id);
    }
}
