package masodikZH.nov06.widget;

public class TextBox extends UIWidget {
    private String text = "";

    public TextBox() {
        //super(true); // szuper (szülő) osztály konstruktorának argumentum adás.
        System.out.println("TextBox konstruktora lefutott.");
    }

    public String getText() {
        return this.text;
    }
    public void setText (String text){
        this.text = text;
    }
    public void clear() {
        this.text = "";
    }

    @Override
    public void render() {
        super.render();
    }
}
