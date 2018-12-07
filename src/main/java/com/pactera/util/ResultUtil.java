package com.pactera.util;

import com.pactera.constants.ResultConstant;

public class ResultUtil {

    public static Result<?> success(){
        return new Result<>(ResultConstant.SUCCESS_CODE,"成功！");
    }

    public static Result<?> success(String msg){
        return new Result<>(ResultConstant.SUCCESS_CODE,msg);
    }

    public static Result<?> success(String msg,Object data){
        return new Result<>(ResultConstant.SUCCESS_CODE,msg,data);
    }

    public static Result<?> failure(){
        return new Result<>(ResultConstant.FAIL_CODE,"失败！！");
    }

    public static Result<?> failure(String msg){
        return new Result<>(ResultConstant.FAIL_CODE,msg);
    }


}
