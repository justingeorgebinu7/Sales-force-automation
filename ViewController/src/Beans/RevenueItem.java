package Beans;

import java.math.BigDecimal;

import javax.faces.event.ValueChangeEvent;
import oracle.binding.BindingContainer;

import oracle.binding.OperationBinding;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCIteratorBinding;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import java.math.*;

public class RevenueItem {
    public RevenueItem() {
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
      
//    DCIteratorBinding it = (DCIteratorBinding)BindingContext.getCurrent().getCurrentBindingsEntry().get("RevenueitemView2Iterator");   
//    RowSetIterator rsIter = it .getRowSetIterator();
//    Row rowObj = rsIter .getCurrentRow();
//    rowObj.setAttribute("Estimatedprice", p);
    public void productSelect(ValueChangeEvent valueChangeEvent) {
        
       Object pid= valueChangeEvent.getNewValue();
       
        OperationBinding ob = executeOperation("estimatedPrice");
        ob.getParamsMap().put("pidStr", pid.toString());
        ob.execute();
        
        DCIteratorBinding it = (DCIteratorBinding)BindingContext.getCurrent().getCurrentBindingsEntry().get("RevenueitemView2Iterator");   
        RowSetIterator rsIter = it .getRowSetIterator();
        Row rowObj = rsIter .getCurrentRow();
        Object q=rowObj.getAttribute("Quantity");
       // String str = q.toString();
        if(q!=null) {
            calculate(q);
        }
        
    }

    public void quantityChange(ValueChangeEvent valueChangeEvent) {
     
        Object quant= valueChangeEvent.getNewValue();
        calculate(quant);
        
    }
    
    public void calculate(Object quant){
        
        DCIteratorBinding it = (DCIteratorBinding)BindingContext.getCurrent().getCurrentBindingsEntry().get("RevenueitemView2Iterator");   
        RowSetIterator rsIter = it .getRowSetIterator();
        Row rowObj = rsIter .getCurrentRow();
        Object price=rowObj.getAttribute("Estimatedprice");
        if(price==null) {
            return;
        }
        double q=Double.parseDouble(quant.toString());
        double p=Double.parseDouble(price.toString());
        double rev=p*q;
        rev=Math.abs(rev);
        Object revenue=(Double)rev;
        //System.out.println(rev);
        double bestcaserev= 1.1*rev;
        //System.out.println(bestcaserev);
        double worstcaserev=0.9*rev;
        Object best=bestcaserev;
        Object worst=worstcaserev;
        rowObj.setAttribute("Revenue",revenue);
        rowObj.setAttribute("Bestcaserevenue",best); 
        rowObj.setAttribute("Worstcaserevenue",worst);
    }
}
