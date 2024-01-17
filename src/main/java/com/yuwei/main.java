package com.yuwei;


import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class main {
    public static void main(String[] args) throws IOException, TemplateException {
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_32);
        configuration.setDefaultEncoding("UTF-8");
        configuration.setDirectoryForTemplateLoading(new File("D:/Develop/DynamicKit/DynamicKit/src/main/resources/templates"));

        Template template = configuration.getTemplate("MyWeb.html.ftl");
        HashMap<String, Object> map = new HashMap<>();
        map.put("name","张三");

        FileWriter fileWriter = new FileWriter("myweb.html");
        template.process(map,fileWriter);
        fileWriter.close();
    }
}
