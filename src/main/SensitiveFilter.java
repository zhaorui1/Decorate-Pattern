package main;

/**
 * Created by zhaorui on 16/2/18.
 */
public class SensitiveFilter extends MessageBoardDecorator {
    public SensitiveFilter(MessageBoardHandler handler) {
        super(handler);
    }
    public String filter(String content) {
        String temp = super.filter(content);
        temp += "^^过滤掉政治敏感的字眼!^^";
        return temp;
    }
}
