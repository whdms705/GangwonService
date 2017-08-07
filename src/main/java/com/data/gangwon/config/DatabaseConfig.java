package com.data.gangwon.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@Configuration
//@MapperScan(basePackage="")
@EnableTransactionManagement
public class DatabaseConfig {
	
	@Bean
	public DataSource dataSource(Environment environment){
		BasicDataSource dataSource = new BasicDataSource();
		  dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		  dataSource.setUrl("jdbc:mysql://13.114.79.230:3306/gangwon?useUnicode=true&characterEncoding=utf8");
		  dataSource.setUsername("");
		  dataSource.setPassword("");
		  return dataSource;  
	
	}
	
	
	@Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sessionFactory.setMapperLocations(resolver.getResources("classpath:com/data/gangwon/mapper/*.xml"));
        return sessionFactory.getObject();
    }
    
    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) throws Exception {
      final SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory);
      return sqlSessionTemplate;
    }

}
