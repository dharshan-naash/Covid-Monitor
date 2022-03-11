import java.awt.*;
public class Registration{
public static void main(String[] args){
Frame f = new Frame();
Button btn = new Button("ok");
btn.setBounds(40,60,10,20);
Button btn1 = new Button("Cancel");
btn1.setBounds(70,90,10,20);
f.add(btn);
f.add(btn1);
f.setSize(200,200);
f.setTitle("Welcome");
f.setVisible(true);
}
}