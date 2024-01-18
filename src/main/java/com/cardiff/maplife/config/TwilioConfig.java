package com.cardiff.maplife.config;

import com.twilio.rest.conversations.v1.Role;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ConfigurationProperties("twilio")
public class TwilioConfig {
    private static final String account_SID = "AC9ae823ff5ee8a94680970b9fa9a72525";
    private static final String api_key = "SKd5e27d18f68df09e8b74e1a09d764748";
    private static final String api_secret = "isvulCw9DtV3pTFEOz8DAJfvef8aB7l9";
    // private static final String api_key = "SK2d1ac24d8326384f3852177c71c5db2e";
    // private static final String api_secret = "h2GJuQJiolGdH9R7rh9oOTWAhrp36mf3";
    private static final String token ="1f34f77af2e7366e74f522038b80b39d";
    private static final String chat_service_SID = "IS48b03cf21f4241abb3b80e01884e86da";
    public TwilioConfig() {
    }

    public String GetSID(){return account_SID;}
    public String GetAPI_Key(){return api_key;}
    public String GetAPI_Secret(){return api_secret;}
    public String GetToken(){return token;}
    public String GetChat(){return chat_service_SID;}

}
