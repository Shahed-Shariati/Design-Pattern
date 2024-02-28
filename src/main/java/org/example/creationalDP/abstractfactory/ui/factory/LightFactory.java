package org.example.creationalDP.abstractfactory.ui.factory;

import org.example.creationalDP.abstractfactory.ui.botton.Button;
import org.example.creationalDP.abstractfactory.ui.botton.LightButton;
import org.example.creationalDP.abstractfactory.ui.ckeckbox.CheckBox;
import org.example.creationalDP.abstractfactory.ui.ckeckbox.LightCheckBox;

public class LightFactory implements DrawFactory{
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LightCheckBox();
    }
}
