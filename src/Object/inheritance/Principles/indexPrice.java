package Object.inheritance.Principles;

public class indexPrice extends indexHeight {
    public indexPrice(int length, int width, int height, double weight, double cost) {
        super(length, width, height, weight);
        this.cost = cost;
    }

    double cost;

    indexPrice(){
        super();
        this.cost=0;
    }

    indexPrice(int side,double weight,double price){
        super(side, weight);
        this.cost=price;
    }

    indexPrice(indexPrice other){
        super(other);
        this.cost=other.cost;


    }

}
