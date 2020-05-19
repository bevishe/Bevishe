package com.jvm;

/**
 * @Classname DiffClassLoaderLoadingPath
 * @Description TODO
 * @Date 2020/3/4 18:54
 * @Created by Administrator
 */
public class DiffClassLoaderLoadingPath {

    public static void main(String[] args) {
        System.out.println(DiffClassLoaderLoadingPath.class.getPackage());
        System.out.println(DiffClassLoaderLoadingPath.class.getClassLoader());
        System.out.println(DiffClassLoaderLoadingPath.class.getClassLoader().getParent());
        System.out.println(DiffClassLoaderLoadingPath.class.getClassLoader().getParent().getParent());

    }
}
