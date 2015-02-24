package com.numhero.client.mvp.task;

import com.google.gwt.i18n.client.Messages;
import static com.google.gwt.i18n.client.LocalizableResource.*;

@GeneratedFrom("com/numhero/client/mvp/task/QuickTaskPanel.ui.xml")
@DefaultLocale("en")
@GenerateKeys("com.google.gwt.i18n.rebind.keygen.MD5KeyGenerator")
@Generate(
  format = {"com.google.gwt.i18n.rebind.format.PropertiesFormat", },
  fileName = "TaskPanel",
  locales = {"default", }
)
public interface QuickTaskPanelTaskUiBinderImplGenMessages extends Messages {

  @DefaultMessage("Name")
  @Key("task.name")
  String message1();

  @DefaultMessage("Description")
  @Key("task.description")
  String message2();

  @DefaultMessage("Client")
  @Key("invoice.client.supplier")
  String message3();

  @DefaultMessage("Save")
  @Key("task.save")
  String message4();

  @DefaultMessage("Cancel")
  @Key("task.cancel")
  String message5();

}
