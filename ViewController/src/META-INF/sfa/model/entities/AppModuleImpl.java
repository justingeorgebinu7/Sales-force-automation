package sfa.model.entities;

import oracle.adf.model.binding.DCBindingContainer;

import oracle.adf.model.binding.DCIteratorBinding;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;

import oracle.jbo.server.ViewObjectImpl;

import sfa.model.entities.common.AppModule;
import sfa.model.viewobjects.CustomercontactsViewImpl;
import sfa.model.viewobjects.ProductsViewImpl;
import sfa.model.viewobjects.staticVo.AccountTypeImpl;
import oracle.jbo.*;
import oracle.adf.model.BindingContext;

import sfa.model.viewobjects.ProductsViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Nov 11 23:06:19 IST 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl implements AppModule {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleImpl() {
    }
    

    /**
     * Container's getter for AddressView1.
     * @return AddressView1
     */
    public ViewObjectImpl getAddressView1() {
        return (ViewObjectImpl) findViewObject("AddressView1");
    }

    /**
     * Container's getter for AppointmentsView1.
     * @return AppointmentsView1
     */
    public ViewObjectImpl getAppointmentsView1() {
        return (ViewObjectImpl) findViewObject("AppointmentsView1");
    }

    /**
     * Container's getter for ContactaddressView1.
     * @return ContactaddressView1
     */
    public ViewObjectImpl getContactaddressView1() {
        return (ViewObjectImpl) findViewObject("ContactaddressView1");
    }

    /**
     * Container's getter for CustomeraccountView1.
     * @return CustomeraccountView1
     */
    public ViewObjectImpl getCustomeraccountView1() {
        return (ViewObjectImpl) findViewObject("CustomeraccountView1");
    }

    /**
     * Container's getter for CustomercontactsView1.
     * @return CustomercontactsView1
     */
    public CustomercontactsViewImpl getCustomercontactsView1() {
        return (CustomercontactsViewImpl) findViewObject("CustomercontactsView1");
    }

    /**
     * Container's getter for InteractionView1.
     * @return InteractionView1
     */
    public ViewObjectImpl getInteractionView1() {
        return (ViewObjectImpl) findViewObject("InteractionView1");
    }

    /**
     * Container's getter for InviteesView1.
     * @return InviteesView1
     */
    public ViewObjectImpl getInviteesView1() {
        return (ViewObjectImpl) findViewObject("InviteesView1");
    }

    /**
     * Container's getter for NoteView1.
     * @return NoteView1
     */
    public ViewObjectImpl getNoteView1() {
        return (ViewObjectImpl) findViewObject("NoteView1");
    }

    /**
     * Container's getter for OpportunityView1.
     * @return OpportunityView1
     */
    public ViewObjectImpl getOpportunityView1() {
        return (ViewObjectImpl) findViewObject("OpportunityView1");
    }

    /**
     * Container's getter for ProductsView1.
     * @return ProductsView1
     */
    public ProductsViewImpl getProductsView1() {
        return (ProductsViewImpl) findViewObject("ProductsView1");
    }

    /**
     * Container's getter for RevenueitemView1.
     * @return RevenueitemView1
     */
    public ViewObjectImpl getRevenueitemView1() {
        return (ViewObjectImpl) findViewObject("RevenueitemView1");
    }

    /**
     * Container's getter for RoleView1.
     * @return RoleView1
     */
    public ViewObjectImpl getRoleView1() {
        return (ViewObjectImpl) findViewObject("RoleView1");
    }

    /**
     * Container's getter for TaskView1.
     * @return TaskView1
     */
    public ViewObjectImpl getTaskView1() {
        return (ViewObjectImpl) findViewObject("TaskView1");
    }

    /**
     * Container's getter for UseraccountView1.
     * @return UseraccountView1
     */
    public ViewObjectImpl getUseraccountView1() {
        return (ViewObjectImpl) findViewObject("UseraccountView1");
    }

    /**
     * Container's getter for UserroleView1.
     * @return UserroleView1
     */
    public ViewObjectImpl getUserroleView1() {
        return (ViewObjectImpl) findViewObject("UserroleView1");
    }


    /**
     * Container's getter for ContactaddressView2.
     * @return ContactaddressView2
     */
    public ViewObjectImpl getContactaddressView2() {
        return (ViewObjectImpl) findViewObject("ContactaddressView2");
    }

    /**
     * Container's getter for AppointmentsView2.
     * @return AppointmentsView2
     */
    public ViewObjectImpl getAppointmentsView2() {
        return (ViewObjectImpl) findViewObject("AppointmentsView2");
    }

    /**
     * Container's getter for CustomercontactsView2.
     * @return CustomercontactsView2
     */
    public CustomercontactsViewImpl getCustomercontactsView2() {
        return (CustomercontactsViewImpl) findViewObject("CustomercontactsView2");
    }

    /**
     * Container's getter for InteractionView2.
     * @return InteractionView2
     */
    public ViewObjectImpl getInteractionView2() {
        return (ViewObjectImpl) findViewObject("InteractionView2");
    }

    /**
     * Container's getter for InviteesView2.
     * @return InviteesView2
     */
    public ViewObjectImpl getInviteesView2() {
        return (ViewObjectImpl) findViewObject("InviteesView2");
    }

    /**
     * Container's getter for NoteView2.
     * @return NoteView2
     */
    public ViewObjectImpl getNoteView2() {
        return (ViewObjectImpl) findViewObject("NoteView2");
    }

    /**
     * Container's getter for NoteView3.
     * @return NoteView3
     */
    public ViewObjectImpl getNoteView3() {
        return (ViewObjectImpl) findViewObject("NoteView3");
    }

    /**
     * Container's getter for NoteView4.
     * @return NoteView4
     */
    public ViewObjectImpl getNoteView4() {
        return (ViewObjectImpl) findViewObject("NoteView4");
    }

    /**
     * Container's getter for OpportunityView2.
     * @return OpportunityView2
     */
    public ViewObjectImpl getOpportunityView2() {
        return (ViewObjectImpl) findViewObject("OpportunityView2");
    }

    /**
     * Container's getter for OpportunityView3.
     * @return OpportunityView3
     */
    public ViewObjectImpl getOpportunityView3() {
        return (ViewObjectImpl) findViewObject("OpportunityView3");
    }

    /**
     * Container's getter for ProductsView2.
     * @return ProductsView2
     */
    public ProductsViewImpl getProductsView2() {
        return (ProductsViewImpl) findViewObject("ProductsView2");
    }

    /**
     * Container's getter for RevenueitemView2.
     * @return RevenueitemView2
     */
    public ViewObjectImpl getRevenueitemView2() {
        return (ViewObjectImpl) findViewObject("RevenueitemView2");
    }

    /**
     * Container's getter for TaskView2.
     * @return TaskView2
     */
    public ViewObjectImpl getTaskView2() {
        return (ViewObjectImpl) findViewObject("TaskView2");
    }

    /**
     * Container's getter for TaskView3.
     * @return TaskView3
     */
    public ViewObjectImpl getTaskView3() {
        return (ViewObjectImpl) findViewObject("TaskView3");
    }

    /**
     * Container's getter for TaskView4.
     * @return TaskView4
     */
    public ViewObjectImpl getTaskView4() {
        return (ViewObjectImpl) findViewObject("TaskView4");
    }

    /**
     * Container's getter for UseraccountView2.
     * @return UseraccountView2
     */
    public ViewObjectImpl getUseraccountView2() {
        return (ViewObjectImpl) findViewObject("UseraccountView2");
    }

    /**
     * Container's getter for UserroleView2.
     * @return UserroleView2
     */
    public ViewObjectImpl getUserroleView2() {
        return (ViewObjectImpl) findViewObject("UserroleView2");
    }

    /**
     * Container's getter for UserroleView3.
     * @return UserroleView3
     */
    public ViewObjectImpl getUserroleView3() {
        return (ViewObjectImpl) findViewObject("UserroleView3");
    }

    /**
     * Container's getter for AppointmentsView3.
     * @return AppointmentsView3
     */
    public ViewObjectImpl getAppointmentsView3() {
        return (ViewObjectImpl) findViewObject("AppointmentsView3");
    }

    /**
     * Container's getter for InteractionView3.
     * @return InteractionView3
     */
    public ViewObjectImpl getInteractionView3() {
        return (ViewObjectImpl) findViewObject("InteractionView3");
    }

    /**
     * Container's getter for AppointmentsView4.
     * @return AppointmentsView4
     */
    public ViewObjectImpl getAppointmentsView4() {
        return (ViewObjectImpl) findViewObject("AppointmentsView4");
    }

    /**
     * Container's getter for CustomeraccountView2.
     * @return CustomeraccountView2
     */
    public ViewObjectImpl getCustomeraccountView2() {
        return (ViewObjectImpl) findViewObject("CustomeraccountView2");
    }

    /**
     * Container's getter for InteractionView4.
     * @return InteractionView4
     */
    public ViewObjectImpl getInteractionView4() {
        return (ViewObjectImpl) findViewObject("InteractionView4");
    }

    /**
     * Container's getter for InteractionView5.
     * @return InteractionView5
     */
    public ViewObjectImpl getInteractionView5() {
        return (ViewObjectImpl) findViewObject("InteractionView5");
    }

    /**
     * Container's getter for InviteesView3.
     * @return InviteesView3
     */
    public ViewObjectImpl getInviteesView3() {
        return (ViewObjectImpl) findViewObject("InviteesView3");
    }

    /**
     * Container's getter for AccountType1.
     * @return AccountType1
     */
    public AccountTypeImpl getAccountType1() {
        return (AccountTypeImpl) findViewObject("AccountType1");
    }

    /**
     * Container's getter for InviteesextView1.
     * @return InviteesextView1
     */
    public ViewObjectImpl getInviteesextView1() {
        return (ViewObjectImpl) findViewObject("InviteesextView1");
    }

    /**
     * Container's getter for AppointmentsView5.
     * @return AppointmentsView5
     */
    public ViewObjectImpl getAppointmentsView5() {
        return (ViewObjectImpl) findViewObject("AppointmentsView5");
    }

    /**
     * Container's getter for InviteesextView2.
     * @return InviteesextView2
     */
    public ViewObjectImpl getInviteesextView2() {
        return (ViewObjectImpl) findViewObject("InviteesextView2");
    }

    /**
     * Container's getter for InviteesextView3.
     * @return InviteesextView3
     */
    public ViewObjectImpl getInviteesextView3() {
        return (ViewObjectImpl) findViewObject("InviteesextView3");
    }

    /**
     * Container's getter for InviteesextView5.
     * @return InviteesextView5
     */
    public ViewObjectImpl getInviteesextView5() {
        return (ViewObjectImpl) findViewObject("InviteesextView5");
    }

    /**
     * Container's getter for InviteesView4.
     * @return InviteesView4
     */
    public ViewObjectImpl getInviteesView4() {
        return (ViewObjectImpl) findViewObject("InviteesView4");
    }

    /**
     * Container's getter for OpportunityView4.
     * @return OpportunityView4
     */
    public ViewObjectImpl getOpportunityView4() {
        return (ViewObjectImpl) findViewObject("OpportunityView4");
    }

    /**
     * Container's getter for AppointmentsView6.
     * @return AppointmentsView6
     */
    public ViewObjectImpl getAppointmentsView6() {
        return (ViewObjectImpl) findViewObject("AppointmentsView6");
    }

    /**
     * Container's getter for AppointmentsView8.
     * @return AppointmentsView8
     */
    public ViewObjectImpl getAppointmentsView8() {
        return (ViewObjectImpl) findViewObject("AppointmentsView8");
    }

    /**
     * Container's getter for InviteesextView4.
     * @return InviteesextView4
     */
    public ViewObjectImpl getInviteesextView4() {
        return (ViewObjectImpl) findViewObject("InviteesextView4");
    }

    /**
     * Container's getter for InviteesView5.
     * @return InviteesView5
     */
    public ViewObjectImpl getInviteesView5() {
        return (ViewObjectImpl) findViewObject("InviteesView5");
    }

    /**
     * Container's getter for InteractionView6.
     * @return InteractionView6
     */
    public ViewObjectImpl getInteractionView6() {
        return (ViewObjectImpl) findViewObject("InteractionView6");
    }

    /**
     * Container's getter for RoleView2.
     * @return RoleView2
     */
    public ViewObjectImpl getRoleView2() {
        return (ViewObjectImpl) findViewObject("RoleView2");
    }

    /**
     * Container's getter for CustomercontactsView3.
     * @return CustomercontactsView3
     */
    public CustomercontactsViewImpl getCustomercontactsView3() {
        return (CustomercontactsViewImpl) findViewObject("CustomercontactsView3");
    }

    /**
     * Container's getter for InviteesView6.
     * @return InviteesView6
     */
    public ViewObjectImpl getInviteesView6() {
        return (ViewObjectImpl) findViewObject("InviteesView6");
    }

    /**
     * Container's getter for UseraccountView3.
     * @return UseraccountView3
     */
    public ViewObjectImpl getUseraccountView3() {
        return (ViewObjectImpl) findViewObject("UseraccountView3");
    }

    /**
     * Container's getter for InviteesextView6.
     * @return InviteesextView6
     */
    public ViewObjectImpl getInviteesextView6() {
        return (ViewObjectImpl) findViewObject("InviteesextView6");
    }

    /**
     * Container's getter for CustomercontactsView4.
     * @return CustomercontactsView4
     */
    public CustomercontactsViewImpl getCustomercontactsView4() {
        return (CustomercontactsViewImpl) findViewObject("CustomercontactsView4");
    }

    /**
     * Container's getter for UseraccountView4.
     * @return UseraccountView4
     */
    public ViewObjectImpl getUseraccountView4() {
        return (ViewObjectImpl) findViewObject("UseraccountView4");
    }

    /**
     * Container's getter for UseraccountView5.
     * @return UseraccountView5
     */
    public ViewObjectImpl getUseraccountView5() {
        return (ViewObjectImpl) findViewObject("UseraccountView5");
    }

    /**
     * Container's getter for CustomercontactsView5.
     * @return CustomercontactsView5
     */
    public CustomercontactsViewImpl getCustomercontactsView5() {
        return (CustomercontactsViewImpl) findViewObject("CustomercontactsView5");
    }

    /**
     * Container's getter for CustomercontactsView6.
     * @return CustomercontactsView6
     */
    public CustomercontactsViewImpl getCustomercontactsView6() {
        return (CustomercontactsViewImpl) findViewObject("CustomercontactsView6");
    }

    /**
     * Container's getter for UseraccountView6.
     * @return UseraccountView6
     */
    public ViewObjectImpl getUseraccountView6() {
        return (ViewObjectImpl) findViewObject("UseraccountView6");
    }

    /**
     * Container's getter for ProductsView3.
     * @return ProductsView3
     */
    public ProductsViewImpl getProductsView3() {
        return (ProductsViewImpl) findViewObject("ProductsView3");
    }

    /**
     * Container's getter for OpportunityView5.
     * @return OpportunityView5
     */
    public ViewObjectImpl getOpportunityView5() {
        return (ViewObjectImpl) findViewObject("OpportunityView5");
    }

    /**
     * Container's getter for FilesView1.
     * @return FilesView1
     */
    public ViewObjectImpl getFilesView1() {
        return (ViewObjectImpl) findViewObject("FilesView1");
    }

    /**
     * Container's getter for FilesView2.
     * @return FilesView2
     */
    public ViewObjectImpl getFilesView2() {
        return (ViewObjectImpl) findViewObject("FilesView2");
    }

    /**
     * Container's getter for OpportunityView6.
     * @return OpportunityView6
     */
    public ViewObjectImpl getOpportunityView6() {
        return (ViewObjectImpl) findViewObject("OpportunityView6");
    }

    /**
     * Container's getter for FilesView3.
     * @return FilesView3
     */
    public ViewObjectImpl getFilesView3() {
        return (ViewObjectImpl) findViewObject("FilesView3");
    }

    /**
     * Container's getter for FilesView4.
     * @return FilesView4
     */
    public ViewObjectImpl getFilesView4() {
        return (ViewObjectImpl) findViewObject("FilesView4");
    }

    
   
    /*Method to set file path and name

        * @param name

        * @param path

        */

       public void setFileData(String name, String path,String contTyp) {

           ViewObject fileVo = this.getFilesView4();

           Row newRow = fileVo.createRow();

           newRow.setAttribute("Filename", name);

           newRow.setAttribute("Filepath", path);

           newRow.setAttribute("Filetype", contTyp);

           fileVo.insertRow(newRow);

           this.getDBTransaction().commit();

           fileVo.executeQuery();

       }
    /*Method to set file path and name

        * @param name

        * @param path

        */
       
    public void estimatedPrice(String pidStr) {
        
        Object pid=pidStr;
       RowSet rs=(RowSet)getProductsView1();
  
    
        while(rs.hasNext()) {
            System.out.println("Iinside while loop");
            ProductsViewRowImpl r=(ProductsViewRowImpl)rs.next();
            Object prodid=r.getAttribute("Productid");
            String prodidstr=prodid.toString();
            
            if(prodidstr.equals(pidStr)) {
               
                Object p=r.getAttribute("Price");
                DCIteratorBinding it = (DCIteratorBinding)BindingContext.getCurrent().getCurrentBindingsEntry().get("RevenueitemView2Iterator");   
                RowSetIterator rsIter = it .getRowSetIterator();
                Row rowObj = rsIter .getCurrentRow();
                rowObj.setAttribute("Estimatedprice", p);
                rs.closeRowSet();
                break;
            }
          
            
        }
    
    }


    /**
     * Container's getter for CaddressCustomercontactsFkLink1.
     * @return CaddressCustomercontactsFkLink1
     */
    public ViewLinkImpl getCaddressCustomercontactsFkLink1() {
        return (ViewLinkImpl) findViewLink("CaddressCustomercontactsFkLink1");
    }

    /**
     * Container's getter for AppointmentsContactsFkLink1.
     * @return AppointmentsContactsFkLink1
     */
    public ViewLinkImpl getAppointmentsContactsFkLink1() {
        return (ViewLinkImpl) findViewLink("AppointmentsContactsFkLink1");
    }

    /**
     * Container's getter for ContactAccountFkLink1.
     * @return ContactAccountFkLink1
     */
    public ViewLinkImpl getContactAccountFkLink1() {
        return (ViewLinkImpl) findViewLink("ContactAccountFkLink1");
    }

    /**
     * Container's getter for InteractionContactsFkLink1.
     * @return InteractionContactsFkLink1
     */
    public ViewLinkImpl getInteractionContactsFkLink1() {
        return (ViewLinkImpl) findViewLink("InteractionContactsFkLink1");
    }

    /**
     * Container's getter for InviteesAppointmentsFkLink1.
     * @return InviteesAppointmentsFkLink1
     */
    public ViewLinkImpl getInviteesAppointmentsFkLink1() {
        return (ViewLinkImpl) findViewLink("InviteesAppointmentsFkLink1");
    }

    /**
     * Container's getter for NoteAccountFkLink1.
     * @return NoteAccountFkLink1
     */
    public ViewLinkImpl getNoteAccountFkLink1() {
        return (ViewLinkImpl) findViewLink("NoteAccountFkLink1");
    }

    /**
     * Container's getter for NoteContactsFkLink1.
     * @return NoteContactsFkLink1
     */
    public ViewLinkImpl getNoteContactsFkLink1() {
        return (ViewLinkImpl) findViewLink("NoteContactsFkLink1");
    }

    /**
     * Container's getter for NoteOpportunityFkLink1.
     * @return NoteOpportunityFkLink1
     */
    public ViewLinkImpl getNoteOpportunityFkLink1() {
        return (ViewLinkImpl) findViewLink("NoteOpportunityFkLink1");
    }

    /**
     * Container's getter for OpportunityAccountFkLink1.
     * @return OpportunityAccountFkLink1
     */
    public ViewLinkImpl getOpportunityAccountFkLink1() {
        return (ViewLinkImpl) findViewLink("OpportunityAccountFkLink1");
    }

    /**
     * Container's getter for OpportunityContactFkLink1.
     * @return OpportunityContactFkLink1
     */
    public ViewLinkImpl getOpportunityContactFkLink1() {
        return (ViewLinkImpl) findViewLink("OpportunityContactFkLink1");
    }

    /**
     * Container's getter for ProductsRevenueitemFkLink1.
     * @return ProductsRevenueitemFkLink1
     */
    public ViewLinkImpl getProductsRevenueitemFkLink1() {
        return (ViewLinkImpl) findViewLink("ProductsRevenueitemFkLink1");
    }

    /**
     * Container's getter for RevenueitemOpportunityFkLink1.
     * @return RevenueitemOpportunityFkLink1
     */
    public ViewLinkImpl getRevenueitemOpportunityFkLink1() {
        return (ViewLinkImpl) findViewLink("RevenueitemOpportunityFkLink1");
    }

    /**
     * Container's getter for Opportunityid1Link1.
     * @return Opportunityid1Link1
     */
    public ViewLinkImpl getOpportunityid1Link1() {
        return (ViewLinkImpl) findViewLink("Opportunityid1Link1");
    }

    /**
     * Container's getter for TaskCustomeraccountFkLink1.
     * @return TaskCustomeraccountFkLink1
     */
    public ViewLinkImpl getTaskCustomeraccountFkLink1() {
        return (ViewLinkImpl) findViewLink("TaskCustomeraccountFkLink1");
    }

    /**
     * Container's getter for TaskCustomercontactsFkLink1.
     * @return TaskCustomercontactsFkLink1
     */
    public ViewLinkImpl getTaskCustomercontactsFkLink1() {
        return (ViewLinkImpl) findViewLink("TaskCustomercontactsFkLink1");
    }

    /**
     * Container's getter for UseraccountAccountFkLink1.
     * @return UseraccountAccountFkLink1
     */
    public ViewLinkImpl getUseraccountAccountFkLink1() {
        return (ViewLinkImpl) findViewLink("UseraccountAccountFkLink1");
    }

    /**
     * Container's getter for UserroleRoleFkLink1.
     * @return UserroleRoleFkLink1
     */
    public ViewLinkImpl getUserroleRoleFkLink1() {
        return (ViewLinkImpl) findViewLink("UserroleRoleFkLink1");
    }

    /**
     * Container's getter for UserroleUseraccountFkLink1.
     * @return UserroleUseraccountFkLink1
     */
    public ViewLinkImpl getUserroleUseraccountFkLink1() {
        return (ViewLinkImpl) findViewLink("UserroleUseraccountFkLink1");
    }

    /**
     * Container's getter for AppointmentsContactsFkLink2.
     * @return AppointmentsContactsFkLink2
     */
    public ViewLinkImpl getAppointmentsContactsFkLink2() {
        return (ViewLinkImpl) findViewLink("AppointmentsContactsFkLink2");
    }

    /**
     * Container's getter for InteractionContactsFkLink2.
     * @return InteractionContactsFkLink2
     */
    public ViewLinkImpl getInteractionContactsFkLink2() {
        return (ViewLinkImpl) findViewLink("InteractionContactsFkLink2");
    }

    /**
     * Container's getter for AppointmentAccountFkLink1.
     * @return AppointmentAccountFkLink1
     */
    public ViewLinkImpl getAppointmentAccountFkLink1() {
        return (ViewLinkImpl) findViewLink("AppointmentAccountFkLink1");
    }

    /**
     * Container's getter for InteractionAccountFKLink.
     * @return InteractionAccountFKLink
     */
    public ViewLinkImpl getInteractionAccountFKLink() {
        return (ViewLinkImpl) findViewLink("InteractionAccountFKLink");
    }

    /**
     * Container's getter for InteractionAccountFKLink1.
     * @return InteractionAccountFKLink1
     */
    public ViewLinkImpl getInteractionAccountFKLink1() {
        return (ViewLinkImpl) findViewLink("InteractionAccountFKLink1");
    }

    /**
     * Container's getter for InviteesAppointmentsFkLink2.
     * @return InviteesAppointmentsFkLink2
     */
    public ViewLinkImpl getInviteesAppointmentsFkLink2() {
        return (ViewLinkImpl) findViewLink("InviteesAppointmentsFkLink2");
    }

    /**
     * Container's getter for InviteesExt_AppoinmentFK_Link.
     * @return InviteesExt_AppoinmentFK_Link
     */
    public ViewLinkImpl getInviteesExt_AppoinmentFK_Link() {
        return (ViewLinkImpl) findViewLink("InviteesExt_AppoinmentFK_Link");
    }

    /**
     * Container's getter for InviteesExt_AppoinmentFK_Link1.
     * @return InviteesExt_AppoinmentFK_Link1
     */
    public ViewLinkImpl getInviteesExt_AppoinmentFK_Link1() {
        return (ViewLinkImpl) findViewLink("InviteesExt_AppoinmentFK_Link1");
    }

    /**
     * Container's getter for InviteesExt_AppoinmentFK_Link3.
     * @return InviteesExt_AppoinmentFK_Link3
     */
    public ViewLinkImpl getInviteesExt_AppoinmentFK_Link3() {
        return (ViewLinkImpl) findViewLink("InviteesExt_AppoinmentFK_Link3");
    }

    /**
     * Container's getter for InviteesAppointmentsFkLink3.
     * @return InviteesAppointmentsFkLink3
     */
    public ViewLinkImpl getInviteesAppointmentsFkLink3() {
        return (ViewLinkImpl) findViewLink("InviteesAppointmentsFkLink3");
    }

    /**
     * Container's getter for OpportunityAppointmentFkLink.
     * @return OpportunityAppointmentFkLink
     */
    public ViewLinkImpl getOpportunityAppointmentFkLink() {
        return (ViewLinkImpl) findViewLink("OpportunityAppointmentFkLink");
    }

    /**
     * Container's getter for OpportunityAppointmentFkLink2.
     * @return OpportunityAppointmentFkLink2
     */
    public ViewLinkImpl getOpportunityAppointmentFkLink2() {
        return (ViewLinkImpl) findViewLink("OpportunityAppointmentFkLink2");
    }

    /**
     * Container's getter for InviteesExt_AppoinmentFK_Link2.
     * @return InviteesExt_AppoinmentFK_Link2
     */
    public ViewLinkImpl getInviteesExt_AppoinmentFK_Link2() {
        return (ViewLinkImpl) findViewLink("InviteesExt_AppoinmentFK_Link2");
    }

    /**
     * Container's getter for InviteesAppointmentsFkLink4.
     * @return InviteesAppointmentsFkLink4
     */
    public ViewLinkImpl getInviteesAppointmentsFkLink4() {
        return (ViewLinkImpl) findViewLink("InviteesAppointmentsFkLink4");
    }

    /**
     * Container's getter for OpportunityInteractionFkLink1.
     * @return OpportunityInteractionFkLink1
     */
    public ViewLinkImpl getOpportunityInteractionFkLink1() {
        return (ViewLinkImpl) findViewLink("OpportunityInteractionFkLink1");
    }

    /**
     * Container's getter for RoleUserroleFkLink1.
     * @return RoleUserroleFkLink1
     */
    public ViewLinkImpl getRoleUserroleFkLink1() {
        return (ViewLinkImpl) findViewLink("RoleUserroleFkLink1");
    }

    /**
     * Container's getter for Invitees_Contacts_FkLink.
     * @return Invitees_Contacts_FkLink
     */
    public ViewLinkImpl getInvitees_Contacts_FkLink() {
        return (ViewLinkImpl) findViewLink("Invitees_Contacts_FkLink");
    }

    /**
     * Container's getter for Inviteesext_Useraccount_FKLink.
     * @return Inviteesext_Useraccount_FKLink
     */
    public ViewLinkImpl getInviteesext_Useraccount_FKLink() {
        return (ViewLinkImpl) findViewLink("Inviteesext_Useraccount_FKLink");
    }

    /**
     * Container's getter for Invitees_Contacts_FkLink1.
     * @return Invitees_Contacts_FkLink1
     */
    public ViewLinkImpl getInvitees_Contacts_FkLink1() {
        return (ViewLinkImpl) findViewLink("Invitees_Contacts_FkLink1");
    }

    /**
     * Container's getter for Inviteesext_Useraccount_FKLink1.
     * @return Inviteesext_Useraccount_FKLink1
     */
    public ViewLinkImpl getInviteesext_Useraccount_FKLink1() {
        return (ViewLinkImpl) findViewLink("Inviteesext_Useraccount_FKLink1");
    }

    /**
     * Container's getter for Inviteesext_Useraccount_FKLink2.
     * @return Inviteesext_Useraccount_FKLink2
     */
    public ViewLinkImpl getInviteesext_Useraccount_FKLink2() {
        return (ViewLinkImpl) findViewLink("Inviteesext_Useraccount_FKLink2");
    }

    /**
     * Container's getter for Invitees_Contacts_FkLink2.
     * @return Invitees_Contacts_FkLink2
     */
    public ViewLinkImpl getInvitees_Contacts_FkLink2() {
        return (ViewLinkImpl) findViewLink("Invitees_Contacts_FkLink2");
    }

    /**
     * Container's getter for Invitees_Contacts_FkLink3.
     * @return Invitees_Contacts_FkLink3
     */
    public ViewLinkImpl getInvitees_Contacts_FkLink3() {
        return (ViewLinkImpl) findViewLink("Invitees_Contacts_FkLink3");
    }

    /**
     * Container's getter for Inviteesext_Useraccount_FKLink3.
     * @return Inviteesext_Useraccount_FKLink3
     */
    public ViewLinkImpl getInviteesext_Useraccount_FKLink3() {
        return (ViewLinkImpl) findViewLink("Inviteesext_Useraccount_FKLink3");
    }

    /**
     * Container's getter for RevenueitemProductFkLink1.
     * @return RevenueitemProductFkLink1
     */
    public ViewLinkImpl getRevenueitemProductFkLink1() {
        return (ViewLinkImpl) findViewLink("RevenueitemProductFkLink1");
    }

    /**
     * Container's getter for FilesOpportunityFkLink.
     * @return FilesOpportunityFkLink
     */
    public ViewLinkImpl getFilesOpportunityFkLink() {
        return (ViewLinkImpl) findViewLink("FilesOpportunityFkLink");
    }

    /**
     * Container's getter for Files_Opportunity_FKLink.
     * @return Files_Opportunity_FKLink
     */
    public ViewLinkImpl getFiles_Opportunity_FKLink() {
        return (ViewLinkImpl) findViewLink("Files_Opportunity_FKLink");
    }

    /**
     * Container's getter for FilesOpportunityFkLink1.
     * @return FilesOpportunityFkLink1
     */
    public ViewLinkImpl getFilesOpportunityFkLink1() {
        return (ViewLinkImpl) findViewLink("FilesOpportunityFkLink1");
    }

    /**
     * Container's getter for CustomeraccountView3.
     * @return CustomeraccountView3
     */
    public ViewObjectImpl getCustomeraccountView3() {
        return (ViewObjectImpl) findViewObject("CustomeraccountView3");
    }

    /**
     * Container's getter for AddressView3.
     * @return AddressView3
     */
    public ViewObjectImpl getAddressView3() {
        return (ViewObjectImpl) findViewObject("AddressView3");
    }

    /**
     * Container's getter for AddressCustomerAccountFkLink.
     * @return AddressCustomerAccountFkLink
     */
    public ViewLinkImpl getAddressCustomerAccountFkLink() {
        return (ViewLinkImpl) findViewLink("AddressCustomerAccountFkLink");
    }

    /**
     * Container's getter for AddressView4.
     * @return AddressView4
     */
    public ViewObjectImpl getAddressView4() {
        return (ViewObjectImpl) findViewObject("AddressView4");
    }

    /**
     * Container's getter for AddressCustomerAccountFkLink2.
     * @return AddressCustomerAccountFkLink2
     */
    public ViewLinkImpl getAddressCustomerAccountFkLink2() {
        return (ViewLinkImpl) findViewLink("AddressCustomerAccountFkLink2");
    }

    /**
     * Container's getter for CustomercontactsView7.
     * @return CustomercontactsView7
     */
    public CustomercontactsViewImpl getCustomercontactsView7() {
        return (CustomercontactsViewImpl) findViewObject("CustomercontactsView7");
    }

    /**
     * Container's getter for AppointmentsView7.
     * @return AppointmentsView7
     */
    public ViewObjectImpl getAppointmentsView7() {
        return (ViewObjectImpl) findViewObject("AppointmentsView7");
    }

    /**
     * Container's getter for Contact_Appointments_Via_Invitees_Link.
     * @return Contact_Appointments_Via_Invitees_Link
     */
    public ViewLinkImpl getContact_Appointments_Via_Invitees_Link() {
        return (ViewLinkImpl) findViewLink("Contact_Appointments_Via_Invitees_Link");
    }

    /**
     * Container's getter for AppointmentsView10.
     * @return AppointmentsView10
     */
    public ViewObjectImpl getAppointmentsView10() {
        return (ViewObjectImpl) findViewObject("AppointmentsView10");
    }

    /**
     * Container's getter for Contact_Appointments_Via_Invitees_Link2.
     * @return Contact_Appointments_Via_Invitees_Link2
     */
    public ViewLinkImpl getContact_Appointments_Via_Invitees_Link2() {
        return (ViewLinkImpl) findViewLink("Contact_Appointments_Via_Invitees_Link2");
    }
}
