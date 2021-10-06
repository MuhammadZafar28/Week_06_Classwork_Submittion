package com.mycompany.week6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

public class App extends Application {

    Label label;
    TextField tf;
    TextField tf2;
    @Override
   
    
    public void start(Stage stage) {

        label = new Label("Hello, Muhammad Awais Zafar"  );
        
        Button btn1 = new Button("Click me 345345");
        btn1.setLayoutX(50);
        btn1.setLayoutY(50);
        btn1.setOnAction( v -> {
             label.setText(" I clicked the btn -"+((Button)v.getSource()).getText());
        }
        );
        
        Button btn2= new Button("Btn 2");
        btn2.setLayoutX(250);
        btn2.setLayoutY(50);
        btn2.setOnAction( this::processBttn2);
        
        
        
        
        
        
        tf = new TextField(" ");
        tf.setLayoutX(50); tf.setLayoutY(250);
        
        tf2 = new TextField(" ");
        tf2.setLayoutX(50); tf2.setLayoutY(300);
        
        Group gp = new Group(label, btn1,btn2,tf,tf2);
        var scene = new Scene(gp,640,480);
        stage.setScene(scene);
        stage.setTitle("GUI Demo 2");
        stage.show();
        
        
        
        
        
        
//            var label2 = new Label("343627263 ");
//            Rectangle rect = new Rectangle(50,50, 300,300);
//            rect.setFill(Color.LIGHTGRAY);
//            
//            Line ln1= new Line(400,400,600,600);
//            Line ln2= new Line(600,600,400,600);
//            Line ln3= new Line(400,400,400,600);
//
//                    
//                    
//            label2.setLayoutX(100);
//            label2.setLayoutY(100);
//        Group sp = new Group (label, label2,ln1,ln2,ln3, rect);  
//        Button[] svrlBtns = new Button[5];
//        for(int i = 0; i < 5; i++){
//            svrlBtns[i] = new Button();
//            svrlBtns [i].setLayoutX(500+(i*10));
//            svrlBtns[i].setLayoutY(500+(i*20));
//            svrlBtns[i].setText("Brn"+i);
//            
//            sp.getChildren().add(svrlBtns[i]);
//        }
//        var scene = new Scene(sp,800,800);
//        stage.setScene(scene);
//        stage.setTitle(("My First GUI APP"));
//        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

  

    private void processBttn2(ActionEvent t) {
       String cntnt = tf.getText().trim();
        int num2 = Integer.parseInt(cntnt);
        
        String cntnt2 = tf2.getText().trim();
        int num1 = Integer.parseInt(cntnt2);
        int Sum = num1 + num2;
        String numString = Integer.toString(Sum);
        label.setText(numString);
        label.setTextFill(Color.RED); 
    }

    

