package dorasyjdemodemo.redisdemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import dorasyjdemodemo.redisdemo.biz.entity.SuUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.io.Serializable;


/**
 * @Author: 陈兴德
 * @Date: 2020-03-17 15:09
 */
@Mapper
public interface SuUserDao extends BaseMapper<SuUser>{
    @Select("select * from tbl_su_user where id = #{id}")
    SuUser selectUserById(int id);
}
