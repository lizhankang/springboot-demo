package com.lizhankang.springbootdemo.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Tolerate;

//@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JsonResult<T> {
    private String code;
    private String msg;
    private T data;

    /**
     * 若没有数据返回，默认状态码为0，提示信息为：操作成功！
     */
//    @Tolerate
    public JsonResult() {
        this.code = "0";
        this.msg = "操作成功！";
    }

//    /**
//     * 若没有数据返回，可以人为指定状态码和提示信息
//     * @param code
//     * @param msg
//     */
//    @Tolerate
//    public JsonResult(String code, String msg) {
//        this.code = code;
//        this.msg = msg;
//    }

    /**
     * 有数据返回时，状态码为0，默认提示信息为：操作成功！
     * @param data
     */
//    @Tolerate
    public JsonResult(T data) {
        this.code = "0";
        this.msg = "操作成功！";
        this.data = data;
    }

    /**
     * 有数据返回，状态码为0，人为指定提示信息
     * @param data
     * @param msg
     */
//    @Tolerate
    public JsonResult(T data, String msg) {
        this.code = "0";
        this.msg = msg;
        this.data = data;
    }

}
