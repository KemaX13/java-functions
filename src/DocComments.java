public class DocComments {

    //Para documentar un método se toman en cuenta, el nombre de la función, los parámetros con su tipo de dato, lo que devuelve con su tipo de dato y lo que hace la función. Mira estos ejemplos y resuelve el ejercicio final. 
    
    //Si escribes primero la función y luego sobre ella escribes /** */ te saldrá automáticamente la plantilla de documentación.
    
    public static void main(String[] args) {
        greeting();
        greetingCoder("Cris", 165, 58);
        double bmi = calculateBodyMassIndex(1.65, 58);
        System.out.println(bmi);

        //Ejecuta el nuevo método
        String result = classifyBMI(bmi);
        System.out.println(STR."Resultado: \{result}");
    }

    /**
     * Function name: greeting
     * <p>
     * Inside the function:
     * 1. prints "Hola Coder"
     * 
     */
    public static void greeting(){
        System.out.println("Hola Coder");
    }

    /**
     * Function name: greetingCoder
     * 
     * @param name (String)
     * @param height (double)
     * @param weight (double)
     * <p>
     * Inside the function:
     * 1. print the name the height and the weight as part of a text
     */

    public static void greetingCoder(String name, double height, double weight){
        System.out.println(STR."Hola mi nombre es \{name} mido \{height} cm y peso \{weight} kg");
    }

    /**
     * Function name: calculateBodyMassIndex
     * 
     * @param height (double)
     * @param weight (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. calculates the weight in kilograms by the squared height in meters and return it.
     */

    public static double calculateBodyMassIndex(double height, double weight){
        double bmi = weight / Math.pow(height, 2);
        return bmi;
    }

    //Escribe una función que con el índice de masa corporal devuelva un String con los resultados y documéntala:
    
    /* Clasificación índice de masa corporal rango - kg/m2
    Delgadez severa	< 16
    Delgadez moderada	16 - 17
    Delgadez leve	17 - 18.5
    Normal	18.5 - 25
    Sobrepeso	25 - 30
    Obeso Clase I	30 - 35
    Obeso Clase II	35 - 40
    Obeso Clase III	> 40 */

    /**
     * Function name: classifyIMC
     *
     * @param bmi (double)
     * @return (String)
     *
     * Inside the function:
     * Dependiendo del imc indica el resultado de la condición física.
     */
    public static String classifyBMI(double bmi) {
        if (bmi < 16) {
            return "Delgadez severa";
        } else if (bmi >= 16 && bmi < 17) {
            return "Delgadez moderada";
        } else if (bmi >= 17 && bmi < 18.5) {
            return "Delgadez leve";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 30) {
            return "Sobrepeso";
        } else if (bmi >= 30 && bmi < 35) {
            return "Obeso Clase I";
        } else if (bmi >= 35 && bmi < 40) {
            return "Obeso Clase II";
        } else {
            return "Obeso Clase III";
        }
    }
}
