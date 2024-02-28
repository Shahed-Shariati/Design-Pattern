package org.example.creationalDP.abstractfactory.ui.factory;

import org.example.creationalDP.abstractfactory.ui.botton.Button;
import org.example.creationalDP.abstractfactory.ui.botton.DarkButton;
import org.example.creationalDP.abstractfactory.ui.ckeckbox.CheckBox;
import org.example.creationalDP.abstractfactory.ui.ckeckbox.DarkCheckBox;

public class DarkFactory implements DrawFactory{
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new DarkCheckBox();
    }
}
