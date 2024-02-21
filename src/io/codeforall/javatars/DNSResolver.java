package io.codeforall.javatars;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Scanner;



public class DNSResolver {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName(getHost());
            System.out.println("Testing reachability for " + ip.getHostAddress() + " : " + (ip.isReachable(1000) ? "OK" : "NOK"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String getHost() {

        Scanner reader = new Scanner(System.in);
        System.out.println("Hostname? ");
        return reader.nextLine();

    }
}
