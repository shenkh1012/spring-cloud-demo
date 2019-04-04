package com.shenkh.scd.greetingservice;

import org.springframework.stereotype.Service;

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
    private GreetingWordClient greetingWordClient;

    public GreetingWordServiceAdaptor(GreetingWordClient greetingWordClient) {
        this.greetingWordClient = greetingWordClient;
    }

    public String getGreetingWord(String languageCode) {
        return this.greetingWordClient.getGreetingWord(languageCode);
    }
}
