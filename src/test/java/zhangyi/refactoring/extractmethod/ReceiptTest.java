package zhangyi.refactoring.extractmethod;

import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReceiptTest {

    @Test
    public void calculate_grand_total_without_discount() {
        Receipt receipt = new Receipt();
        receipt.addItemTotal(400d);
        receipt.addItemTotal(600d);
        double grandTotal = receipt.calculateGrandTotal();
        assertThat(grandTotal).isEqualTo(1065d);
    }

    @Test
    public void calculate_grand_total_with_discount() {
        Receipt receipt = new Receipt();
        receipt.addItemTotal(400d);
        receipt.addItemTotal(600d);
        receipt.addItemTotal(200d);
        receipt.addDiscount(200d);
        double grandTotal = receipt.calculateGrandTotal();
        assertThat(grandTotal).isEqualTo(1065d);
    }
}