import com.google.gson.JsonObject;
import com.ip2whois.IP2Whois;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class IP2WhoisTest {

    @Test
    void TestQuery() {
        String apiKey = "DUMMY";
        IP2Whois whois = new IP2Whois();
        whois.Open(apiKey);
        assertThrows(Exception.class, () -> {
            JsonObject myObj = whois.Lookup("locaproxy.com");
        });
    }

    @Test
    void TestPunycode() {
        assertEquals(IP2Whois.toPunycode("täst.de"), "xn--tst-qla.de");
    }

    @Test
    void TestNormalText() {
        assertEquals(IP2Whois.toNormalText("xn--tst-qla.de"), "täst.de");
    }

    @Test
    void TestDomainName() {
        assertEquals(IP2Whois.toDomainName("https://www.example.com/exe"), "example.com");
    }

    @Test
    void TestDomainExtension() {
        assertEquals(IP2Whois.toDomainExtension("example.com"), ".com");
    }
}