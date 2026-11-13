package masodikZH.nov06.widget;

public class UIWidget {
//    private boolean isEnabled = true;
    private boolean isEnabled = true;

    public UIWidget(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("UIWidget konstruktora lefutott.");
    }

    public UIWidget() {
    }


    public void enable() {
        this.isEnabled = true;
    }
    public void disable() {
        this.isEnabled = false;
    }
    public boolean isEnabled() {
        return this.isEnabled;
    }

    public void render() {
        // ures
    }
}
