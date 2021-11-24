package Beans;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;

public class DeleteAccountContact {
    public DeleteAccountContact() {
    }

    public BindingContainer getBindingsCont() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public OperationBinding executeOperation(String operation) {
        OperationBinding createParam = getBindingsCont().getOperationBinding(operation);
        return createParam;
    }

    public String delContact() {
        DCIteratorBinding it = (DCIteratorBinding) BindingContext.getCurrent()
                                                                 .getCurrentBindingsEntry()
                                                                 .get("CustomercontactsView2Iterator");
        RowSetIterator rsIter = it.getRowSetIterator();
        Row rowObj = rsIter.getCurrentRow();
        rowObj.setAttribute("Customeraccountid", null);
        DCBindingContainer bindings = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        operationBinding.execute();
        return null;
    }
}
