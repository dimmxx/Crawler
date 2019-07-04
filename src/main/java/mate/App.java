package mate;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class App {

    public static void main(String[] args) {

        //String page = "https://agileengine.bitbucket.io/beKIvpUlPMtzhfAy/samples/sample-0-origin.html";
        //String id = "make-everything-ok-button";

        if(args.length != 2){
            System.out.println("Usage: java -jar crawler.jar [url] [elementId]");
            return;
        }

        Crawler crawler = new Crawler(args[0]);
        crawler.crawlByElementId(args[1]);





//        Elements elements = doc.body().select("*");
//        for (Element element : elements) {
//            System.out.println(element.nodeName() + "---" + element.ownText());
//            //System.out.println(element.ownText());
//        }


        //System.out.println(sb);


//        // select the content text and pull out the paragraphs.
//        Element content = doc.getElementById("make-everything-ok-button");
//        //Elements link = content.select("a[href]");
//
//        //System.out.println(link);
//
//
//       Elements links = doc.select("a[href]");
//       System.out.println(links);

//


    }





}



