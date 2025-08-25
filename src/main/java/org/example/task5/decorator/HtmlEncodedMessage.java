package org.example.task5.decorator;

public class HtmlEncodedMessage extends MessageDecorator {

    public HtmlEncodedMessage(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return htmlEncode(message.getContent());
    }

    private String htmlEncode(String text) {
        return text.replaceAll("&", "&amp;")
                   .replaceAll("<", "&lt;")
                   .replaceAll(">", "&gt;");
    }
}