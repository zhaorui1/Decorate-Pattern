package main;

/**
 * Created by zhaorui on 16/2/18.
 */
public class MessageBoard implements MessageBoardHandler {
    public String filter(String msg) {
        return "处理留言板上的内容：" + msg;
    }
}
