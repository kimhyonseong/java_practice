package design.aop;

import design.proxy.Html;
import design.proxy.IBrowser;

public class AopBrowser implements IBrowser {
    private String url;
    private Html html;
    private Runnable before;
    private Runnable after;

    public AopBrowser(String url, Html html, Runnable after) {
        this.url = url;
        this.html = html;
        this.after = after;
    }

    @Override
    public Html show() {
        before.run();
        if (html ==null) {
            this.html = new Html(url);
            System.out.println("AopBrowser html loading from "+url);
        }
        System.out.println("AopBrowser html cache "+url);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
