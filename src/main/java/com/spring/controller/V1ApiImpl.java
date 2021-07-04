package com.spring.controller;

import com.credit.api.V1Api;
import com.credit.dto.CreditDTO;
import com.credit.dto.InlineResponse200;
import com.credit.dto.InlineResponse2001;
import org.springframework.http.ResponseEntity;

public class V1ApiImpl implements V1Api {
    @Override
    public ResponseEntity<Void> createSchedule(CreditDTO creditDTO) {
        return null;
    }

    @Override
    public ResponseEntity<InlineResponse2001> getSchedule(String idProduct, String idSchedule) {
        return null;
    }

    @Override
    public ResponseEntity<InlineResponse200> getScheduleByIdClient(String idClient) {
        return null;
    }
}
