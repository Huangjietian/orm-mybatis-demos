package cn.kerninventory.mybatis.gen.tkmybatis.gen;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public class MyBatisGeneratorRunner {

    public static void main(String[] args) {
        try {
            //如下三行代码是获取到配置文件的输入流，只要获取到配置文件的File实例或者输入流即可，方式任选
            ClassLoader classLoader = MyBatisGeneratorRunner.class.getClassLoader();
            URL url = classLoader.getResource("generator-config.xml");
            InputStream configInputStream = url.openStream();
            //warnings字符串集合用于存放生成过程中的警告信息，并非异常信息，所以可以按需输出
            List<String> warnings = new ArrayList<String>();
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configInputStream);
            //默认的shell命令回调，主要用于配置文件已存在时是否覆盖
            DefaultShellCallback callback = new DefaultShellCallback(true);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
            if (!warnings.isEmpty()) {
                String error = warnings.stream().collect(Collectors.joining(System.lineSeparator()));
                throw new IllegalArgumentException("代码生成警告：" + error);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
