package com.kgisl.springbeanscope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class Language {
	private String language = "English";

	public Language() {
		System.out.println("Create new Language: " + this.language);
	}

	public String getLanguage() {
		return language;
	}

	public String setLanguage(String language) {
		this.language = language;
		return this.language;
	}

}
