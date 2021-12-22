package ldap;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Config {
    public static int ldapPort = 1389;
    public static String hostname = "";

    static {
        try { //try to get the local hostname by default
            hostname = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            hostname = "127.0.0.1";
        }
    }
}