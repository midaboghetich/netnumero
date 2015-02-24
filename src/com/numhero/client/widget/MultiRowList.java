package com.numhero.client.widget;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.numhero.client.factory.AbstractRowFactory;
import com.numhero.shared.pojoc.DataCargoRecord;

import java.util.ArrayList;
import java.util.List;

public class MultiRowList extends ComplexPanel {
    private AbstractRowFactory rowFactory;

    public List<DataCargoRecord> getPojos() {
        return pojos;
    }

    private List<DataCargoRecord> pojos = new ArrayList<DataCargoRecord>();


    public MultiRowList() {
        init();
    }

    private void init() {
        setElement(DOM.createElement("UL"));
        getElement().setClassName("MultiRowList");
    }


    public void renderRows() {
        Element base = getElement();
        while (base.getChildCount() > 0)  //TODO there must be a better way
            base.removeChild(base.getFirstChild());

        for (DataCargoRecord dataCargoRecord : pojos) {
            Element li = DOM.createElement("LI");
            base.appendChild(li);

            DocumentRow r = rowFactory.createRow(dataCargoRecord);

            li.appendChild(r.getElement());
        }
    }

    public void setRowFactory(AbstractRowFactory rowFactory) {
        this.rowFactory = rowFactory;
    }
}
