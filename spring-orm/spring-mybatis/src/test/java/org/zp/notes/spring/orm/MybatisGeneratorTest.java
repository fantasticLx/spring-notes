/**
 * The Apache License 2.0
 * Copyright (c) 2016 victor zhang
 */
package org.zp.notes.spring.orm;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 如果不使用maven插件mybatis-generator-maven-plugin调用mybatis-generator生成代码，也可以使用Java代码来生成
 * @author victor zhang
 * @date 2017/4/13.
 */
public class MybatisGeneratorTest {
    public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("D:\\01_Workspace\\Project\\zp\\java\\spring-notes\\spring-orm\\spring-mybatis\\src\\main\\resources\\mybatis\\generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
}
