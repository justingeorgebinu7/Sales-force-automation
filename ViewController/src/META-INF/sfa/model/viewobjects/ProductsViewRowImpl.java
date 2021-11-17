package sfa.model.viewobjects;

import java.math.BigDecimal;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;

import sfa.model.viewobjects.common.ProductsViewRow;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Nov 14 11:00:16 IST 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ProductsViewRowImpl extends ViewRowImpl implements ProductsViewRow {


    public static final int ENTITY_PRODUCTS = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Productid,
        Name,
        Description,
        Price,
        Category,
        Revenueitem,
        Categoryid,
        RevenueitemView,
        CategoryView,
        ProductCategory1,
        CategoryView1,
        CategoryView2;
        private static AttributesEnum[] vals = null;
        ;
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


    public static final int PRODUCTID = AttributesEnum.Productid.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int PRICE = AttributesEnum.Price.index();
    public static final int CATEGORY = AttributesEnum.Category.index();
    public static final int REVENUEITEM = AttributesEnum.Revenueitem.index();
    public static final int CATEGORYID = AttributesEnum.Categoryid.index();
    public static final int REVENUEITEMVIEW = AttributesEnum.RevenueitemView.index();
    public static final int CATEGORYVIEW = AttributesEnum.CategoryView.index();
    public static final int PRODUCTCATEGORY1 = AttributesEnum.ProductCategory1.index();
    public static final int CATEGORYVIEW1 = AttributesEnum.CategoryView1.index();
    public static final int CATEGORYVIEW2 = AttributesEnum.CategoryView2.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ProductsViewRowImpl() {
    }

    /**
     * Gets Products entity object.
     * @return the Products
     */
    public EntityImpl getProducts() {
        return (EntityImpl) getEntity(ENTITY_PRODUCTS);
    }

    /**
     * Gets the attribute value for PRODUCTID using the alias name Productid.
     * @return the PRODUCTID
     */
    public BigDecimal getProductid() {
        return (BigDecimal) getAttributeInternal(PRODUCTID);
    }

    /**
     * Sets <code>value</code> as attribute value for PRODUCTID using the alias name Productid.
     * @param value value to set the PRODUCTID
     */
    public void setProductid(BigDecimal value) {
        setAttributeInternal(PRODUCTID, value);
    }

    /**
     * Gets the attribute value for NAME using the alias name Name.
     * @return the NAME
     */
    public String getName() {
        return (String) getAttributeInternal(NAME);
    }

    /**
     * Sets <code>value</code> as attribute value for NAME using the alias name Name.
     * @param value value to set the NAME
     */
    public void setName(String value) {
        setAttributeInternal(NAME, value);
    }

    /**
     * Gets the attribute value for DESCRIPTION using the alias name Description.
     * @return the DESCRIPTION
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for DESCRIPTION using the alias name Description.
     * @param value value to set the DESCRIPTION
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for PRICE using the alias name Price.
     * @return the PRICE
     */
    public BigDecimal getPrice() {
        return (BigDecimal) getAttributeInternal(PRICE);
    }

    /**
     * Sets <code>value</code> as attribute value for PRICE using the alias name Price.
     * @param value value to set the PRICE
     */
    public void setPrice(BigDecimal value) {
        setAttributeInternal(PRICE, value);
    }

    /**
     * Gets the attribute value for CATEGORY using the alias name Category.
     * @return the CATEGORY
     */
    public String getCategory() {
        return (String) getAttributeInternal(CATEGORY);
    }

    /**
     * Sets <code>value</code> as attribute value for CATEGORY using the alias name Category.
     * @param value value to set the CATEGORY
     */
    public void setCategory(String value) {
        setAttributeInternal(CATEGORY, value);
    }

    /**
     * Gets the attribute value for REVENUEITEM using the alias name Revenueitem.
     * @return the REVENUEITEM
     */
    public BigDecimal getRevenueitem() {
        return (BigDecimal) getAttributeInternal(REVENUEITEM);
    }

    /**
     * Sets <code>value</code> as attribute value for REVENUEITEM using the alias name Revenueitem.
     * @param value value to set the REVENUEITEM
     */
    public void setRevenueitem(BigDecimal value) {
        setAttributeInternal(REVENUEITEM, value);
    }

    /**
     * Gets the attribute value for CATEGORYID using the alias name Categoryid.
     * @return the CATEGORYID
     */
    public BigDecimal getCategoryid() {
        return (BigDecimal) getAttributeInternal(CATEGORYID);
    }

    /**
     * Sets <code>value</code> as attribute value for CATEGORYID using the alias name Categoryid.
     * @param value value to set the CATEGORYID
     */
    public void setCategoryid(BigDecimal value) {
        setAttributeInternal(CATEGORYID, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link RevenueitemView.
     */
    public RowIterator getRevenueitemView() {
        return (RowIterator) getAttributeInternal(REVENUEITEMVIEW);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link CategoryView.
     */
    public Row getCategoryView() {
        return (Row) getAttributeInternal(CATEGORYVIEW);
    }

    /**
     * Sets the master-detail link CategoryView between this object and <code>value</code>.
     */
    public void setCategoryView(Row value) {
        setAttributeInternal(CATEGORYVIEW, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ProductCategory1.
     */
    public RowSet getProductCategory1() {
        return (RowSet) getAttributeInternal(PRODUCTCATEGORY1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> CategoryView1.
     */
    public RowSet getCategoryView1() {
        return (RowSet) getAttributeInternal(CATEGORYVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> CategoryView2.
     */
    public RowSet getCategoryView2() {
        return (RowSet) getAttributeInternal(CATEGORYVIEW2);
    }
}

