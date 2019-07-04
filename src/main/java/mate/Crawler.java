package mate;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.IOException;

public class Crawler {

    Connection conn = null;
    Document doc = null;

    public Crawler(String page) {
        conn = Jsoup.connect(page);
        try {
            doc = conn.get();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void crawlByElementId(String elementId){
        Element elementById = doc.getElementById(elementId);
        if(elementById != null){
            StringBuilder sb = new StringBuilder();
            getPath(elementById, sb);
            sb = reversePath(sb.toString());
            System.out.println("Success!\nElement by id (\"" + (elementId) + "\") found.");
            System.out.println("The path to the element: " + sb.toString());
        } else {
            System.out.println("Failure!\nElement by id (\"" + (elementId) + "\") not found.");
        }
    }

    private void getPath(Element el, StringBuilder sb){
        if(el.parent() == null) return;
        el = el.parent();
        sb.append(el.nodeName());
        if(el.parent() != null) sb.append("/");
        getPath(el , sb);
    }

    private StringBuilder reversePath(String path){
        StringBuilder sb = new StringBuilder();
        String[] temp = path.split("/");
        for(int i = temp.length - 1; i >= 0; i--){
            sb.append(temp[i] + "/");
        }
        return sb;
    }


}
