package com.jvmError;

import java.io.File;
import java.lang.management.ClassLoadingMXBean;
import java.lang.management.ManagementFactory;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

public class MetaSpaceOOM {
    public static void main(String[] args){

        System.out.println(MetaSpaceOOM.class.getName());
        try{
            URL url = new File("/Users/baoyanhua/IdeaProjects/Test/src/com/service").toURI().toURL();
            URL[] urls = {url};
            System.out.println(url);
            ClassLoadingMXBean loadingbean = ManagementFactory.getClassLoadingMXBean();

            List<ClassLoader> classLoaders = new ArrayList<>();
            while(true) {
                ClassLoader classLoader = new URLClassLoader(urls);
                classLoaders.add(classLoader);
                classLoader.loadClass("PersonService");

                System.out.println("total: "+loadingbean.getLoadedClassCount());
                System.out.println("active: "+loadingbean.getLoadedClassCount());
                System.out.println("unloaded: "+loadingbean.getUnloadedClassCount());

            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }


}
