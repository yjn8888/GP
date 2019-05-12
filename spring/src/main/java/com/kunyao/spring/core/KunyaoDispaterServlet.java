package com.kunyao.spring.core;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(urlPatterns = "/*", initParams={
                            @WebInitParam(name="scanPackage",value="com.kunyao.spring")
                    })
public class KunyaoDispaterServlet extends HttpServlet {

    private List<String> classNameList = new ArrayList<String>();

    private Map<String,Object> ioc = new HashMap<String,Object>();

    private Map<String,Method> handleMapping = new HashMap<String, Method>();


    public void init(ServletConfig config){
//        //1、加载配置文件
//
//        doLoadConfig();

        //
        doScanner(config.getInitParameter("scanPackage"));

        //
        doInstance();

        //
        doAutowaire();

        //
        initHandlerMapping();
    }

    private void initHandlerMapping() {
    }

    private void doAutowaire() {
    }

    private void doInstance() {
    }

    private void doScanner(String scanPackages) {

    }

    private void doLoadConfig() {
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
    }
}
