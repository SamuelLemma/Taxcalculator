package com.company;
import java.math.BigDecimal;
public class Taxcalc {

    public static void main(String[] args) {
        double priceWithoutVat = 9.99;

        System.out.println("price without Vat:" + priceWithoutVat);

        double priceWithVat = priceWithoutVat + 1.23;
        System.out.println("price with Vat" + priceWithVat);

        double valueWithVat = priceWithVat + 10000;
        System.out.println("value with Vat" + valueWithVat);

        double priceWithoutVat2 = valueWithVat/1.23;
        System.out.println("value without Vat " + priceWithoutVat2);

   //Using the BigDecimal Class
   System.out.println("");
   System.out.println("Same thing after using BigDecimal");

   BigDecimal dbPriceWithoutVat = new BigDecimal("9.99");
   System.out.println("Price without Vat:" + dbPriceWithoutVat);

   BigDecimal dbPriceWithVat = dbPriceWithoutVat.multiply(
        new BigDecimal("1.23"));

        dbPriceWithVat = dbPriceWithVat.setScale( 2, BigDecimal.ROUND_HALF_EVEN);
     System.out.println("price with vat rounded:" + dbPriceWithVat);
     BigDecimal dbValueWithVat = dbPriceWithVat.multiply( new BigDecimal( 1000));
     System.out.println("value with vat:" + dbValueWithVat);

    BigDecimal dbPriceWithoutVat2 = dbValueWithVat.divide(
            new BigDecimal("1.23"),
     BigDecimal.ROUND_HALF_EVEN );
   System.out.println("Value without Vat:" + dbPriceWithoutVat2);
    }
}
