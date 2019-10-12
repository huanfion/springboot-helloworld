package com.huanfion.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * 自定义的类型筛选
 * @author huanfion
 * @version 1.0
 * @date 2019/10/11 16:08
 */
public class MyTypeFilter implements TypeFilter {
    /**
     *
     * @param metadataReader: 读取到的当前正在扫描的类的信息
     * @param metadataReaderFactory：可以获取其他任何类的信息
     * @return
     * @throws IOException
     */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //获取当前类注解的信息
        AnnotationMetadata annotationMetadata=metadataReader.getAnnotationMetadata();
        //获取当前正在扫描的类的类信息
        ClassMetadata classMetadata=metadataReader.getClassMetadata();
        //获取当前类资源（类的路径）
        Resource resource=metadataReader.getResource();

        String className = classMetadata.getClassName();
        System.out.println("扫描到的类----"+className);
        //类名包含ao，就扫描到容器中
        if(className.contains("ao"))
        {
            return true;
        }
        return false;
    }
}
