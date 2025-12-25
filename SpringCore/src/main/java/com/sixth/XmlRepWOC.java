package com.sixth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class XmlRepWOC {
	
//	@Bean
	public withoutXml getobj1() {
		withoutXml wx = new withoutXml();
		wx.display();

		return wx;
	}
	@Bean
	public withoutComponent getobj() {
		withoutComponent wc = new withoutComponent(20,getobj1());
		
		return wc;
	}

}

