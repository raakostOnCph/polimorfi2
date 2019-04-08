public class DialogDk implements IDialog {
    @Override
    public String sayHello() {
        return "hej";
    }

    @Override
    public String askForName() {
        return "hvad hedder du";
    }

    @Override
    public String quit() {
        return "tryk q for quit";
    }

    @Override
    public String changeLang() {
        return "tryk j for at skift sprog";
    }
}
