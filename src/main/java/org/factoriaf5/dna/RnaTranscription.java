package org.factoriaf5.dna;

public class RnaTranscription {

   
    public String transcribe(String dna) {
        String rna = ""; // Inicializamos una cadena vacía para el ARN.

 
        for (char base : dna.toCharArray()) {
            switch (base) {
                case 'A': // Adenina en ADN -> Uracilo en ARN
                    rna += 'U';
                    break;
                case 'C': // Citosina en ADN -> Guanina en ARN
                    rna += 'G';
                    break;
                case 'G': // Guanina en ADN -> Citosina en ARN
                    rna += 'C';
                    break;
                case 'T': // Timina en ADN -> Adenina en ARN
                    rna += 'A';
                    break;
                default:
                    // Devolvemos un mensaje de error si se encuentra un carácter no válido.
                    return "Error: base no válida en la secuencia de ADN: " + base;
            }
        }

        return rna;
    }
}
