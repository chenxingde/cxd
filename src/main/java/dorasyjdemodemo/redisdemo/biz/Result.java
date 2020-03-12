package dorasyjdemodemo.redisdemo.biz;

import lombok.Data;

/**
 *
 * @param <T>
 */
@Data
public class Result <T>{
    /*
      0 成功
     */
    private int code = 0;
    /*
       返回说明
     */
    private String message;
    /*
      返回的数据
     */
    private T model;

    public Result() {
    }

    public Result(T model) {
        this.model = model;
    }

    public static <T> Result<T> with(T model) {
        return new Result(model);
    }

    public static <T> Result<T> empty() {
        return new Result();
    }

    public static Result with(int code, String msg) {
        Result r = new Result();
        r.setCode(code);
        r.setMessage(msg);
        return r;
    }

    public boolean success() {
        return code == 0;
    }

    public static Result buildFail(String msg) {
        Result r = new Result();
        r.setCode(-1);
        r.setMessage(msg);
        return r;
    }

    public static <T> Result<T> buildSuccess(T t) {
        Result r = new Result();
        r.setCode(0);
        r.setMessage("ok");
        r.setModel(t);
        return r;
    }



}
