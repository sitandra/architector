import java.math.BigDecimal;
import java.util.Date;

public class Ticket{
    private long id;
    private int depatureZone;
    private int arrivalZone;
    private int routeNumber;
    private Date depatureTime;
    private Date arrivalTime;
    private long buyerId;
    private boolean isUsed;
    private BigDecimal price;
    private String place;

    public void setId(long id) {
        this.id = id;
    }

    public void setDepatureZone(int depatureZone) {
        this.depatureZone = depatureZone;
    }

    public void setArrivalZone(int arrivalZone) {
        this.arrivalZone = arrivalZone;
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }

    public void setDepatureTime(Date depatureTime) {
        this.depatureTime = depatureTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setBuyerId(long buyerId) {
        this.buyerId = buyerId;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public long getId() {
        return id;
    }

    public int getDepatureZone() {
        return depatureZone;
    }

    public int getArrivalZone() {
        return arrivalZone;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public Date getDepatureTime() {
        return depatureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public long getBuyerId() {
        return buyerId;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getPlace() {
        return place;
    }
}