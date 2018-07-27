package com.example.ryanhsueh.sampledagger2.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by ryanhsueh on 2018/7/26
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ApplicationScope {
}
