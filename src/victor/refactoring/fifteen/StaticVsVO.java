package victor.refactoring.fifteen;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

public class StaticVsVO {

    public static void main(String[] args) {
        Token t = new Token("gigel", "Paro1@!");

        System.out.println(t.encoded());

        // Map<Customer.id, Map<Product.id, orderCount>>
        Map<CustomerId, Map<ProductId, Integer>> productIdCountsByCustomerId;
    }
}



class ProductId {
    private final long id;

    ProductId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
class CustomerId {
    private final long id;
    CustomerId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }
}


class Token {
    private final String key;
    private final String secret;

    Token(String key, String secret) {
        this.key = key;
        this.secret = secret;
        if (key == null && secret == null) {
            throw new IllegalArgumentException();
        }
    }

    String encoded() {
        return "key="
                + new EncodedString(key).encodeUTF8()
                + "&secret="
                + new EncodedString(secret).encodeUTF8();
    }
}

class FullName {
    private final String firstName;
    private final String lastName;
    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFullName() {
        return firstName + " " + lastName.toUpperCase();
    }
}

class EncodedString {
    private final String value;
    public EncodedString(String value) {
        this.value = value;
    }
    public String encodeUTF8() {
        try {
            return URLEncoder.encode(this.value, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
//    @Override
//    public String toString() {
//        return encodeUTF8();
//    }
}





class Page {
    public String getRedirectUrl() {
        return new EncodedString("a@b.com").encodeUTF8();
    }

}

