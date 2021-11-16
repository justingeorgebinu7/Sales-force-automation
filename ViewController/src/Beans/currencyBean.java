package Beans;

import javax.faces.event.ValueChangeEvent;
import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCIteratorBinding;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
public class currencyBean {
    public currencyBean() {
    }

    public int convertBase(String old, int r) {
            try {
                System.out.println("Inside convert base" + r);
                if (old.toUpperCase().equals("USD")) {
                    r /= 75;
                } else if (old.toUpperCase().equals("EUR")) {
                    r /= 85;
                }
                System.out.println(r);
            } catch (Exception e) {
                System.out.println("Number format exception");
            }
            return r;

        }

        public int convertNew(String newS, int r) {
            try {
                System.out.println("Inside convertnew" + r);
                if (newS.toUpperCase().equals("USD")) {
                    r *= 75;
                } else if (newS.toUpperCase().equals("EUR")) {
                    r *= 85;
                }
                System.out.println(r);
            } catch (Exception e) {
                System.out.println("Number format exception");
            }
            return r;

        }
    public void covert(ValueChangeEvent valueChangeEvent) {
        try {
                           System.out.println("inside convert");
                           Object o = valueChangeEvent.getOldValue();
                           Object n = valueChangeEvent.getNewValue();
                           String oldValue = o.toString();
                           String newVal = n.toString();

                           System.out.println("old value" + oldValue);

                           System.out.println("new value" + newVal);

                           DCIteratorBinding it = (DCIteratorBinding) BindingContext.getCurrent()
                                                                                    .getCurrentBindingsEntry()
                                                                                    .get("RevenueitemView2Iterator");
                           RowSetIterator rsIter = it.getRowSetIterator();
                           Row rowObj = rsIter.getCurrentRow();
                           Object rev = rowObj.getAttribute("Revenue");
                           System.out.println(rev.toString());
                           int revenue = 0;
        //                   try {
        //                       String revStr = rev.toString();
        //                       NumberFormat nf = NumberFormat.getInstance();
        //                       revenue = nf.parse(revStr).doubleValue();
        //                   } catch (Exception e) {
        //
        //                   }
                                   String revStr=rev.toString();
                                   revenue=Integer.parseInt(revStr);
                           //        double revenue= temp;
                           //

                           // double revenue = Double.parseDouble(rev.toString());

                           System.out.println(revenue);
                           if (!(oldValue == null)) {

                               System.out.println("Inside if 1");
                               if (!(oldValue.toUpperCase().equals("INR"))) {
                                   System.out.println("Inside if 2");
                                   revenue = convertBase(oldValue, revenue);
                                   // System.out.println("Revenue after convertbase");
                               }
                           }
                           revenue = convertNew(newVal, revenue);

                           System.out.println("converted revenue" + revenue);
                           Object finalRev=(Integer)revenue;
                           double bestcaserev= 1.1*revenue;
                           double worstcaserev= 0.9*revenue;
                    
                            Object best=bestcaserev;
                            Object worst=worstcaserev;
                           rowObj.setAttribute("Revenue",finalRev);
                           rowObj.setAttribute("Bestcaserevenue",best);
                           rowObj.setAttribute("Worstcaserevenue",worst);
                    

                       } catch (Exception e) {
                           System.out.println("Number format exception");
                       }

            }
    
}
