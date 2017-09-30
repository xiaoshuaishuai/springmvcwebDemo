package com.my.spring.boot.demo.starter;
/**
 * starter对外提供的service
 * @author shuaishuaixiao
 *
 */
public class InfoMessageService {

	private InfoMessage infoMessage;

	public InfoMessageService(InfoMessage infoMessage) {
		this.infoMessage = infoMessage;
	}

	public InfoMessageService() {
	}
	
	public String getName() {
		return infoMessage.getName();
	}
	public int getAge() {
		return infoMessage.getAge();
	}
	public String getEmail() {
		return infoMessage.getEmail();
	}
}
