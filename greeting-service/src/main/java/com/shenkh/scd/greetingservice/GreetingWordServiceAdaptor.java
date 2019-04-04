package com.shenkh.scd.greetingservice;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * <p>(C) 2003 Delphi Technology, inc. (dti)</p>
 * Date:   4/4/2019
 *
 * @author kshen
 */
/*
 *
 * Revision Date    Revised By  Description
 * ---------------------------------------------------
 *
 * ---------------------------------------------------
 */
@Service
public class GreetingWordServiceAdaptor {
    private static final String GREETING_WORD_SERVICE_ENDPOINT = "http://localhost:8002";
    private RestTemplate restTemplate;

    public GreetingWordServiceAdaptor(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getGreetingWord() {
        return this.restTemplate.getForObject(GREETING_WORD_SERVICE_ENDPOINT, String.class);
    }

    public String getGreetingWord(String languageCode) {
        return this.restTemplate.getForObject(GREETING_WORD_SERVICE_ENDPOINT + "/" + languageCode, String.class);
    }
}
