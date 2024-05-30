public class Eleccion {
    public static String getString(int cambio) {
        return switch (cambio) {
            case 1 -> "USD/MXN";
            case 2 -> "MXN/USD";
            case 3 -> "EUR/USD";
            case 4 -> "USD/EUR";
            case 5 -> "EUR/MXN";
            case 6 -> "MXN/EUR";
            case 7 -> "CAD/MXN";
            case 8 -> "MXN/CAD";
            default -> "";
        };
    }
}

