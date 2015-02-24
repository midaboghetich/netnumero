package com.numhero.client.widget.table;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasHorizontalAlignment.HorizontalAlignmentConstant;

public class FlexTableWithHeader extends FlexTable {
    private Element head;
    private Element headerTr;
    private Element highlightedRowElem;

    public FlexTableWithHeader() {
        getColumnFormatter().getStyleName(0); // dummy call to be sure <colgroup> is created before the <thead>
        head = DOM.createTHead();
        headerTr = DOM.createTR();
        DOM.insertChild(this.getElement(), head, 1);
        DOM.insertChild(head, headerTr, 0);

    }

    public void setHeader(int column, String text, HorizontalAlignmentConstant alignment, String width, String className) {
        prepareHeader(column, alignment, width, className);
        if (text != null) {
            DOM.setInnerText(DOM.getChild(headerTr, column), text);
        }
    }

    public void setHeader(int column, String text, HorizontalAlignmentConstant alignment, String width) {
        setHeader(column, text, alignment, width, null);
    }

    public void setHeader(int column, String text, HorizontalAlignmentConstant alignment) {
        setHeader(column, text, alignment, "120px", null);
    }

    public HandlerRegistration addMouseHandler(MouseHandler handler) {
        sinkEvents(Event.ONMOUSEOVER | Event.ONMOUSEOUT);
        return addHandler(handler, MouseEvent.TYPE);
    }

    @Override
    public void onBrowserEvent(Event event) {
        super.onBrowserEvent(event);
        switch (DOM.eventGetType(event)) {
            case Event.ONMOUSEOVER:
                fireEvent(createMouseOverEvent(event));
                break;
            case Event.ONMOUSEOUT:
                Element toElem = DOM.eventGetToElement(event);
                if (highlightedRowElem != null && (toElem == null || !highlightedRowElem.isOrHasChild(toElem))) {
                    // Check that the coordinates are not directly over the cell
                    int clientX = event.getClientX() + Window.getScrollLeft();
                    int clientY = event.getClientY() + Window.getScrollTop();
                    int rowLeft = highlightedRowElem.getAbsoluteLeft();
                    int rowTop = highlightedRowElem.getAbsoluteTop();
                    int rowWidth = highlightedRowElem.getOffsetWidth();
                    int rowHeight = highlightedRowElem.getOffsetHeight();
                    int rowBottom = rowTop + rowHeight;
                    int rowRight = rowLeft + rowWidth;
                    if (clientX > rowLeft && clientX < rowRight && clientY > rowTop && clientY < rowBottom) {
                        return;
                    }
                    fireEvent(createMouseOutEvent());
                }
                break;
        }
    }

    // private methods --------------------------
    private void prepareHeader(int column, HorizontalAlignmentConstant alignment, String width, String className) {
        if (column < 0) {
            throw new IndexOutOfBoundsException("Cannot create a column with a negative index: " + column);
        }
        int cellCount = DOM.getChildCount(headerTr);
        int required = column + 1 - cellCount;
        if (required > 0) {
            addCells(head, 0, required, alignment, width, className);
        }
        getColumnFormatter().setWidth(column, width);
    }

    private native void addCells(Element table, int row, int num, HorizontalAlignmentConstant allignment, String width, String className) /*-{
		var rowElem = table.rows[row]; 
		for (var i = 0; i < num; i++) { 
		var cell = $doc.createElement("td");
		if (className) cell.className = className;
		cell.style.width = width;
		cell.style.textAlign = allignment.@com.google.gwt.user.client.ui.HasHorizontalAlignment.HorizontalAlignmentConstant::getTextAlignString()();
		}
		rowElem.appendChild(cell);
	}-*/;

    private MouseEvent createMouseOverEvent(Event event) {
        int column = -1, row = -1;
        Element td = null;
        if (event != null) {
            td = getEventTargetCell(event);
        }
        if (td != null) {
            Element tr = DOM.getParent(td);
            column = DOM.getChildIndex(tr, td);
            Element body = DOM.getParent(tr);
            row = DOM.getChildIndex(body, tr);
            highlightedRowElem = tr;
        }
        MouseEvent ret = new MouseEvent(MouseEvent.EventType.Over);
        ret.setRow(row);
        ret.setColumn(column);
        return ret;
    }

    private MouseEvent createMouseOutEvent() {
        MouseEvent ret = new MouseEvent(MouseEvent.EventType.Out);
        return ret;
    }
}
