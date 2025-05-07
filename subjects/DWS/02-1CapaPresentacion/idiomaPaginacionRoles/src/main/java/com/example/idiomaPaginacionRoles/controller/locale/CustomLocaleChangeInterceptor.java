package com.example.idiomaPaginacionRoles.controller.locale;

import java.util.Locale;

import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CustomLocaleChangeInterceptor extends LocaleChangeInterceptor {

    private final String defaultLanguage;

    public CustomLocaleChangeInterceptor(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }

    @Override
    public boolean preHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler)
            throws ServletException {

        String lang = request.getHeader("Accept-Language");
        Locale locale = lang != null ? Locale.forLanguageTag(lang) : Locale.of(defaultLanguage);

        LanguageUtils.setCurrentLocale(locale);

        return super.preHandle(request, response, handler);
    }

}
