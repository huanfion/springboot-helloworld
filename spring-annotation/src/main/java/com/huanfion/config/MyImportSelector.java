package com.huanfion.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author huanfion
 * @version 1.0
 * @date 2019/10/12 9:43
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.huanfion.bean.Blue","com.huanfion.bean.Yellow"};
    }
}
