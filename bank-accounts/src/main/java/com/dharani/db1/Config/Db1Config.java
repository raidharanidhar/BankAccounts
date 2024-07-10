package com.dharani.db1.Config;

import java.util.HashMap;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

public class Db1Config {
	@Primary
	@Bean(name="datasource")
	@ConfigurationProperties(prefix="spring.db1.datasource")
	public DataSource datasource() {
		return DataSourceBuilder.create().build();
		
	}
	@Primary
	@Bean(name="entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder, 
			@Qualifier("datasource") DataSource datasource) {
		HashMap<String,Object> properties = new HashMap<>();
		properties.put("hibernskkate.hbm2ddl.auto","update" );
		
		return builder.dataSource(datasource)
					  .properties(properties)
					  .packages("com.dharani.db1.entity;")
					  .persistenceUnit("db1")
					  .build();
		
	}
	public PlatformTransactionManager transactionManager(@Qualifier("entityManagerFactory")EntityManagerFactory entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory);
		
	}
	

}
