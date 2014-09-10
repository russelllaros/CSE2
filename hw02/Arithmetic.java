////////////////////////////////
//Russell Laros
//CSE02
//hw02 - Arithmetic
//

public class Arithmetic {
    //Class
    public static void main(String[] args) { //Main Method
        //Number of pairs of socks
        int nSocks=3;
        //cost per pair of socks
        //(‘$’ is part of the name)
        double sockCost$=2.58;

        //number of glasses
        int nGlasses=6;
        //cost per glass
        double glassCost$=2.29;

        //number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        
        //Now must do math for the variables
        double preTaxTotalSockCost$=(sockCost$ * nSocks); //pre tax total of all items
        double taxSockCost$=(sockCost$ * nSocks * taxPercent); //tax price of all items minus actual item cost
        double totalSockCostTax$=(preTaxTotalSockCost$ + taxSockCost$); //total price of items plus tax
        
        double preTaxTotalGlassCost$=glassCost$ * nGlasses; //pre tax total of all items
        double taxGlassCost$=(glassCost$ * nGlasses * taxPercent); //tax price of all items minus actual item cost
        double totalGlassCostTax$=(preTaxTotalGlassCost$ + taxGlassCost$); //total price of items plus tax
        
        double preTaxTotalEnvelopeCost$=(envelopeCost$ * nEnvelopes); //pre tax total of all items
        double taxEnvelopeCost$=(envelopeCost$ * nEnvelopes * taxPercent); //tax price of all items minus actual item cost
        double totalEnvelopeCostTax$=(preTaxTotalEnvelopeCost$ + taxEnvelopeCost$); //total price of items plus tax
        
        double preTaxTotalAll$=(preTaxTotalSockCost$ + preTaxTotalGlassCost$ + preTaxTotalEnvelopeCost$);//pre tax total of all items
        double totalAllTax$=(totalSockCostTax$ + totalGlassCostTax$ + totalEnvelopeCostTax$);//total of items with tax
        double itemsTotalTax$=((preTaxTotalSockCost$ + preTaxTotalEnvelopeCost$ + preTaxTotalGlassCost$) * (taxPercent));//total tax on all items
        
        System.out.println("Total before tax for Socks is "+preTaxTotalSockCost$); //print total of socks without tax
        System.out.printf("\nTax on Socks %.2f",taxSockCost$); //print tax on socks purchased
        System.out.printf("\nTotal of Socks plus Tax %.2f",totalSockCostTax$); //print total of socks purchase with tax
        
        System.out.printf("\nTotal before tax for Glasses is %.2f",preTaxTotalGlassCost$); //print total of glasses without tax
        System.out.printf("\nTax on Glasses %.2f",taxGlassCost$); //print tax on glasses purchased
        System.out.printf("\nTotal of Glasses plus Tax %.2f",totalGlassCostTax$); //print total of glasses purchase with tax
        
        System.out.println("\nTotal before tax for Envelopes is "+preTaxTotalEnvelopeCost$); //print total of envelopes without tax
        System.out.printf("\nTax on Envelopes %.2f",taxEnvelopeCost$); //print tax on envelopes purchase
        System.out.printf("\nTotal of Envelopes plus Tax %.2f",totalEnvelopeCostTax$); //print total of envelopes purchase with tax
    
        System.out.println("\nPre-tax total of all items "+preTaxTotalAll$); //print total of all items without tax
        System.out.printf("\nTax on total %.2f",itemsTotalTax$); //print tax on total of all items purchased
        System.out.printf("\nTotal with tax %.2f",totalAllTax$); //print total of all purchases with tax
        
    }

}