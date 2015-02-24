package com.numhero.client.mvp;

import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.numhero.client.util.ApplicationValidationMessages;
import com.numhero.client.widget.NetNumeroButton;
import com.numhero.shared.pojoc.BasePojoC;
import eu.maydu.gwt.validation.client.DefaultValidationProcessor;
import eu.maydu.gwt.validation.client.ValidationProcessor;
import eu.maydu.gwt.validation.client.Validator;
import eu.maydu.gwt.validation.client.actions.DisclosureTextAction;
import eu.maydu.gwt.validation.client.actions.FocusAction;
import eu.maydu.gwt.validation.client.actions.StyleAction;
import eu.maydu.gwt.validation.client.i18n.ValidationMessages;

@SuppressWarnings("unchecked")
public abstract class AbstractEditEntityPanel extends AbstractPanel {
    protected BasePojoC pojoC;

    protected ValidationProcessor validator;
    private DisclosurePanel errorsPanel;
    private FocusAction focusAction;

    public void setPojoC(BasePojoC pojoC) {
        this.pojoC = pojoC;
    }

    protected void createValidator(DisclosurePanel errorsPanel) {
        this.errorsPanel = errorsPanel;
        errorsPanel.setVisible(false);
        validator = new DefaultValidationProcessor(createValidationMessages());
        validator.addGlobalAction(new DisclosureTextAction(errorsPanel, "error", " "));
        focusAction = new FocusAction();
    }

    protected void resetValidator() {
        errorsPanel.setVisible(false);
        validator.reset();
        validator.removeAllValidators();
        addValidators();
    }

    protected void addValidators(String name, Validator... validators) {
        for (Validator v : validators) {
            v.addActionForFailure(focusAction);
            v.addActionForFailure(new StyleAction("validation-failed"));
        }
    }

    protected ValidationMessages createValidationMessages() {
        return new ApplicationValidationMessages();
    }

    protected abstract void addValidators();

    public abstract boolean saveValuesFromUi();

    public abstract NetNumeroButton getBtSearch();

    public abstract NetNumeroButton getBtCancel();

    public abstract TextBox getName();
}
