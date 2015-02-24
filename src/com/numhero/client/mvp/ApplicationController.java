package com.numhero.client.mvp;

import com.google.inject.Inject;
import com.numhero.client.mvp.bankaccount.BankAccountPresenter;
import com.numhero.client.mvp.bankaccount.BankAccountsPresenter;
import com.numhero.client.mvp.businessaccount.BusinessAccountPresenter;
import com.numhero.client.mvp.clientsupplier.ClientPresenter;
import com.numhero.client.mvp.clientsupplier.ClientsPresenter;
import com.numhero.client.mvp.clientsupplier.SupplierPresenter;
import com.numhero.client.mvp.clientsupplier.SuppliersPresenter;
import com.numhero.client.mvp.document.*;
import com.numhero.client.mvp.home.HomePresenter;
import com.numhero.client.mvp.product.ProductPresenter;
import com.numhero.client.mvp.product.ProductsPresenter;
import com.numhero.client.mvp.project.ProjectPresenter;
import com.numhero.client.mvp.project.ProjectsPresenter;
import com.numhero.client.mvp.project.QuickProjectPresenter;
import com.numhero.client.mvp.service.ServicePresenter;
import com.numhero.client.mvp.service.ServicesPresenter;
import com.numhero.client.mvp.settings.SettingsPresenter;
import com.numhero.client.mvp.staff.*;
import com.numhero.client.mvp.task.TaskPresenter;
import com.numhero.client.mvp.task.TasksPresenter;
import com.numhero.client.mvp.timeentry.TimeEntriesPresenter;
import com.numhero.client.mvp.timeentry.TimeEntryPresenter;
import com.numhero.client.mvp.users.UserPresenter;
import com.numhero.client.mvp.users.UsersPresenter;

@SuppressWarnings("unused")
public class ApplicationController {

    @Inject
    private ClientsPresenter clientsPresenter;

    @Inject
    private ClientPresenter clientPresenter;

    @Inject
    private SupplierPresenter supplierPresenter;

    @Inject
    private SuppliersPresenter suppliersPresenter;

    @Inject
    private MoneyinPresenter moneyinPresenter;

    @Inject
    private RecentInvoicesPresenter recentInvoicesPresenter;

    @Inject
    private RecentEstimatesPresenter recentEstimatesPresenter;

    @Inject
    private RecentExpensesPresenter recentExpensesPresenter;

    @Inject
    private InvoicePresenter invoicePresenter;

    @Inject
    private EstimatePresenter estimatePresenter;

    @Inject
    private ExpensePresenter expensePresenter;

    @Inject
    private HomePresenter homePresenter;

    @Inject
    private BusinessAccountPresenter businessAccountPresenter;

    @Inject
    private SettingsPresenter settingsPresenter;

    @Inject
    private ProjectsPresenter projectsPresenter;

    @Inject
    private ProjectPresenter projectPresenter;

    @Inject
    private QuickProjectPresenter quickProjectPresenter;

    @Inject
    private TaskPresenter taskPresenter;

//    @Inject
//    private QuickTaskPresenter quickTaskPresenter;

    @Inject
    private TasksPresenter tasksPresenter;

    @Inject
    private TimeEntryPresenter timeEntryPresenter;

    @Inject
    private TimeEntriesPresenter timeEntriesPresenter;

    @Inject
    private InternalPresenter internalPresenter;

    @Inject
    private ContractorPresenter contractorPresenter;

    @Inject
    private QuickInternalPresenter quickInternalPresenter;

    @Inject
    private QuickContractorPresenter quickContractorPresenter;

    @Inject
    private InternalsPresenter internalsPresenter;

    @Inject
    private ContractorsPresenter contractorsPresenter;

    @Inject
    private UserPresenter userPresenter;

    @Inject
    private UsersPresenter usersPresenter;

    @Inject
    private ProductPresenter productPresenter;

    @Inject
    private ProductsPresenter productsPresenter;

    @Inject
    private ServicePresenter servicePresenter;

    @Inject
    private ServicesPresenter servicesPresenter;

    @Inject
    private BankAccountPresenter bankAccountPresenter;

    @Inject
    private BankAccountsPresenter bankAccountsPresenter;

}
