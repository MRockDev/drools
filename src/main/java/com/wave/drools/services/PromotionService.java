package com.wave.drools.services;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wave.drools.config.CashbackRulesConfig;
import com.wave.drools.model.CashBack;
import com.wave.drools.model.UserRequest;

@Service
public class PromotionService {
	@Autowired
	KieContainer kieContainer;
    @Autowired
    private CashbackRulesConfig rulesConfig;

	public CashBack checkPromotion (UserRequest userRequest) {
		CashBack cashBack = new CashBack();
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.setGlobal("cashBackObject", cashBack);
		kieSession.setGlobal("rulesConfig", rulesConfig);
		kieSession.insert(userRequest);
		kieSession.fireAllRules();
		kieSession.dispose();
		return cashBack;
	}

}
