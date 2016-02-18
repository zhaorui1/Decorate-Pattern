package main;

/**
 * Created by zhaorui on 16/2/18.
 */
public class MessageBoardDecorator implements MessageBoardHandler {
    private MessageBoardHandler handler;

    public MessageBoardDecorator(MessageBoardHandler handler) {
        super();
        this.handler = handler;
    }
    public String filter(String msg) {
        return handler.filter(msg);
    }
}