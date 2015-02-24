package com.numhero.client.widget.table;

import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.numhero.client.widget.TableFooterPanel;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTableWithHeaderAndFooter extends VerticalPanel{
	protected FlexTableWithHeader table;
	protected TableFooterPanel footer;
    private static final String ALL = "__ALL__";

    public AbstractTableWithHeaderAndFooter() {
		table = new FlexTableWithHeader();
    	footer = new TableFooterPanel();
    	this.setWidth("100%");
    	table.setStyleName("inh-standard");
    	
    	setHeader();

    	add(table);
        add(footer);
	}

	protected CheckBox getCheckbox(String id) {
		CheckBox box = new CheckBox();
		box.setFormValue(id);
		return box;
	}

    protected CheckBox getAllCheckbox() {
        CheckBox box = new CheckBox();
        box.setFormValue(ALL);
        return box;
    }

    public List<String> getSelectedIds(){
        int rowCount = table.getRowCount();
        List<String> ids = new ArrayList<String>();
        for (int i= 0; i < rowCount; i++){
            CheckBox box = (CheckBox) table.getWidget(i,0);
            if (box != null && box.getValue()) {
                 ids.add(box.getFormValue());
            }
        }
        return ids;
    }

	protected abstract void setHeader(); 
	
	public void setHeader(int column, String text, HorizontalAlignmentConstant alignment, String width) {
		this.table.setHeader(column, text, alignment, width, null);
	}
	
	protected void setWidget(int row, int column, Widget widget) {
		table.setWidget(row, column, widget);
	}
	
	public void setText(int row, int column, String text) {
		table.setText(row, column, text); 
	}
	
	public void removeAllRows() {
		table.removeAllRows();
	}

    public TableFooterPanel getFooter() {
        return footer;
    }

    public void setFooter(TableFooterPanel footer) {
        this.footer = footer;
    }
}
