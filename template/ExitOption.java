package template;

public class ExitOption extends BaseMenuOption {
    private final CLIApplication app;

    public ExitOption(String title, CLIApplication app) {
        super(title);
        this.app = app;
    }

    @Override
    public void execute() {
        app.stop();
    }
}