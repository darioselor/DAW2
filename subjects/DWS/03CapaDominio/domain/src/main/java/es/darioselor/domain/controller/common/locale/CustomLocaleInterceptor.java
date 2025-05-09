package es.darioselor.domain.controller.common.locale;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

import java.util.Locale;

public class CustomLocaleInterceptor extends LocaleChangeInterceptor {

    private final String defaultLanguage;

    public CustomLocaleInterceptor(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }

    @Override
    public boolean preHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler
    ) throws ServletException {
        String lang = request.getHeader("Accept-Language");
        Locale locale = lang != null ? Locale.forLanguageTag(lang) : Locale.of(defaultLanguage);

        LanguageUtils.setCurrentLocale(locale);

        return super.preHandle(request, response, handler);
    }
}
