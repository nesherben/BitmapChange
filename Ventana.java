
package bitmapchange;

import java.net.URL;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;

public class Ventana extends Application{
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        //String mensaje = "Hello World";
        URL url = getClass().getResource("StyleCss.css");
        
        Text debug = new Text();
        Text space = new Text();
        Text space2 = new Text();
        space.setText(" ");
        space2.setText("");
        debug.setText("");
        debug.setFill(Color.RED);
        debug.setFont(Font.font("Ubuntu",FontWeight.BOLD,16));
        debug.setX(12);
        debug.setY(44);
        
        TextField ruta1 = new TextField();
        TextField ruta2 = new TextField();
        
        
        Button cargar = new Button("cargar...");
        cargar.setOnAction (new EventHandler<ActionEvent>() {                 
                    @Override 
                    public void handle(ActionEvent event){                        
                        MyEventHandler.abrir(ruta1);
                    }
        });
        TextField aux = ruta1;
        
        Button guardar = new Button("guardar...");
            guardar.setOnAction (new EventHandler<ActionEvent>() {                 
                    @Override 
                    public void handle(ActionEvent event){                         
                        MyEventHandler.salvar(ruta1,ruta2,debug);
                    }});
            
        Button btn1 = new Button("GBCamera");
            
            btn1.setOnAction (new EventHandler<ActionEvent>() { 
                
                    @Override 
                    public void handle(ActionEvent event){                         
                        Bitmapchange.gameboy(aux,ruta2,debug);
                    }});
            Button btn2 = new Button("BW Filtro");
            
            btn2.setOnAction (new EventHandler<ActionEvent>() { 
                
                    @Override 
                    public void handle(ActionEvent event){                         
                        Bitmapchange.wbfiltro(aux,ruta2,debug);
                    }});
            Button btn3 = new Button("Negativo");
            
            btn3.setOnAction (new EventHandler<ActionEvent>() { 
                
                    @Override 
                    public void handle(ActionEvent event){                         
                        Bitmapchange.negativo(aux,ruta2,debug);
                    }});
            Button btn4 = new Button("Ruido");
            
            btn4.setOnAction (new EventHandler<ActionEvent>() { 
                
                    @Override 
                    public void handle(ActionEvent event){                         
                        Bitmapchange.randomruido(aux,ruta2,debug);
                    }});
            
            Button btn5 = new Button("Sepia");
            
            btn5.setOnAction (new EventHandler<ActionEvent>() { 
                
                    @Override 
                    public void handle(ActionEvent event){                         
                        Bitmapchange.sepia(aux,ruta2,debug);
                    }});
            Button btn6 = new Button("8bits design");
            
            btn6.setOnAction (new EventHandler<ActionEvent>() { 
                
                    @Override 
                    public void handle(ActionEvent event){                         
                        Bitmapchange.material(aux,ruta2,debug);
                    }});
            Button btn7 = new Button("Scanlines");
            
            btn7.setOnAction (new EventHandler<ActionEvent>() { 
                
                    @Override 
                    public void handle(ActionEvent event){                         
                        Bitmapchange.scanlines(aux,ruta2,debug);
                    }});
            Button btn8 = new Button("Pastel");
            
            btn8.setOnAction (new EventHandler<ActionEvent>() { 
                
                    @Override 
                    public void handle(ActionEvent event){                         
                        Bitmapchange.pastel(aux,ruta2,debug);
                    }});
            
        Button clear = new Button("Clear");
            clear.setOnAction (new EventHandler<ActionEvent>() { 
                
                    @Override 
                    public void handle(ActionEvent event){                         
                        MyEventHandler.Clear(ruta2,debug);                        
                    }});
        
        //StackPane root = new StackPane();
        btn1.setId("Botones");
        btn2.setId("Botones");
        btn3.setId("Botones");
        btn4.setId("Botones");
        btn5.setId("Botones");
        btn6.setId("Botones");
        btn7.setId("Botones");
        btn8.setId("Botones");
        
        clear.setId("Botonesb");
        guardar.setId("Botonesa");
        cargar.setId("Botonesa");
        
        
        
        HBox menu1 = new HBox(23);
        HBox menu2 = new HBox(20);
        HBox menu3 = new HBox(10);
        HBox menu4 = new HBox(10);
        menu1.getChildren().addAll(ruta1,space,cargar);        
        menu2.getChildren().addAll(ruta2,space2,guardar);
        menu3.getChildren().addAll(btn1,btn2,btn3,btn8);
        menu4.getChildren().addAll(btn4,btn5,btn6,btn7);
        
        menu1.setAlignment(Pos.CENTER);
        menu2.setAlignment(Pos.CENTER);
        menu3.setAlignment(Pos.CENTER);
        menu4.setAlignment(Pos.CENTER); 
        VBox conjunto = new VBox(3);
        conjunto.getChildren().addAll(menu1,menu2);
        VBox filtros = new VBox(10);
        filtros.getChildren().addAll(conjunto,menu3,menu4);
        
        VBox debuged = new VBox(20);
        debuged.getChildren().addAll(filtros,clear,debug);
        
        debuged.setAlignment(Pos.CENTER);
        
        Scene escena = new Scene(debuged,600,300);    
        debuged.setId("scene");
        escena.getStylesheets().add(url.toString());
        
        primaryStage.setTitle("BitmapChange APP");
        primaryStage.setScene(escena);
        primaryStage.sizeToScene();
        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
