package ldap;

public class Starter {

    public static void main(String[] args) throws Exception {
        System.out.println(
                "LADP Server ldap.Starter"
        );
        LdapServer.start();
    }
}