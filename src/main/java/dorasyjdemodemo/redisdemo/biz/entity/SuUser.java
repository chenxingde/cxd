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
        private Long id;
        private String cardNumber;
        private String mobile;
        private Integer vipType;
        private Integer vipRedCount;
        private Float money;
        private Float hkMoney;
        private Float djMoney;
        private Float backHkMoney;
        private Float ygMoney;
        private Float yjSumMoney;
        private Float bzjMoney;
        private Float giftMoney;
        private Float giftMoneyRatio;
        private String loginPwd;
        private String payPass;
        private String realname;
        private String dzRealname;
        private String avatarImg;
        private String ykNumber;
        private String zshYkNumber;
        private Integer age;
        private Integer sex;
        private Long profession;
        private Long vocation;
        private String proviceName;
        private String cityName;
        private String cardid;
        private String accountName;
        private String bankCardNumber;
        private String bankOpenName;
        private String bankName;
        private String bankPhone;
        private String aygCardid;
        private String aygAccountName;
        private String aygBankCardNumber;
        private String aygOpenName;
        private String aygBankName;
        private String aygBankPhone;
        private String backHkCardid;
        private String backHkAccountName;
        private String backHkBankCardNumber;
        private String backHkBankOpenName;
        private String backHkBankName;
        private String backHkBankPhone;
        private Float balance;
        private Float rewardsBalance;
        private Float regBalance;
        private String authId;
        private String authType;
        private String regId;
        private Integer isLqred;
        private Integer isCj;
        private Integer cjNum;
        private Integer isOpen;
        private Integer isNew;
        private Integer myNum;
        private Integer mmOpen;
        private Float mmMoney;
        private String rokidAccount;
        private String rokidDeviceId;
        private String rokidDeviceType;
        private Integer scOpen;
        private Date createDateTime;
        private Date updateTime;
        private Date loginTime;
        private Date lastShopingTime;
        private Integer djStatus;
        private String fxCode;
        private Integer fxLeve;
        private Integer fxZtCount;
        private Integer fxJjCount;
        private Integer fxZtjlCount;
        private Integer isBgTjr;
        private String dzPayImg;
        private String dzPayNum;
        private String dzPayName;
        private String wxNumber;
        private String wxNickname;
        private String wxEwm;
        private Integer firstBa;
        private Integer secondBa;
        private Integer initMoney;
        private Integer gmDqStatus;
        private Integer aygDqStatus;
        private Integer status;
        private Integer txDzStatus;
        private Integer txHkStatus;
        private Integer backDzStatus;
        private Integer invalid;
        private Integer ztdzCount;
        private Integer jtdzCount;
        private String certificationCardId;
        private String certificationAccountName;
        private String certificationCardA;
        private String certificationCardB;
        private Boolean certificationStatus;
        private Integer unOnlineShopper;
        private Integer isOfficial;
        private Integer shopType;
        private Date recedeTime;
        private Integer vipGiftStatus;
        private Integer yyFirstFinish;
        private Integer xxdShopperMark;
}

