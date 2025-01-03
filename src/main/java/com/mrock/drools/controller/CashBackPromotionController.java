package com.mrock.drools.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mrock.drools.model.CashBack;
import com.mrock.drools.model.UserRequest;
import com.mrock.drools.services.PromotionService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CashBackPromotionController {
	
	private final PromotionService promotionService;

	@PostMapping("/check-promotion")
	public ResponseEntity<CashBack> checkPromotion(@RequestBody UserRequest userRequest) {
		CashBack cashBack =	promotionService.checkPromotion(userRequest);
		return new ResponseEntity<>(cashBack, HttpStatus.OK);
	}
}
