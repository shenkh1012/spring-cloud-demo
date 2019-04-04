package com.shenkh.scd.greetingservice;

import org.springframework.http.HttpRequest;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
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
@RestController
public class GreetingController {
    private static final Logger l = Logger.getLogger(GreetingController.class.getName());

    private GreetingWordServiceAdaptor greetingWordService;

    public GreetingController(GreetingWordServiceAdaptor greetingWordService) {
        this.greetingWordService = greetingWordService;
    }

    @GetMapping
    public String greeting(HttpServletRequest request) {
        String locale = RequestContextUtils.getLocaleResolver(request).resolveLocale(request).toLanguageTag();
        l.info("Locale: " + locale);

        String greeting =  this.greetingWordService.getGreetingWord(locale) + " Kyle";
        l.info("Greeting: " + greeting);

        return greeting;
    }
}
