package com.ssh.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class TestController extends ActionSupport {

    @Override
    public String execute() throws Exception {
        HttpServletResponse response = ServletActionContext.getResponse();
        HttpServletRequest request = ServletActionContext.getRequest();
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        Map<String, String> map = new HashMap<>();
        map.put("服务器系统名称", System.getProperty("os.name"));
        map.put("运行时环境版本", System.getProperty("java.version"));
        map.put("资源编码", "UTF-8");
        map.put("spring版本", "5.0.0.RELEASE");
        map.put("struts2版本", "2.5.13");
        map.put("hibernate版本", "5.2.11.Final");

        out.write(new ObjectMapper().writeValueAsString(map));
        out.flush();
        out.close();
        return ActionSupport.NONE;
    }
}
