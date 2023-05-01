package com.brutus.abio.service;

import com.brutus.abio.armsoft.wsdl.tempuri.ITradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArmSoftService {

    private final ITradeService iTradeService;

    @Value("${armsoft.username}")
    private String username;
    @Value("${armsoft.password}")
    private String password;
    @Value("${armsoft.dbname}")
    private String dbName;

    public void createSaleDoc() {
        // Start the session
        String sessionId = iTradeService.startSession(username, password, dbName, "HY-ARM");

        // Stop the session
        iTradeService.stopSession(sessionId);
    }
}
