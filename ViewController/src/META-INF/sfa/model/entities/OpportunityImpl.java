package sfa.model.entities;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.*;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Nov 11 13:07:19 IST 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class OpportunityImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Opportunityid,
        Accountid,
        Description,
        Winprobability,
        Closedate,
        Primarycontact,
        Salesstage,
        Salesmethod,
        Bestcaserevenue,
        Worstcaserevenue,
        Budgetavailable,
        Risklevel,
        Title,
        Totalrevenue,
        Note,
        Customeraccount,
        Customercontacts,
        Revenueitem,
        Task,
        Appointments,
        Files,
        Files1;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int OPPORTUNITYID = AttributesEnum.Opportunityid.index();
    public static final int ACCOUNTID = AttributesEnum.Accountid.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int WINPROBABILITY = AttributesEnum.Winprobability.index();
    public static final int CLOSEDATE = AttributesEnum.Closedate.index();
    public static final int PRIMARYCONTACT = AttributesEnum.Primarycontact.index();
    public static final int SALESSTAGE = AttributesEnum.Salesstage.index();
    public static final int SALESMETHOD = AttributesEnum.Salesmethod.index();
    public static final int BESTCASEREVENUE = AttributesEnum.Bestcaserevenue.index();
    public static final int WORSTCASEREVENUE = AttributesEnum.Worstcaserevenue.index();
    public static final int BUDGETAVAILABLE = AttributesEnum.Budgetavailable.index();
    public static final int RISKLEVEL = AttributesEnum.Risklevel.index();
    public static final int TITLE = AttributesEnum.Title.index();
    public static final int TOTALREVENUE = AttributesEnum.Totalrevenue.index();
    public static final int NOTE = AttributesEnum.Note.index();
    public static final int CUSTOMERACCOUNT = AttributesEnum.Customeraccount.index();
    public static final int CUSTOMERCONTACTS = AttributesEnum.Customercontacts.index();
    public static final int REVENUEITEM = AttributesEnum.Revenueitem.index();
    public static final int TASK = AttributesEnum.Task.index();
    public static final int APPOINTMENTS = AttributesEnum.Appointments.index();
    public static final int FILES = AttributesEnum.Files.index();
    public static final int FILES1 = AttributesEnum.Files1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public OpportunityImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("sfa.model.entities.Opportunity");
    }


    /**
     * Gets the attribute value for Opportunityid, using the alias name Opportunityid.
     * @return the value of Opportunityid
     */
    public BigDecimal getOpportunityid() {
        return (BigDecimal) getAttributeInternal(OPPORTUNITYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Opportunityid.
     * @param value value to set the Opportunityid
     */
    public void setOpportunityid(BigDecimal value) {
        setAttributeInternal(OPPORTUNITYID, value);
    }

    /**
     * Gets the attribute value for Accountid, using the alias name Accountid.
     * @return the value of Accountid
     */
    public BigDecimal getAccountid() {
        return (BigDecimal) getAttributeInternal(ACCOUNTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Accountid.
     * @param value value to set the Accountid
     */
    public void setAccountid(BigDecimal value) {
        setAttributeInternal(ACCOUNTID, value);
    }

    /**
     * Gets the attribute value for Description, using the alias name Description.
     * @return the value of Description
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Description.
     * @param value value to set the Description
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for Winprobability, using the alias name Winprobability.
     * @return the value of Winprobability
     */
    public BigDecimal getWinprobability() {
        return (BigDecimal) getAttributeInternal(WINPROBABILITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Winprobability.
     * @param value value to set the Winprobability
     */
    public void setWinprobability(BigDecimal value) {
        setAttributeInternal(WINPROBABILITY, value);
    }

    /**
     * Gets the attribute value for Closedate, using the alias name Closedate.
     * @return the value of Closedate
     */
    public Timestamp getClosedate() {
        return (Timestamp) getAttributeInternal(CLOSEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Closedate.
     * @param value value to set the Closedate
     */
    public void setClosedate(Timestamp value) {
        setAttributeInternal(CLOSEDATE, value);
    }

    /**
     * Gets the attribute value for Primarycontact, using the alias name Primarycontact.
     * @return the value of Primarycontact
     */
    public BigDecimal getPrimarycontact() {
        return (BigDecimal) getAttributeInternal(PRIMARYCONTACT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Primarycontact.
     * @param value value to set the Primarycontact
     */
    public void setPrimarycontact(BigDecimal value) {
        setAttributeInternal(PRIMARYCONTACT, value);
    }

    /**
     * Gets the attribute value for Salesstage, using the alias name Salesstage.
     * @return the value of Salesstage
     */
    public String getSalesstage() {
        return (String) getAttributeInternal(SALESSTAGE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Salesstage.
     * @param value value to set the Salesstage
     */
    public void setSalesstage(String value) {
        setAttributeInternal(SALESSTAGE, value);
    }

    /**
     * Gets the attribute value for Salesmethod, using the alias name Salesmethod.
     * @return the value of Salesmethod
     */
    public String getSalesmethod() {
        return (String) getAttributeInternal(SALESMETHOD);
    }

    /**
     * Sets <code>value</code> as the attribute value for Salesmethod.
     * @param value value to set the Salesmethod
     */
    public void setSalesmethod(String value) {
        setAttributeInternal(SALESMETHOD, value);
    }

    /**
     * Gets the attribute value for Bestcaserevenue, using the alias name Bestcaserevenue.
     * @return the value of Bestcaserevenue
     */
    public BigDecimal getBestcaserevenue() {
        return (BigDecimal) getAttributeInternal(BESTCASEREVENUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Bestcaserevenue.
     * @param value value to set the Bestcaserevenue
     */
    public void setBestcaserevenue(BigDecimal value) {
        setAttributeInternal(BESTCASEREVENUE, value);
    }

    /**
     * Gets the attribute value for Worstcaserevenue, using the alias name Worstcaserevenue.
     * @return the value of Worstcaserevenue
     */
    public BigDecimal getWorstcaserevenue() {
        return (BigDecimal) getAttributeInternal(WORSTCASEREVENUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Worstcaserevenue.
     * @param value value to set the Worstcaserevenue
     */
    public void setWorstcaserevenue(BigDecimal value) {
        setAttributeInternal(WORSTCASEREVENUE, value);
    }

    /**
     * Gets the attribute value for Budgetavailable, using the alias name Budgetavailable.
     * @return the value of Budgetavailable
     */
    public BigDecimal getBudgetavailable() {
        return (BigDecimal) getAttributeInternal(BUDGETAVAILABLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Budgetavailable.
     * @param value value to set the Budgetavailable
     */
    public void setBudgetavailable(BigDecimal value) {
        setAttributeInternal(BUDGETAVAILABLE, value);
    }

    /**
     * Gets the attribute value for Risklevel, using the alias name Risklevel.
     * @return the value of Risklevel
     */
    public String getRisklevel() {
        return (String) getAttributeInternal(RISKLEVEL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Risklevel.
     * @param value value to set the Risklevel
     */
    public void setRisklevel(String value) {
        setAttributeInternal(RISKLEVEL, value);
    }

    /**
     * Gets the attribute value for Title, using the alias name Title.
     * @return the value of Title
     */
    public String getTitle() {
        return (String) getAttributeInternal(TITLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Title.
     * @param value value to set the Title
     */
    public void setTitle(String value) {
        setAttributeInternal(TITLE, value);
    }

    /**
     * Gets the attribute value for Totalrevenue, using the alias name Totalrevenue.
     * @return the value of Totalrevenue
     */
    public BigDecimal getTotalrevenue() {
        return (BigDecimal) getAttributeInternal(TOTALREVENUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Totalrevenue.
     * @param value value to set the Totalrevenue
     */
    public void setTotalrevenue(BigDecimal value) {
        setAttributeInternal(TOTALREVENUE, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getNote() {
        return (RowIterator) getAttributeInternal(NOTE);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getCustomeraccount() {
        return (EntityImpl) getAttributeInternal(CUSTOMERACCOUNT);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setCustomeraccount(EntityImpl value) {
        setAttributeInternal(CUSTOMERACCOUNT, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getCustomercontacts() {
        return (EntityImpl) getAttributeInternal(CUSTOMERCONTACTS);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setCustomercontacts(EntityImpl value) {
        setAttributeInternal(CUSTOMERCONTACTS, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getRevenueitem() {
        return (RowIterator) getAttributeInternal(REVENUEITEM);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTask() {
        return (RowIterator) getAttributeInternal(TASK);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getAppointments() {
        return (RowIterator) getAttributeInternal(APPOINTMENTS);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getFiles() {
        return (RowIterator) getAttributeInternal(FILES);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getFiles1() {
        return (RowIterator) getAttributeInternal(FILES1);
    }


    /**
     * @param opportunityid key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal opportunityid) {
        return new Key(new Object[] { opportunityid });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        SequenceImpl seq= new SequenceImpl("COMMONSEQUENCE",getDBTransaction().getRootApplicationModule());
                BigDecimal noteid=new BigDecimal(seq.getSequenceNumber().toString());
                setOpportunityid(noteid);
        super.create(attributeList);
    }
}

