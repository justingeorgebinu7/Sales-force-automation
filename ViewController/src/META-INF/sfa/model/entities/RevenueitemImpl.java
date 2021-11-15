package sfa.model.entities;

import java.math.BigDecimal;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.*;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Nov 14 10:52:56 IST 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class RevenueitemImpl extends EntityImpl {
    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        SequenceImpl seq= new SequenceImpl("COMMONSEQUENCE",getDBTransaction().getRootApplicationModule());
                BigDecimal noteid=new BigDecimal(seq.getSequenceNumber().toString());
                setRevenueitemid(noteid);
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Revenueitemid,
        Quantity,
        Estimatedprice,
        Revenue,
        Bestcaserevenue,
        Worstcaserevenue,
        Opportunityid,
        Productid,
        Products,
        Opportunity,
        Products1;
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

    public static final int REVENUEITEMID = AttributesEnum.Revenueitemid.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int ESTIMATEDPRICE = AttributesEnum.Estimatedprice.index();
    public static final int REVENUE = AttributesEnum.Revenue.index();
    public static final int BESTCASEREVENUE = AttributesEnum.Bestcaserevenue.index();
    public static final int WORSTCASEREVENUE = AttributesEnum.Worstcaserevenue.index();
    public static final int OPPORTUNITYID = AttributesEnum.Opportunityid.index();
    public static final int PRODUCTID = AttributesEnum.Productid.index();
    public static final int PRODUCTS = AttributesEnum.Products.index();
    public static final int OPPORTUNITY = AttributesEnum.Opportunity.index();
    public static final int PRODUCTS1 = AttributesEnum.Products1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public RevenueitemImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("sfa.model.entities.Revenueitem");
    }

    /**
     * Gets the attribute value for Revenueitemid, using the alias name Revenueitemid.
     * @return the value of Revenueitemid
     */
    public BigDecimal getRevenueitemid() {
        return (BigDecimal) getAttributeInternal(REVENUEITEMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Revenueitemid.
     * @param value value to set the Revenueitemid
     */
    public void setRevenueitemid(BigDecimal value) {
        setAttributeInternal(REVENUEITEMID, value);
    }

    /**
     * Gets the attribute value for Quantity, using the alias name Quantity.
     * @return the value of Quantity
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) getAttributeInternal(QUANTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Quantity.
     * @param value value to set the Quantity
     */
    public void setQuantity(BigDecimal value) {
        setAttributeInternal(QUANTITY, value);
    }

    /**
     * Gets the attribute value for Estimatedprice, using the alias name Estimatedprice.
     * @return the value of Estimatedprice
     */
    public BigDecimal getEstimatedprice() {
        return (BigDecimal) getAttributeInternal(ESTIMATEDPRICE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Estimatedprice.
     * @param value value to set the Estimatedprice
     */
    public void setEstimatedprice(BigDecimal value) {
        setAttributeInternal(ESTIMATEDPRICE, value);
    }

    /**
     * Gets the attribute value for Revenue, using the alias name Revenue.
     * @return the value of Revenue
     */
    public BigDecimal getRevenue() {
        return (BigDecimal) getAttributeInternal(REVENUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Revenue.
     * @param value value to set the Revenue
     */
    public void setRevenue(BigDecimal value) {
        setAttributeInternal(REVENUE, value);
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
     * Gets the attribute value for Productid, using the alias name Productid.
     * @return the value of Productid
     */
    public BigDecimal getProductid() {
        return (BigDecimal) getAttributeInternal(PRODUCTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Productid.
     * @param value value to set the Productid
     */
    public void setProductid(BigDecimal value) {
        setAttributeInternal(PRODUCTID, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getProducts() {
        return (EntityImpl) getAttributeInternal(PRODUCTS);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setProducts(EntityImpl value) {
        setAttributeInternal(PRODUCTS, value);
    }

    /**
     * @return the associated entity OpportunityImpl.
     */
    public OpportunityImpl getOpportunity() {
        return (OpportunityImpl) getAttributeInternal(OPPORTUNITY);
    }

    /**
     * Sets <code>value</code> as the associated entity OpportunityImpl.
     */
    public void setOpportunity(OpportunityImpl value) {
        setAttributeInternal(OPPORTUNITY, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getProducts1() {
        return (EntityImpl) getAttributeInternal(PRODUCTS1);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setProducts1(EntityImpl value) {
        setAttributeInternal(PRODUCTS1, value);
    }

    /**
     * @param revenueitemid key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal revenueitemid) {
        return new Key(new Object[] { revenueitemid });
    }


}
