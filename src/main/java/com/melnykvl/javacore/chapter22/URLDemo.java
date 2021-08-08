package com.melnykvl.javacore.chapter22;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo {
    public static void main(String[] args) throws MalformedURLException, IOException {

        URL hp = new URL("http://www.HerbSchildt.com/Articles");

        System.out.println("Protocol: " + hp.getProtocol());
        System.out.println("Port: " + hp.getPort());

        System.out.println("Host: " + hp.getHost());
        System.out.println("File: " + hp.getFile());
        System.out.println("Full form: " + hp.toExternalForm());

    }
}
