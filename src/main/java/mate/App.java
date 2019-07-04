package mate;

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

    }
}



