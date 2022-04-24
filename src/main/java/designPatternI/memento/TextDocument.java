package designPatternI.memento;

public class TextDocument {
    private String text = "";

    public void write(String text) {
        this.text += text;
    }

    public void print() {
        System.out.println(text);
    }

}

