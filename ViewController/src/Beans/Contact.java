package Beans;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.model.BindingContext;

import oracle.adf.model.binding.DCIteratorBinding;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;

public class Contact {
    public Contact() {
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

    public void primaryCheck(ValueChangeEvent valueChangeEvent) {
        Object val= valueChangeEvent.getNewValue();
                System.out.println("Inside bean"+val.toString());
                
                if(val.toString().toUpperCase().equals("Y")) {
                    System.out.println("Inside if");
                    DCIteratorBinding it = (DCIteratorBinding)BindingContext.getCurrent().getCurrentBindingsEntry().get("CustomercontactsView2Iterator");   
                    RowSetIterator rsIter = it .getRowSetIterator();
                    Row rowObj = rsIter .getCurrentRow();
                    Object cid=rowObj.getAttribute("Contactid");
                    Object aid=rowObj.getAttribute("Customeraccountid");
                    
                    OperationBinding ob = executeOperation("editPrimary");
                    ob.getParamsMap().put("cidStr", cid.toString());
                    //ob.getParamsMap().put("aidStr", aid.toString());
                    ob.execute();
    }
    }
}
