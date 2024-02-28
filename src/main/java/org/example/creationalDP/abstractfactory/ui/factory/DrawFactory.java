package org.example.creationalDP.abstractfactory.ui.factory;

import org.example.creationalDP.abstractfactory.ui.botton.Button;
import org.example.creationalDP.abstractfactory.ui.ckeckbox.CheckBox;

public interface DrawFactory {

    Button createButton();
    CheckBox createCheckBox();

}
