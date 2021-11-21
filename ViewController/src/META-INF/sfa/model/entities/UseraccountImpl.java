package sfa.model.entities;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Nov 21 09:59:01 IST 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class UseraccountImpl extends EntityImpl {
    /**
     * Validation method for Supervisor.
     */
    public boolean validateSupervisor(BigDecimal supervisor) {
        if((supervisor.compareTo(getUseraccountid())==0)) {
                   return false;
               }
               
               return true;
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Useraccountid,
        Firstname,
        Middlename,
        Lastname,
        Password,
        Startdate,
        Enddate,
        Corporatecustomerreferenceid1,
        Supervisor,
        Customeraccount,
        Userrole,
        Inviteesext;
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

    public static final int USERACCOUNTID = AttributesEnum.Useraccountid.index();
    public static final int FIRSTNAME = AttributesEnum.Firstname.index();
    public static final int MIDDLENAME = AttributesEnum.Middlename.index();
    public static final int LASTNAME = AttributesEnum.Lastname.index();
    public static final int PASSWORD = AttributesEnum.Password.index();
    public static final int STARTDATE = AttributesEnum.Startdate.index();
    public static final int ENDDATE = AttributesEnum.Enddate.index();
    public static final int CORPORATECUSTOMERREFERENCEID1 = AttributesEnum.Corporatecustomerreferenceid1.index();
    public static final int SUPERVISOR = AttributesEnum.Supervisor.index();
    public static final int CUSTOMERACCOUNT = AttributesEnum.Customeraccount.index();
    public static final int USERROLE = AttributesEnum.Userrole.index();
    public static final int INVITEESEXT = AttributesEnum.Inviteesext.index();

    /**
     * This is the default constructor (do not remove).
     */
    public UseraccountImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("sfa.model.entities.Useraccount");
    }

    /**
     * Gets the attribute value for Useraccountid, using the alias name Useraccountid.
     * @return the value of Useraccountid
     */
    public BigDecimal getUseraccountid() {
        return (BigDecimal) getAttributeInternal(USERACCOUNTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Useraccountid.
     * @param value value to set the Useraccountid
     */
    public void setUseraccountid(BigDecimal value) {
        setAttributeInternal(USERACCOUNTID, value);
    }

    /**
     * Gets the attribute value for Firstname, using the alias name Firstname.
     * @return the value of Firstname
     */
    public String getFirstname() {
        return (String) getAttributeInternal(FIRSTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for Firstname.
     * @param value value to set the Firstname
     */
    public void setFirstname(String value) {
        setAttributeInternal(FIRSTNAME, value);
    }

    /**
     * Gets the attribute value for Middlename, using the alias name Middlename.
     * @return the value of Middlename
     */
    public String getMiddlename() {
        return (String) getAttributeInternal(MIDDLENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for Middlename.
     * @param value value to set the Middlename
     */
    public void setMiddlename(String value) {
        setAttributeInternal(MIDDLENAME, value);
    }

    /**
     * Gets the attribute value for Lastname, using the alias name Lastname.
     * @return the value of Lastname
     */
    public String getLastname() {
        return (String) getAttributeInternal(LASTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for Lastname.
     * @param value value to set the Lastname
     */
    public void setLastname(String value) {
        setAttributeInternal(LASTNAME, value);
    }

    /**
     * Gets the attribute value for Password, using the alias name Password.
     * @return the value of Password
     */
    public String getPassword() {
        return (String) getAttributeInternal(PASSWORD);
    }

    /**
     * Sets <code>value</code> as the attribute value for Password.
     * @param value value to set the Password
     */
    public void setPassword(String value) {
        setAttributeInternal(PASSWORD, value);
    }

    /**
     * Gets the attribute value for Startdate, using the alias name Startdate.
     * @return the value of Startdate
     */
    public Timestamp getStartdate() {
        return (Timestamp) getAttributeInternal(STARTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Startdate.
     * @param value value to set the Startdate
     */
    public void setStartdate(Timestamp value) {
        setAttributeInternal(STARTDATE, value);
    }

    /**
     * Gets the attribute value for Enddate, using the alias name Enddate.
     * @return the value of Enddate
     */
    public Timestamp getEnddate() {
        return (Timestamp) getAttributeInternal(ENDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Enddate.
     * @param value value to set the Enddate
     */
    public void setEnddate(Timestamp value) {
        setAttributeInternal(ENDDATE, value);
    }

    /**
     * Gets the attribute value for Corporatecustomerreferenceid1, using the alias name Corporatecustomerreferenceid1.
     * @return the value of Corporatecustomerreferenceid1
     */
    public BigDecimal getCorporatecustomerreferenceid1() {
        return (BigDecimal) getAttributeInternal(CORPORATECUSTOMERREFERENCEID1);
    }

    /**
     * Sets <code>value</code> as the attribute value for Corporatecustomerreferenceid1.
     * @param value value to set the Corporatecustomerreferenceid1
     */
    public void setCorporatecustomerreferenceid1(BigDecimal value) {
        setAttributeInternal(CORPORATECUSTOMERREFERENCEID1, value);
    }

    /**
     * Gets the attribute value for Supervisor, using the alias name Supervisor.
     * @return the value of Supervisor
     */
    public BigDecimal getSupervisor() {
        return (BigDecimal) getAttributeInternal(SUPERVISOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for Supervisor.
     * @param value value to set the Supervisor
     */
    public void setSupervisor(BigDecimal value) {
        setAttributeInternal(SUPERVISOR, value);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getUserrole() {
        return (RowIterator) getAttributeInternal(USERROLE);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getInviteesext() {
        return (RowIterator) getAttributeInternal(INVITEESEXT);
    }

    /**
     * @param useraccountid key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal useraccountid) {
        return new Key(new Object[] { useraccountid });
    }


}
