package com.example.buddies.menuaddingapp;

public class MyDataModel {


    String itemQty[]= new String[10000];
    String mCategory[] = new String[10000];
    String mDiscount []= new String[10000];
    String mItemDescription[] = new String[10000];
    String mItemName[] = new String[10000];
    String mItemPrice[] = new String[10000];
    String mItemStock []= new String[10000];
    String mItemType[] = new String[10000];
    String mSubCategory[] = new String[10000];
            String mRType[]= new String[10000];

  public int length()
  {
      int len = (Integer)itemQty.length;
      return len;
  }

    public String getItemQty(int a) {
        return itemQty[a];
    }
public String getmRType(int b)
{
    return mRType[b];
}
    public String getmCategory(int c) {
        return mCategory[c];
    }

    public String getmDiscount(int d) {
        return mDiscount[d];
    }

    public String getmItemDescription(int e) {
        return mItemDescription[e];
    }

    public String getmItemName(int f) {
        return mItemName[f];
    }

    public String getmItemPrice(int g) {
        return mItemPrice[g];
    }

    public String getmItemStock(int h) {
        return mItemStock[h];
    }

    public String getmItemType(int k) {
        return mItemType[k];
    }

    public String getmSubCategory(int l) {
        return mSubCategory[l];
    }

    public void setItemQty(String itemQty,int m) {
        this.itemQty[m] = itemQty;
    }

    public void setmCategory(String mCategory,int n) {
        this.mCategory[n] = mCategory;
    }

    public void setmDiscount(String mDiscount,int o) {
        this.mDiscount[o] = mDiscount;
    }

    public void setmItemDescription(String mItemDescription,int p) {
        this.mItemDescription[p] = mItemDescription;
    }
public void setmRType(String mRType,int q)
{
    this.mRType[q] = mRType;
}
    public void setmItemName(String mItemName,int r) {
        this.mItemName[r] = mItemName;
    }

    public void setmItemPrice(String mItemPrice,int s) {
        this.mItemPrice[s] = mItemPrice;
    }

    public void setmItemStock(String mItemStock,int t) {
        this.mItemStock[t] = mItemStock;
    }

    public void setmItemType(String mItemType,int u) {
        this.mItemType[u] = mItemType;
    }

    public void setmSubCategory(String mSubCategory,int v) {
        this.mSubCategory[v] = mSubCategory;
    }
}
