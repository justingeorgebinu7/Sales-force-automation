package Beans;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCIteratorBinding;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;

public class RoleRange {
    public RoleRange() {
    }

    public BindingContainer getBindingsCont() {

        return BindingContext.getCurrent().getCurrentBindingsEntry();

    }


    /**

     * Generic Method to execute operation

     * */

    public OperationBinding executeOperation(String operation) {

        OperationBinding createParam = getBindingsCont().getOperationBinding(operation);

        return createParam;


    }


    public String roleRange() {
        DCIteratorBinding it = (DCIteratorBinding) BindingContext.getCurrent()
                                                                 .getCurrentBindingsEntry()
                                                                 .get("UserroleView3Iterator");
        RowSetIterator rsIter = it.getRowSetIterator();
        Row rowObj = rsIter.getCurrentRow();
        Object acc = rowObj.getAttribute("Useraccount");
        String aid = acc.toString();
        OperationBinding ob = executeOperation("roleDate");
        ob.getParamsMap().put("a", aid);
        ob.execute();

        return null;

    }
}
