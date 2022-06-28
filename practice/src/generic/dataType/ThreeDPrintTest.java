package generic.dataType;

import generic.dataType.Powder;
import generic.dataType.ThreeDPrinter3;

public class ThreeDPrintTest {
    public static void main(String[] args) {
        Powder powder = new Powder();
        ThreeDPrinter3 printer = new ThreeDPrinter3();

        printer.setMaterial(powder);

        Powder p = (Powder) printer.getMaterial();
    }
}
