package com.spring.test;

public class Communication {
	private Messaging messaging;
	private Encryption encryption;
	
	public Communication(Encryption encryption) {
		this.encryption = encryption;
	}
	
	public void setMessaging(Messaging messaging) {
		this.messaging = messaging;
	}
	
	public void comminucate() {
		encryption.encryptData();
		messaging.sendMessage();
	}
}
