package cn.kerninventory.mybatis.gen.mybatisplus.gen;

import cn.kerninventory.mybatis.gen.mybatisplus.pojo.BaseEntity;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public class MybatisPlusGeneratorRunner {

    public static void main(String[] args) {
        AutoGenerator generator = new AutoGenerator();
        //配置数据库连接参数
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUrl("jdbc:mysql://127.0.0.1:3306/mybatis-gen-demo?serverTimezone=UTC");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("root");
        generator.setDataSource(dataSourceConfig);

        //配置文件生成路径参数
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("cn.kerninventory.mybatis.gen.mybatisplus");
        packageConfig.setEntity("pojo");
        packageConfig.setMapper("mapper");
        packageConfig.setXml("xml");
        generator.setPackageInfo(packageConfig);

        //策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        //pojo类超类
        strategyConfig.setSuperEntityClass(BaseEntity.class);
        //字段驼峰命名
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        //set方法builder模式
        strategyConfig.setChainModel(true);
        //要生成的表名
        strategyConfig.setInclude("test");
        generator.setStrategy(strategyConfig);

        //全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        //输出目录
        globalConfig.setOutputDir(System.getProperty("user.dir") + "/gen-mybatisplus/src/main/java");
        globalConfig.setAuthor("MPG");
        generator.setGlobalConfig(globalConfig);
        generator.execute();
    }
}
