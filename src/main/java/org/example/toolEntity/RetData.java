//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example.toolEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

@ApiModel(
    value = "RetData",
    description = "返回结果集"
)
public class RetData<T> {
    @ApiModelProperty(
        value = "是否成功",
        example = "",
        required = false
    )
    private boolean success;
    @ApiModelProperty(
        value = "返回编码",
        example = "",
        required = false
    )
    private int rtnCode = 200;
    @ApiModelProperty(
        value = "提示消息",
        example = "",
        required = false
    )
    private String msg;
    @ApiModelProperty(
        value = "返回数据",
        example = "",
        required = false
    )
    private T data;

    public RetData() {
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getRtnCode() {
        return this.rtnCode;
    }

    public void setRtnCode(int rtnCode) {
        this.rtnCode = rtnCode;
    }

    public static RetData<Map<String, Object>> succuess(KeyValue... kvs) {
        RetData ret = new RetData();
        Map<String, Object> map = new HashMap();
        if (kvs != null) {
            KeyValue[] var3 = kvs;
            int var4 = kvs.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                KeyValue kv = var3[var5];
                map.put(kv.getKey(), kv.getValue());
            }
        }

        ret.setRtnCode(200);
        ret.setSuccess(true);
        ret.setData(map);
        return ret;
    }

    public static RetData<Map<String, Object>> succuess(KeyValue data) {
        RetData retData = new RetData();
        retData.setRtnCode(200);
        retData.setSuccess(true);
        if (data != null) {
            Map<String, Object> map = new HashMap();
            map.put(data.getKey(), data.getValue());
            retData.setData(map);
        }

        return retData;
    }

    public static <T> RetData<T> succuess(T data) {
        RetData retData = new RetData();
        retData.setRtnCode(200);
        retData.setSuccess(true);
        if (data != null) {
            retData.setData(data);
        }

        return retData;
    }

    public static RetData<Map<String, Object>> succuess(KeyValue data, String msg) {
        RetData retData = new RetData();
        retData.setRtnCode(200);
        retData.setSuccess(true);
        retData.setMsg(msg);
        if (data != null) {
            Map<String, Object> map = new HashMap();
            map.put(data.getKey(), data.getValue());
            retData.setData(map);
        }

        return retData;
    }

    public static <T> RetData<T> succuess(T data, String msg) {
        RetData retData = new RetData();
        retData.setRtnCode(200);
        retData.setSuccess(true);
        retData.setMsg(msg);
        if (data != null) {
            retData.setData(data);
        }

        return retData;
    }

    public static RetData error(String msg) {
        RetData data = new RetData();
        data.setSuccess(false);
        data.setRtnCode(505);
        data.setMsg(msg);
        return data;
    }

    public static <T> RetData<T> error(int code, String msg, T data) {
        RetData retData = new RetData();
        retData.setSuccess(false);
        retData.setRtnCode(code);
        retData.setMsg(msg);
        retData.setData(data);
        return retData;
    }

    public static RetData error(int code, String msg) {
        RetData retData = new RetData();
        retData.setSuccess(false);
        retData.setRtnCode(code);
        retData.setMsg(msg);
        return retData;
    }
}
