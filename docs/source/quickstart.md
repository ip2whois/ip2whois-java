# Quickstart

## Pre-requisite
IntelliJ IDEA

## Dependencies

This module requires API key to function. You may sign up for a free API key at <https://www.ip2location.io/pricing>.

## Installation

https://central.sonatype.com/artifact/com.ip2whois/ip2whois-java/

## Sample Codes

### Lookup Domain Information

You can lookup domain information as below:

```java
// Configures IP2WHOIS API key
String apiKey = "YOUR_API_KEY";
IP2Whois whois = new IP2Whois();
whois.Open(apiKey);

// Lookup domain information
JsonObject myObj = whois.Lookup("locaproxy.com");
System.out.println(myObj);
```

### Convert Normal Text to Punycode

You can convert an international domain name to Punycode as below:

```java
// Convert normal text to punycode
System.out.println(IP2Whois.toPunycode("täst.de"));
```

### Convert Punycode to Normal Text

You can convert a Punycode to international domain name as below:

```java
// Convert punycode to normal text
System.out.println(IP2Whois.toNormalText("xn--tst-qla.de"));
```

### Get Domain Name

You can extract the domain name from an url as below:

```java
// Get domain name from URL
System.out.println(IP2Whois.toDomainName("https://www.example.com/exe"));
```

### Get Domain Extension

You can extract the domain extension from a domain name or url as below:

```java
// Get domain extension (gTLD or ccTLD) from URL or domain name
System.out.println(IP2Whois.toDomainExtension("example.com"));
```