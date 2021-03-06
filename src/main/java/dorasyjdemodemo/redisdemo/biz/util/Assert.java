package dorasyjdemodemo.redisdemo.biz.util;

import dorasyjdemodemo.redisdemo.enums.ResultCodeEnum;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

/**
 * @author jzl
 * @create 2019-07-06
 **/
public class Assert {

    public static void isTrue(boolean express, ResultCodeEnum resultCodeEnum) {
        if (express) {
            resultCodeEnum.throwIt();
        }
    }

    public static void notTrue(boolean express, ResultCodeEnum resultCodeEnum) {
        if (!express) {
            resultCodeEnum.throwIt();
        }
    }

    public static void isNull(Object object, ResultCodeEnum resultCodeEnum) {
        if (object == null) {
            resultCodeEnum.throwIt();
        }
    }

    public static void notNull(Object object, ResultCodeEnum resultCodeEnum) {
        if (object != null) {
            resultCodeEnum.throwIt();
        }
    }

    public static void isEquals(Object one, Object two, ResultCodeEnum resultCodeEnum) {
        if (Objects.equals(one, two)) {
            resultCodeEnum.throwIt();
        }
    }

    public static void notEquals(Object one, Object two, ResultCodeEnum resultCodeEnum) {
        if (!Objects.equals(one, two)) {
            resultCodeEnum.throwIt();
        }
    }

    public static void notEmpty(String object, ResultCodeEnum resultCodeEnum) {
        if (StringUtils.isNotEmpty(object)) {
            resultCodeEnum.throwIt();
        }
    }

    public static void isEmpty(String object, ResultCodeEnum resultCodeEnum) {
        if (StringUtils.isEmpty(object)) {
            resultCodeEnum.throwIt();
        }
    }
}
