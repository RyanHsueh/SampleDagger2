package com.example.ryanhsueh.sampledagger2.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by ryanhsueh on 2018/7/26
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface Gasoline {
}
