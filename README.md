# analytics-sdk-java

Step 1: Get the SDK

(1) Configure the Maven repository

```xml
    <repositories>
        <repository>
            <id>deeplink</id>
            <name>deeplink</name>
            <url>https://maven.deeplink.dev/repository/maven-releases/</url>
        </repository>
    </repositories>
```

(2) Configuring the Maven coordinates of an SDK in pom.xml

```xml
<dependency>
  <groupId>dev.deeplink</groupId>
  <artifactId>analytics-sdk-java</artifactId>
  <version>1.1.1</version>
</dependency>

```

Step 2: Use the SDK

```java

    String signVersion = "1.0";
    String eventsJson = "";
    Long signTime = 0l;
    String appVersion = "";
    String eventsSign = "";
    String cryptKey = "";
    boolean valid = Analytics.valid(signVersion, clientBody, clientTime, clientVersion, clientSign, cryptKey);

```
