package JsoupExample;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Yandex {
    public static void main(String[] args) {
        Document doc = null;
        try {
            doc = Jsoup.connect("https://ukr.net")
                    .userAgent("Chrome/4.0.249.0 Safari/532.5")
                    .referrer("http://www.google.com")
                    .get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Elements listNews = doc.select("div#se");
    }
}
