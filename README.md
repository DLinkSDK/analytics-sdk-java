# analytics-sdk-java

Step 1: Get the `Account ID` and `Dev Token`

Register an account at https://console.dlink.cloud. After creating an app on the platform, Get the corresponding `Account ID` and `Dev Token` for App Setting.

Step 2: Get the SDK

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
  <version>1.4.7</version>
</dependency>

```

Step 3: Initialize the SDK
```java
       Analytics analytics = new Analytics(new AnalyticsConfig("{YOUR_ACCOUNT_ID}", "{YOUR_DEV_TOKEN}", "{cryptKey}"));

```


Step 4: Use the SDK

```java
    String signVersion = "1.0";
    String eventsJson = "";
    Long signTime = 0L;
    String appVersion = "1.0";
    String eventsSign = "";
    boolean valid = analytics.valid(signSdkVersion, eventsJson, signTime, appVersion, eventsSign);

```
