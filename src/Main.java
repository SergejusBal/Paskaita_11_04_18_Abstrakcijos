import Coverter.*;
import MathOperation.MathOperation;
import Predicate.*;
import SortInteger.*;
import SortText.*;
import StringOperation.*;
import Transformer.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        ///////////////////////////////////////////////////////////////////////////////////
        //////////////////////// 1 Uzduotis

        System.out.println();
        System.out.println("1 uzduotis");
        System.out.println();

        int x = 5;
        int y = 5;

        MathOperation sudeti = new MathOperation(){
            @Override
            public int operate(int a, int b) {
                return a+b;
            }
        };

        MathOperation atimti = new MathOperation(){
            @Override
            public int operate(int a, int b) {
                return a-b;
            }
        };
        MathOperation padauginti = new MathOperation(){
            @Override
            public int operate(int a, int b) {
                return a*b;
            }
        };
        MathOperation padalinti = new MathOperation(){
            @Override
            public int operate(int a, int b) {
                return a/b;
            }
        };

        System.out.println("Vertes: " + "x = " + x + "  y = " + y);
        System.out.println("Suma: " + (sudeti.operate(5,5)));
        System.out.println("Atimti: " + (atimti.operate(5,5)));
        System.out.println("Pagauginti: " + (padauginti.operate(5,5)));
        System.out.println("Padalinti: " + (padalinti.operate(5,5)));


        ///////////////////////////////////////////////////////////////////////////////////
        //////////////////////// 2 Uzduotis

        System.out.println();
        System.out.println("2 uzduotis");
        System.out.println();

        Random random = new Random();

        List<Integer> integersList = new ArrayList<>();

        for(int i = 0 ; i < 20; i++) integersList.add(random.nextInt(0,10000));

        List<Double> sumPairs = new ArrayList<>();
        List<Double> substractPairs = new ArrayList<>();
        List<Double> multiplyPairs = new ArrayList<>();
        List<Double> devidePairs = new ArrayList<>();

        for(int i = 0; i < integersList.size()-1; i+=2){
            int iteruoti = i%8;
            switch (iteruoti){
                case 0:
                    sumPairs.add((double) sudeti.operate(integersList.get(i),integersList.get(i+1)));
                    break;
                case 2:
                    substractPairs.add((double) atimti.operate(integersList.get(i),integersList.get(i+1)));
                    break;
                case 4:
                    multiplyPairs.add((double) padauginti.operate(integersList.get(i),integersList.get(i+1)));
                    break;
                case 6:
                    devidePairs.add((double) padalinti.operate(integersList.get(i),integersList.get(i+1)));
                    break;
            }
        }

        System.out.println("Atsitiktines vertes: " + integersList);
        System.out.println("Sumos: " + sumPairs);
        System.out.println("Atimtys: " + substractPairs);
        System.out.println("Daugybos: " + multiplyPairs);
        System.out.println("Dalybos: " + devidePairs);

        ///////////////////////////////////////////////////////////////////////////////////
        //////////////////////// 3 Uzduotis

        System.out.println();
        System.out.println("3 uzduotis");
        System.out.println();

        StringOperation uppercase = new StringOperationUpperCase();
        StringOperation lowercase = new StringOperationLowerCase();
        StringOperation reversed = new StringOperationReverse();

        String kintamasis = "Labas";
        System.out.println("Test: " + kintamasis);
        System.out.println(uppercase.manipulate(kintamasis));
        System.out.println(lowercase.manipulate(kintamasis));
        System.out.println(reversed.manipulate(kintamasis));


        ///////////////////////////////////////////////////////////////////////////////////
        //////////////////////// 4 Uzduotis

        System.out.println();
        System.out.println("4 uzduotis");
        System.out.println();

        List<String> savaitesDienos = new ArrayList<>();
        savaitesDienos.add("Pirmadienis");
        savaitesDienos.add("Antradienis");
        savaitesDienos.add("Trečiadienis");
        savaitesDienos.add("Ketvirtadienis");
        savaitesDienos.add("Penktadienis");
        savaitesDienos.add("Šeštadienis");
        savaitesDienos.add("Sekmadienis");


        List<String> uppercaseWords = new ArrayList<>();
        List<String> lowercaseWords = new ArrayList<>();
        List<String> reversedWords = new ArrayList<>();

        for(int i = 0; i < savaitesDienos.size(); i++){
            int iteruoti = i%3;
            switch (iteruoti){
                case 0:
                    uppercaseWords.add(uppercase.manipulate(savaitesDienos.get(i)));
                    break;
                case 1:
                    lowercaseWords.add(lowercase.manipulate(savaitesDienos.get(i)));
                    break;
                case 2:
                    reversedWords.add(reversed.manipulate(savaitesDienos.get(i)));
                    break;
            }
        }

        System.out.println("String vertes: " + savaitesDienos);
        System.out.println("LowerCase: " + uppercaseWords);
        System.out.println("UpperCase: " + lowercaseWords);
        System.out.println("ReverseOrder: " + reversedWords);


        ///////////////////////////////////////////////////////////////////////////////////
        //////////////////////// 5 Uzduotis

        System.out.println();
        System.out.println("5 uzduotis");
        System.out.println();

        Predicate arLyginis = new ArLyginis();
        Predicate arTeigiamas = new ArTeigiamas();
        Predicate arPirminis = new Pirminis();

        int skaicius = 11;
        System.out.println("Test skaicius: " + skaicius);
        System.out.println("Ar lyginis: " + arLyginis.test(skaicius));
        System.out.println("Ar teigiamas: " + arTeigiamas.test(skaicius));
        System.out.println("Ar pirminis: " + arPirminis.test(skaicius));


        ///////////////////////////////////////////////////////////////////////////////////
        //////////////////////// 6 Uzduotis

        System.out.println();
        System.out.println("6 uzduotis");
        System.out.println();

        List<Integer> predicateIntegersList = new ArrayList<>();
        for(int i = 0 ; i < 20; i++) predicateIntegersList.add(random.nextInt(-100,100));

        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> positiveNumbers = new ArrayList<>();
        List<Integer> negativeNumbers = new ArrayList<>();
        List<Integer> primaryNumbers = new ArrayList<>();
        List<Integer> notPrimaryNumbers  = new ArrayList<>();

        for(int i = 0; i < predicateIntegersList.size(); i++){
            if(arLyginis.test(predicateIntegersList.get(i))) evenNumbers.add(predicateIntegersList.get(i));
            else oddNumbers.add(predicateIntegersList.get(i));

            if(arTeigiamas.test(predicateIntegersList.get(i))) positiveNumbers.add(predicateIntegersList.get(i));
            else negativeNumbers.add(predicateIntegersList.get(i));

            if(arPirminis.test(predicateIntegersList.get(i))) primaryNumbers.add(predicateIntegersList.get(i));
            else notPrimaryNumbers.add(predicateIntegersList.get(i));

        }

        System.out.println("Skaiciai: " + predicateIntegersList);
        System.out.println("Lyginiai: " + evenNumbers);
        System.out.println("Nelyginiai: " + oddNumbers);
        System.out.println("Teigismi: " + positiveNumbers);
        System.out.println("Neigiami: " + negativeNumbers);
        System.out.println("Pirminis: " + primaryNumbers);
        System.out.println("Nepirminis: " + notPrimaryNumbers);

        ///////////////////////////////////////////////////////////////////////////////////
        //////////////////////// 7 Uzduotis

        System.out.println();
        System.out.println("7 uzduotis");
        System.out.println();

        Converter feetToMeter = new FeetMeterConverter();
        Converter farenheitToCelcius = new FarenheitCelciusConverter();

        double testskaicius = 64.0;

        System.out.println("Testas: " + testskaicius);
        System.out.println("feetToMeter: " + feetToMeter.convert(testskaicius));
        System.out.println("farenheitToCelcius: " + farenheitToCelcius.convert(testskaicius));

        ///////////////////////////////////////////////////////////////////////////////////
        //////////////////////// 8 Uzduotis

        System.out.println();
        System.out.println("8 uzduotis");
        System.out.println();

        List<Integer> convertIntegersList = new ArrayList<>();
        for(int i = 0 ; i < 10; i++) convertIntegersList.add(random.nextInt(1,100));

        List<Double> celcei = new ArrayList<>();
        List<Double> metrai = new ArrayList<>();


        for(int i = 0 ; i < convertIntegersList.size(); i++){
            celcei.add(feetToMeter.convert(convertIntegersList.get(i)));
            metrai.add(farenheitToCelcius.convert(convertIntegersList.get(i)));
        }

        System.out.println("Atsitiktiniai skaiciai: " + convertIntegersList);
        System.out.println("I celcius: " + celcei);
        System.out.println("I metrus: " + metrai);


        ///////////////////////////////////////////////////////////////////////////////////
        //////////////////////// 9 Uzduotis

        System.out.println();
        System.out.println("9 uzduotis");
        System.out.println();

        SortText sortText = new SortNaturalOrder();
        List<String> stringList = Arrays.asList("Pirmadienis", "Antradienis","Trečiadienis",
                                                "Ketvirtadienis","Penktadienis","Šeštadienis",
                                                "Sekmadienis");

        System.out.println(stringList);
        sortText.sort(stringList);
        System.out.println("Sorted");
        System.out.println(stringList);


        ///////////////////////////////////////////////////////////////////////////////////
        //////////////////////// 10 Uzduotis

        System.out.println();
        System.out.println("10 uzduotis");
        System.out.println();

        SortInteger sortInteger = new SortIntegerReverseOrder();
        List<Integer> intergerList = Arrays.asList(50,74,458,457,41,74154,454,54,454,447,114,77,11,44,77,7);

        System.out.println(intergerList);
        sortInteger.sort(intergerList);
        System.out.println("Sorted");
        System.out.println(intergerList);

        ///////////////////////////////////////////////////////////////////////////////////
        //////////////////////// 11 Uzduotis

        System.out.println();
        System.out.println("11 uzduotis");
        System.out.println();

        Transformer teanform = new TransformRemoveEmpty();
        List<String> stringWithEmptyList = new ArrayList<>(Arrays.asList("Pirmadienis","    ", "Antradienis", "",
                                                        "Trečiadienis", "  ",  "Ketvirtadienis",
                                                        "  " ,"Penktadienis","",
                                                        "Šeštadienis","    ", "Sekmadienis"));

        System.out.println(stringWithEmptyList);
        teanform.transform(stringWithEmptyList);
        System.out.println("Tranformed");
        System.out.println(stringWithEmptyList);


        ///////////////////////////////////////////////////////////////////////////////////
        //////////////////////// 12 Uzduotis

        System.out.println();
        System.out.println("12 uzduotis");
        System.out.println();






    }
}