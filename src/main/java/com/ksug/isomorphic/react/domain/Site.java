package com.ksug.isomorphic.react.domain;

/**
 * Created by 1000742
 * Email: sungyong.jung@sk.com
 * Date: 2015. 10. 20.
 */
public class Site {
    private String name;
    private String url;

    public Site(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getToJsonString() {
        return "{" +
                "name:'" + name + '\'' +
                ", url:'" + url + '\'' +
                '}';
    }
}
