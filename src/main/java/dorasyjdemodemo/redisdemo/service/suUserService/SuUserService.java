package dorasyjdemodemo.redisdemo.service.suUserService;

import dorasyjdemodemo.redisdemo.biz.entity.SuUser;

/**
 * @Author: 陈兴德
 * @Date: 2020-03-17 15:20
 */
public interface SuUserService {
    SuUser selectById(int id);
    SuUser selectUserById(int id);
}
