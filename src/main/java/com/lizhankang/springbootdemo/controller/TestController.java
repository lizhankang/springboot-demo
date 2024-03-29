package com.lizhankang.springbootdemo.controller;

import com.lizhankang.springbootdemo.dto.request.ReqUser;
import com.lizhankang.springbootdemo.dto.response.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swagger")
@Api(value = "Swagger2 在线接口文档")
public class TestController {

    /*
    @Api 注解用于类上，表示标识这个类是 swagger 的资源。
    @ApiOperation 注解用于方法，表示一个 http 请求的操作。
    @ApiParam 注解用于参数上，用来标明参数信息。
     */

    @GetMapping("/get/{id}")
    @ApiOperation(value = "根据用户唯一标识获取用户信息")
    public JsonResult<ReqUser> getUserInfo(@PathVariable @ApiParam(value = "用户唯一标识") int id) {
        // 模拟数据库中根据id获取User信息
        ReqUser reqUser = new ReqUser(id, "测试", "123456");
        return new JsonResult(reqUser);
    }
}
