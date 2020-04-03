package dorasyjdemodemo.redisdemo.biz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: 陈兴德
 * @Date: 2020-03-17 15:03
 */
@Data
@TableName(value = "tbl_su_user")//mybatisPlus会自动找到这个表，如果不写这个注释的话，会去找su_user这个表。
public class SuUser {
        private static final long serialVersionUID = 1L;
        //此处是为了设置id手动自增长
        @TableId(value = "id",type = IdType.INPUT)
        private Integer id;
        private String cardNumber;
        private String mobile;
        private Byte vipType;
        private Float money;
        private Data createDateTime;
        private Data updateTime;
        private Byte status;
        private Byte invalid;
}

