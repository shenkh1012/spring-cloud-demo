package com.shenkh.scd.greetingservice;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.logging.Logger;

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
    private static final Logger l = Logger.getLogger(GreetingController.class.getName());

    private static final String GREETING_WORD_SERVICE_NAME = "GREETING-WORD-SERVICE";
    private RestTemplate restTemplate;
    private EurekaClient discoveryClient;

    public GreetingWordServiceAdaptor(RestTemplate restTemplate, EurekaClient discoveryClient) {
        this.restTemplate = restTemplate;
        this.discoveryClient = discoveryClient;
}

    public String getGreetingWord() {
        return this.restTemplate.getForObject(serviceUri(), String.class);
    }

    public String getGreetingWord(String languageCode) {
        String uri = serviceUri() + languageCode;
        l.info("Greeting Word: " + uri);

        return this.restTemplate.getForObject(uri, String.class);
    }

    @SuppressWarnings("unchecked")
    private String serviceUri() {
        List<InstanceInfo> list = discoveryClient.getApplication(GREETING_WORD_SERVICE_NAME).getInstances();
        if (list != null && list.size() > 0 ) {
            return list.get(0).getHomePageUrl();
        }
        return null;
    }
}
