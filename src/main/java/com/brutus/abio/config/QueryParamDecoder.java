package com.brutus.abio.config;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.util.UriUtils;

import java.nio.charset.StandardCharsets;

@ControllerAdvice
public class QueryParamDecoder {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringPropertyEditor());
    }

    private static class StringPropertyEditor extends java.beans.PropertyEditorSupport {
        @Override
        public void setAsText(String text) {
            String decodedText = UriUtils.decode(text, StandardCharsets.UTF_8);
            setValue(decodedText);
        }
    }
}
