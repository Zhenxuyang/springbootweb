package com.zhenxuyang.springbootweb;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;

import java.util.Arrays;
import java.util.Collections;

public class CodeGenerator {

    private static final String username = System.getenv().get("USER");

    private static final String PROJECT_PATH = System.getProperty("user.dir");
    private static final String JAVA_PATH = "/src/main/java";
    private static final String RESOURCE_PATH = "/src/main/resources";
    private static final String BASE_PACKAGE = "com.zhenxuyang.springbootweb";

    /**
     * 数据库信息
     */
    private static final String DATABASE_IP = "121.4.192.38";
    private static final String DATABASE_PORT = "3306";
    private static final String DATABASE_NAME = "springbootweb";
    private static final String DATABASE_USERNAME = "root";
    private static final String DATABASE_PASSWORD = "zhen202452";
    private static final String URL =  String.format("jdbc:MysqL://%s:%s/%s?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai",
            DATABASE_IP, DATABASE_PORT, DATABASE_NAME);

    public static void main(String[] args) {
        FastAutoGenerator.create(URL, DATABASE_USERNAME, DATABASE_PASSWORD)
                .globalConfig(builder -> {
                    builder.author("zhenxuyang") // 设置作者
//                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride()
                            .outputDir(PROJECT_PATH + JAVA_PATH); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.zhenxuyang.springbootweb") // 设置父包名
//                            .moduleName("system") // 设置父包模块名
                            .entity("entity")
                            .service("service")
                            .mapper("mapper")
                            .controller("controller")
                            .serviceImpl("service.impl")
                            .pathInfo(Collections.singletonMap(OutputFile.xml,
                                    "D:\\project\\springbootweb\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude(Arrays.asList("m_user", "m_blog")) // 设置需要生成的表名
                            .addTablePrefix("m_"); // 设置过滤表前缀

                })
//                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
