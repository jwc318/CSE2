//My name is Joey Carney
//hw02 -- Arithmetic.java
//Date: 9/9/14

public class Arithmetic {
    public static void main(String[] args) {
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        double sockCost$=2.58;
        
        System.out.println("The buyer will buy " + nSocks + " pairs of socks, and the price for each pair is $" + sockCost$);

        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;

        System.out.println("The buyer will buy " + nGlasses + " Glasses, and the price for each glass is $" + glassCost$);
        
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        
        System.out.println("The buyer will buy " + nEnvelopes + " Envelope, and the price for each envelope is $" + envelopeCost$);
       
       
       
        //compute costs of each item
        double totalSockCost = nSocks * sockCost$;
        System.out.printf("The total cost of socks is $%.2f\n", totalSockCost);
        double totalGlassCost = nGlasses * glassCost$;
        System.out.printf("The total cost of Glasses is $%.2f\n", totalGlassCost);
        double totalEnvelopeCost = nEnvelopes * envelopeCost$;
        System.out.printf("The total cost of Envelopes is $%.2f\n", totalEnvelopeCost);
        
        //compute total cost of all items bought
        double totalCost = totalSockCost + totalGlassCost + totalEnvelopeCost;
        System.out.println("The total cost of all items before tax is $" + totalCost);
        
        //compute price that is actually paid for(with sales tax)
        
        double totalAmountPaid = totalCost + (totalCost * taxPercent);
        System.out.println("The total amount paid is $" + totalAmountPaid);

    }
}