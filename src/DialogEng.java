public class DialogEng implements IDialog {
    @Override
    public String sayHello() {
        return "hello";
    }

    @Override
    public String askForName() {
        return "what is your name";
    }

    @Override
    public String quit() {
        return "press q for quit";
    }

    @Override
    public String changeLang() {
        return "press y for changing language";
    }
}
