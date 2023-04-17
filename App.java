import java.awt.Dimension;
import java.awt.Toolkit;

public class App{

    public static void main(String[] args) {
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.err.println("Resolução: " + d.width + "x" + d.height);

    }

}