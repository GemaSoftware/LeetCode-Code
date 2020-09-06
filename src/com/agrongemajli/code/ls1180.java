package com.agrongemajli.code;

public class ls1180 {

    public static void main(String[] args) {
        String ip = "192.168.1.1";
        System.out.println(new Solution1180().defangIPaddr(ip));
    }
}
class Solution1180 {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.  ", "[.]");
    }
}
