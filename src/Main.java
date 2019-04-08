import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        IDialog iDialog = new DialogEng();



        while (true) {

            System.out.println(iDialog.sayHello());
            System.out.println(iDialog.askForName());


            if(getInput(iDialog.quit()) .equalsIgnoreCase("q")) {
                break;
            }
            iDialog = changeLang(iDialog);


        }
    }



    public static IDialog changeLang(IDialog iDialog) {

        String lang;
        lang = getInput("choose language dk / eng");

        if(lang.equalsIgnoreCase("dk")) {

            return new DialogDk();
        }
        if(lang.equalsIgnoreCase("eng")) {

            return new DialogEng();
        }
        return iDialog;
    }



    public static String getInput(String s) {

        System.out.println(s);

        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }
}
