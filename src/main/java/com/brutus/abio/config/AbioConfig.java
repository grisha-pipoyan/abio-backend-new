package com.brutus.abio.config;

import com.brutus.abio.armsoft.wsdl.tempuri.ITradeService;
import com.brutus.abio.armsoft.wsdl.tempuri.TradeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Configuration
public class AbioConfig {

    @Bean
    public ITradeService iTradeService(){
        TradeService tradeService = new TradeService();
        return tradeService.getBasicHttpBindingITradeService();
    }

    @Bean
    public Map<String, String> propertiesMap() {
        Properties props1 = new Properties();
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("category1.properties")) {
            assert inputStream != null;
            InputStreamReader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            props1.load(reader);
        } catch (Exception e) {
            // Handle the exception
        }

        Properties props2 = new Properties();
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("category2.properties")) {
            assert inputStream != null;
            InputStreamReader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            props2.load(reader);
        } catch (Exception e) {
            // Handle the exception
        }

        Properties props3 = new Properties();
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("category3.properties")) {
            assert inputStream != null;
            InputStreamReader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            props3.load(reader);
        } catch (Exception e) {
            // Handle the exception
        }

        Map<String, String> propertiesMap = new HashMap<>();
        for (String key : props1.stringPropertyNames()) {
            String value = props1.getProperty(key);
            propertiesMap.put(key, value);
        }
        for (String key : props2.stringPropertyNames()) {
            String value = props2.getProperty(key);
            propertiesMap.put(key, value);
        }
        for (String key : props3.stringPropertyNames()) {
            String value = props3.getProperty(key);
            propertiesMap.put(key, value);
        }

        return propertiesMap;
    }

}
