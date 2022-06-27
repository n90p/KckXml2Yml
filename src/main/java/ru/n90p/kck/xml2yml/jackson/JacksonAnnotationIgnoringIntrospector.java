package ru.n90p.kck.xml2yml.jackson;

import lombok.*;

import java.lang.annotation.*;

import com.fasterxml.jackson.databind.introspect.*;

@RequiredArgsConstructor
public class JacksonAnnotationIgnoringIntrospector extends JacksonAnnotationIntrospector {
    private final Class<? extends Annotation> ignoredAnnotation;

    @Override
    protected boolean _isIgnorable(Annotated a) {
        return super._isIgnorable(a) || a.hasAnnotation(ignoredAnnotation);
    }
}