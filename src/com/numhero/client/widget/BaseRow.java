package com.numhero.client.widget;

import com.google.gwt.user.client.ui.Widget;
import com.numhero.shared.pojoc.DataCargoRecord;


public abstract class BaseRow<T extends DataCargoRecord> extends Widget {

    public abstract void setPojo(T d);

}
