package com.mrock.drools.config;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

		@Configuration
		public class DroolsBeanFactory {			
			private KieServices kieServices = KieServices.Factory.get();
			private static final String RULE_PATH = "rules/CashbackPromotion.drl";
			
		    private KieFileSystem getKieFileSystem() {
		        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
		            kieFileSystem.write(ResourceFactory.newClassPathResource(RULE_PATH));
		        return kieFileSystem;
		    }
		    
			@Bean
			public KieContainer getKieContainer() {
				KieBuilder kb = kieServices.newKieBuilder(getKieFileSystem());
				kb.buildAll();
				KieModule kieModule = kb.getKieModule();
				KieContainer kContainer = kieServices.newKieContainer(kieModule.getReleaseId());
				return kContainer;

			}

		}
