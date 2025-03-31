package dev.deeplink.analytics.sdk;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("body.txt");
        String content = Files.readAllLines(file.toPath()).stream().findFirst().orElse(null);
        Analytics analytics = new Analytics(new AnalyticsConfig("{YOUR_ACCOUNT_ID}", "{YOUR_DEV_TOKEN}", "your_crypt_key"));
        boolean valid = analytics.valid("1.0", content, 1743413204235L, "1.0", "4dee8282efeecae56f33e584c17328079a172349c84e4c1dd395b0a33df8b50d");
        System.out.println(valid);

    }
}
