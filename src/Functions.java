import java.util.Random;

public class Functions {

    protected String getString(int x) {
        String lettrs = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer salt = new StringBuffer();
        Random rnd = new Random();
        while (salt.length() < x) { // length of the random string.
            int index = (int) (rnd.nextFloat() * lettrs.length());
            salt.append(lettrs.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

    protected String getNumber(int x) {
        String lettrs = "1234567890";
        StringBuffer salt = new StringBuffer();
        Random rnd = new Random();
        while (salt.length() < x) { // length of the random string.
            int index = (int) (rnd.nextFloat() * lettrs.length());
            salt.append(lettrs.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
    protected String getEmailAdress (int x) {
        String lettrs = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer salt = new StringBuffer();
        Random rnd = new Random();
        while (salt.length() < x) { // length of the random string.
            int index = (int) (rnd.nextFloat() * lettrs.length());
            salt.append(lettrs.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr.toLowerCase() + "@mail.com";
    }
    public String getPassword (int x) {
        String lettrs = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*1234567890";
        StringBuffer salt = new StringBuffer();
        Random rnd = new Random();
        while (salt.length() < x) { // length of the random string.
            int index = (int) (rnd.nextFloat() * lettrs.length());
            salt.append(lettrs.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

}