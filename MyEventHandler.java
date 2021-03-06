
package bitmapchange;


import java.io.File;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MyEventHandler {

    private final Text text;
    
    public MyEventHandler (Text text){
        this.text = text;
    }   
    static File imagen;
    public static void abrir(TextField ruta){        
        try{
        JFileChooser file = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG file","jpg");
        FileNameExtensionFilter filtro2 = new FileNameExtensionFilter("PNG file","png");
        file.setFileFilter(filtro);
        file.setFileFilter(filtro2);
        
        int aa = file.showOpenDialog(null);
        System.out.println(aa);
        if(aa==JFileChooser.APPROVE_OPTION){
            char cbuf[]=null;
            imagen = file.getSelectedFile();
            ruta.setText(imagen.getAbsolutePath());
            
            System.out.println("");
        }
        }
        catch(Exception e){}       
    };
    public static void salvar(TextField ruta1, TextField ruta2, Text debug){
        String aux = ruta2.getText();
        
        if ((ruta1.getText().equals(""))){
                       
        } else{
            String ruta1s = ruta1.getText();
            String replace = ruta1s.replace(".jpg","");
        ruta2.setText(replace + aux + ".jpg");
        String replace2 = ruta1s.replace(".png","");
        ruta2.setText(replace + aux + ".png");
            
        }
    
    };
    public static void Clear(TextField vacio2, Text debug){
        
        vacio2.setText("");
        debug.setText("");
    }
}