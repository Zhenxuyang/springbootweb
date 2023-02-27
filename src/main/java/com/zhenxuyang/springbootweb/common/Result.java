package com.zhenxuyang.springbootweb.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: zhenxuyang
 * @data: 2023/2/27
 * @time: 22:24
 * @description:
 */
@Data
public class Result implements Serializable {
    private int code;
    private String msg;
    private Object data;
    public static Result succ(Object data){
        Result m = new Result();
        m.setCode(0);
        m.setData(data);
        m.setMsg("操作成功");
        return m;
    }
    public static Result succ(String msg, Object data){
        Result m = new Result();
        m.setCode(1);
        m.setMsg(msg);
        m.setData(data);
        return m;
    }
    public static Result fail(String msg){
        Result m = new Result();
        m.setCode(-1);
        m.setMsg(msg);
        m.setData(null);
        return m;
    }
    public static Result fail(String msg, Object data){
        Result m = new Result();
        m.setCode(-1);
        m.setMsg(msg);
        m.setData(data);
        return m;
    }
}
