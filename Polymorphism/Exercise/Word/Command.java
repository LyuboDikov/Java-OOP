package Polymorphism.Exercise.Word;

public class Command {
    private String text;
    private TextTransformation textTransformation;

    public Command(String text, TextTransformation textTransformation){
        this.text = text;
        this.textTransformation = textTransformation;
    }
    public String getText() {
        return this.text;
    }

    public TextTransformation getTextTransformation() {
        return this.textTransformation;
    }

}