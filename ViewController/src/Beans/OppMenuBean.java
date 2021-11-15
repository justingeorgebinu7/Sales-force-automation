package Beans;

import java.io.Serializable;

import oracle.adf.model.binding.DCIteratorBinding;

import org.apache.myfaces.trinidad.event.DisclosureEvent;
import oracle.binding.BindingContainer;

import oracle.binding.OperationBinding;

import oracle.adf.model.BindingContext;
import oracle.jbo.*;

public class OppMenuBean implements Serializable {
    public OppMenuBean() {
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
    public void totalRevenue(DisclosureEvent disclosureEvent) {
        System.out.println("Inside bean method");
        //        DCIteratorBinding dit = (DCIteratorBinding) BindingContext.getCurrent()
        //                                                                  .getCurrentBindingsEntry()
        //                                                                  .get("RevenueitemView2Iterator");
        //        RowSet rs = dit.getViewObject().createRowSet(null);
        //        System.out.println(rs.hasNext());
        //        rs.reset();
        //        int total;
        //        while(rs.hasNext()) {
        //            Row r=rs.next();
        //            int rev =r.getAttribute("revenue");
        //        }
                DCIteratorBinding it = (DCIteratorBinding) BindingContext.getCurrent()
                                                                         .getCurrentBindingsEntry()
                                                                         .get("OpportunityView1Iterator");
                RowSetIterator rsIter = it.getRowSetIterator();
                Row rowObj = rsIter.getCurrentRow();
                Object oid = rowObj.getAttribute("Opportunityid");
                OperationBinding ob = executeOperation("totalRevenueOppAM");
                ob.getParamsMap().put("oidStr", oid.toString());
                //ob.getParamsMap().put("aidStr", aid.toString());
                ob.execute();
    }
}
