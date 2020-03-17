package dorasyjdemodemo.redisdemo.enums;


import dorasyjdemodemo.redisdemo.biz.util.BizException;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum ResultCodeEnum {

    INNER_ERROR(-1, "内部错误"),
    DATE_INFO_ERROR(-2, "数据信息异常"),

    PASSWORD_RESTRICT(1000,"当日密码错误次数已达上限"),
    NOT_LOGIN(1001, "用户未登录"),
    USER_NOT_EXIST(1002, "用户不存在"),
    PASSWORD_ERROR(1003, "密码错误"),
    PASSWORD_BEYOND(1004, "密码重试次数过多,请稍后再试"),
    USER_INVALID(1005, "用户被冻结"),
    CHECK_CODE_ERROR(1006, "验证码有误"),
    TOKEN_ERROR(1007, "TOKEN错误"),
    NOT_AUTH(1008, "用户无权限"),
    NOT_ZC(1009, "该用户没有注册"),

    CLIENT_PARAM_ERROR(1010, "客户端参数错误!"),
    MOBILE_FORMAT_ERROR(1011, "手机号格式错误!"),
    PASSWORD_FORMAT_ERROR(1012, "密码格式错误!"),
    CMS_USER_INFO_ERROR(1013, "员工信息不存在!"),
    MOBILE_REPETITION_ERROR(1014, "手机号重复!"),
    CMS_USER_DISABLE_ERROR(1015, "该员工已被禁用!"),
    CMS_USER_DELETE_ERROR(1016, "该员工已被删除!"),
    CMS_USER_ENABLE_ERROR(1017, "该员工已激活!"),
    USER_ALREADY_EXIST(1018, "用户已存在!"),
    XXD_PICTURE_SIZE_ERROR(1043, "图片超过10M无法上传!"),

    /**
     * 线下店主相关
     */
    XXD_SHOPPER_STATUS_ERROR(5001,"线下店主转态异常");
	
    private static Map<Integer, ResultCodeEnum> lookup;

    static {
        lookup = new HashMap<>();
        Arrays.stream(values()).forEach(e -> lookup.put(e.code, e));
        lookup = Collections.unmodifiableMap(lookup);
    }

    private Integer code;

    private String msg;

    ResultCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public ResultCodeEnum setMessage(String msg) {
        this.msg = msg;
        return this;
    }

    public void throwIt() {
        throw new BizException(code, msg);
    }

    public BizException getError() {
        throw new BizException(code, msg);
    }

    public static ResultCodeEnum of(Integer code) {
        return lookup.get(code);
    }

    public static String find(Integer code) {
        return of(code).getMsg();
    }
}
