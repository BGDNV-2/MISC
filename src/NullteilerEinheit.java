
public class NullteilerEinheit {
    public static void main(String[] args) {

        find(6, 15); // Die erste Zahl ist die Restklasse, die zweite der Modulo

    }

    private static void find(int numClass, int modulo) {
        boolean foundEinheit = false;
        boolean foundNullteiler = false;
        for (int i = 2; i <= modulo - 1; i++) {
            if ((i * numClass) % modulo == 1) {
                System.out.println(i + " ist eine Einheit für " + numClass);
                foundEinheit = true;
            }
            if ((i * numClass) % modulo == 0) {
                System.out.println(i + " ist ein Nullteiler für " + numClass);
                foundNullteiler = true;
            }
        }
        if (foundEinheit && foundNullteiler) {
            System.out.println("Die Restklasse [" +  numClass +  "] ist sowohl Einheit, als auch ein Nullteiler");
        } else if (foundEinheit && !foundNullteiler) {
            System.out.println("Die Restklassse [" + numClass + "] ist eine Einheit");
        } else if (!foundEinheit && foundNullteiler) {
            System.out.println("Die Restklasse [" + numClass + "] ist ein Nullteiler");
        } else {
            System.out.println("Die Restklasse [" + numClass + "] ist weder Einheit, noch Nullteiler");
        }
    }





}