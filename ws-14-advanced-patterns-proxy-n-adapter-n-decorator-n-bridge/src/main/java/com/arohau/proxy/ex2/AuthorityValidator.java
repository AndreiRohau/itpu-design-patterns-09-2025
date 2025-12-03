package com.arohau.proxy.ex2;

public class AuthorityValidator {
    public boolean checkUserAccessToSource(String mediaSource) {
        System.out.println("Checking user access");
        return !mediaSource.contains("/prime/");
    }
}
