package template;

public abstract class BaseMenuOption implements MenuOption {
    protected String title;

    public BaseMenuOption(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public abstract void execute();
}