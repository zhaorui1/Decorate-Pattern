package main;

/**
 * Created by zhaorui on 16/2/18.
 */
public class HtmlFilter extends MessageBoardDecorator {
    public HtmlFilter(MessageBoardHandler handler) {
        super(handler);
    }
    public String filter(String content) {
        String temp = super.filter(content);
        temp += "^^过滤掉HTML标签!^^";
        return temp;
    }
}