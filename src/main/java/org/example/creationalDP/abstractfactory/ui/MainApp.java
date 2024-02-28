package org.example.creationalDP.abstractfactory.ui;

import org.example.creationalDP.abstractfactory.ui.botton.Button;
import org.example.creationalDP.abstractfactory.ui.ckeckbox.CheckBox;
import org.example.creationalDP.abstractfactory.ui.factory.DarkFactory;
import org.example.creationalDP.abstractfactory.ui.factory.DrawFactory;
import org.example.creationalDP.abstractfactory.ui.factory.LightFactory;

public class MainApp {
    public static void main(String[] args) {
        Theme theme = Theme.DARK;
        DrawFactory factory;
        if(theme.equals(Theme.DARK)){
            factory = new DarkFactory();
        }else {
            factory = new LightFactory();
        }
        Button button = factory.createButton();
        CheckBox checkBox = factory.createCheckBox();
        button.draw();
        checkBox.draw();
    }
}
