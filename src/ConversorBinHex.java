public class ConversorBinHex {

    private final String[] binarioHexadecimal = {
            "0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"
    };

    private final char[] hexadecimales = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };

    public String convertirBinarioAHexadecimal(String binario) {

        while (esMultiploDe(binario.length(), 4)) {
            binario = "0" + binario;
        }

        StringBuilder hexadecimal = new StringBuilder();

        for (int i = 0; i < binario.length(); i += 4) {
            String grupo = binario.substring(i, i + 4);
            for (int j = 0; j < binarioHexadecimal.length; j++) {
                if (binarioHexadecimal[j].equals(grupo)) {
                    hexadecimal.append(hexadecimales[j]);
                    break;
                }
            }
        }
        return hexadecimal.toString();
    }

    private static boolean esMultiploDe(int numero, int divisor) {
        return numero % divisor != 0;
    }

    public String convertirHexadecimalABinario(String hexadecimal) {
        StringBuilder binario = new StringBuilder();

        for (int i = 0; i < hexadecimal.length(); i++) {
            char hexChar = hexadecimal.charAt(i);
            for (int j = 0; j < hexadecimales.length; j++) {
                if (hexChar == hexadecimales[j]) {
                    binario.append(binarioHexadecimal[j]);
                    break;
                }
            }
        }
        return binario.toString();
    }
}

