import java.util.Date;
import java.util.Locale;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Basico{
    public static void main(String[] args){

        Date relogio = new Date();
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString());

        Locale loc = Locale.getDefault();
        System.out.println("O idioma do sistema é");
        System.out.println(loc.getDisplayLanguage());

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução do sistema é");
        System.out.println(d.width + "x" + d.height);

    }
}