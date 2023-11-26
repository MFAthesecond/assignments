package week_09.Question_09_02;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice=34.5;
    double currentPrice=34.35;
    Stock(){

    }
    Stock (String newSymbol,String newName){
        symbol=newSymbol;
        name=newName;
    }
    double getChangePercent(){
        return (currentPrice/previousClosingPrice)/100;
    }

}
