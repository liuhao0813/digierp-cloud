package com.digierp.common.dto;

import com.digierp.common.constants.CommonConstants;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 响应信息主体
 * @param <T>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ApiModel(description = "响应信息主体")
public class SimpleResponse<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "返回标记：成功=0，失败=1")
    private int code;

    @ApiModelProperty(value = "返回信息")
    private String msg;


    @ApiModelProperty(value = "数据")
    private T data;

    public Boolean isOk() {
        if(code!= 0){
            return false;
        }else{
            return true;
        }
    }

    public static <T> SimpleResponse<T> ok() {
        return restResult(null, CommonConstants.SUCCESS, null);
    }

    public static <T> SimpleResponse<T> ok(T data) {
        return restResult(data, CommonConstants.SUCCESS, null);
    }

    public static <T> SimpleResponse<T> ok(T data, String msg) {
        return restResult(data, CommonConstants.SUCCESS, msg);
    }

    public static <T> SimpleResponse<T> failed() {
        return restResult(null, CommonConstants.FAIL, null);
    }

    public static <T> SimpleResponse<T> failed(String msg) {
        return restResult(null, CommonConstants.FAIL, msg);
    }

    public static <T> SimpleResponse<T> failed(T data) {
        return restResult(data, CommonConstants.FAIL, null);
    }

    public static <T> SimpleResponse<T> failed(T data, String msg) {
        return restResult(data, CommonConstants.FAIL, msg);
    }

    public static <T> SimpleResponse<T> failed(T data, int code, String msg) {
        return restResult(data, code, msg);
    }

    public static <T> SimpleResponse<T> failed(int code, String msg) {
        return restResult(null, code, msg);
    }

    private static <T> SimpleResponse<T> restResult(T data, int code, String msg) {
        SimpleResponse<T> apiResult = new SimpleResponse<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }
}
