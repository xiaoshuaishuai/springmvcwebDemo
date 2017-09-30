package com.my.spring.boot.demo.starter.autoconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.my.spring.boot.demo.starter.InfoMessage;
import com.my.spring.boot.demo.starter.InfoMessageService;
@Configuration
@EnableConfigurationProperties(InfoMessage.class)//指定类的配置
@ConditionalOnClass(InfoMessageService.class)//当InfoMessageService在类路径中时并且当前容器中没有这个Bean的情况下,自动配置
//@ConditionalOnProperty(prefix = "github.shuai.message")//指定的属性是否有指定的值
public class InfoMessageAutoConfiguration {
	@Autowired
	private InfoMessage infoMessage;

	@Bean
	@ConditionalOnMissingBean(InfoMessageService.class) // 当容器中没有指定Bean的情况下
	public InfoMessageService infoMessageService() {
		InfoMessageService infoMessageService = new InfoMessageService(infoMessage);
		return infoMessageService;
	}
}
