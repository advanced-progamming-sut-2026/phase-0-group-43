package model.greenhouse.shop;

public class Shop {

    private List permanentList;
    private Daily dailyOffer;

    public Shop() {
        this.permanentList = new List();
        this.dailyOffer    = new Daily();
    }

    public List getPermanentList()  { return permanentList; }
    public Daily getDailyOffer()    { return dailyOffer; }

    public void setDailyOffer(Daily dailyOffer) { this.dailyOffer = dailyOffer; }
}