package authorisation;

import org.apache.commons.codec.digest.DigestUtils;

public class Authorisation {

    private int customerID;
    private String saltedPasswordHash;

    public Authorisation(int customerID, String rawPassword) {
        this.customerID = customerID;
        this.saltedPasswordHash = DigestUtils.md5Hex(rawPassword + customerID);
    }


}
